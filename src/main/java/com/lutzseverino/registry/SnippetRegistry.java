package com.lutzseverino.registry;

import com.lutzseverino.annotation.IncludeClassName;
import com.lutzseverino.annotation.Name;
import com.lutzseverino.annotation.Names;
import com.lutzseverino.snippets.Snippet;

import java.util.*;

public class SnippetRegistry {
    private final Map<String, Snippet> snippets = new HashMap<>();

    public void registerAlgorithms(Snippet... registered) {
        for (Snippet algorithm : registered)
            inspectNames(algorithm).forEach(name -> snippets.put(name, algorithm));
    }

    public Optional<Snippet> getSnippet(String name) {
        return Optional.ofNullable(snippets.get(name));
    }

    public Map<String, Snippet> getSnippets() {
        return snippets;
    }

    private List<String> inspectNames(Snippet snippet) {
        List<String> names = new ArrayList<>();
        Class<? extends Snippet> clazz = snippet.getClass();

        if (clazz.isAnnotationPresent(Names.class)) {
            Names namesAnnotation = clazz.getAnnotation(Names.class);
            for (Name name : namesAnnotation.value())
                names.add(name.value());
        } else if (clazz.isAnnotationPresent(Name.class)) {
            Name nameAnnotation = clazz.getAnnotation(Name.class);
            names.add(nameAnnotation.value());
        }

        if (names.isEmpty() || clazz.isAnnotationPresent(IncludeClassName.class))
            names.add(clazz.getSimpleName());

        names.replaceAll(String::toLowerCase);

        return names;
    }
}
