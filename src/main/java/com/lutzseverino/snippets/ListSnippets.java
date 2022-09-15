package com.lutzseverino.snippets;

import com.lutzseverino.SnippetRunner;
import com.lutzseverino.annotation.Name;

@Name("list")
public class ListSnippets implements Snippet {

    @Override
    public void run() {
        SnippetRunner.getInstance().getRegistry().getSnippets().keySet().forEach(x -> System.out.println("    - " + x));
    }

}
