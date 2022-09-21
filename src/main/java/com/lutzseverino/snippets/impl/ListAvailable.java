package com.lutzseverino.snippets.impl;

import com.lutzseverino.SnippetRunner;
import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

@Name("list")
public class ListAvailable implements Snippet {

    @Override
    public void run() {
        SnippetRunner.getInstance().getRegistry().getSnippets().keySet().forEach(x -> System.out.println("    - " + x));
    }

}
