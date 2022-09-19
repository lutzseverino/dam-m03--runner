package com.lutzseverino.snippets;

import com.lutzseverino.annotation.IncludeClassName;
import com.lutzseverino.annotation.Name;

@Name("exit")
@IncludeClassName
public class Terminate implements Snippet {

    @Override
    public void run() {
        System.out.println("Saliendo del programa...");
        System.exit(0);
    }

}
