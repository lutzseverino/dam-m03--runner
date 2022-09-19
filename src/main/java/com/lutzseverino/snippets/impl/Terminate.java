package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.IncludeClassName;
import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

@Name("exit")
@IncludeClassName
public class Terminate implements Snippet {

    @Override
    public void run() {
        System.out.println("Saliendo del programa...");
        System.exit(0);
    }

}
