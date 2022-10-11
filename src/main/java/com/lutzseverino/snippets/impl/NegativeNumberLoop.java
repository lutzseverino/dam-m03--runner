package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("negative")
public class NegativeNumberLoop implements Snippet {

    /*
        START
            number <- 0

            WHILE (number < 0 OR number > 10) DO
                SHOW ("Introduce un número entre el 0 y el 10 entre para salir.")
                READ (number)
            END WHILE
        END
     */
    @Override public void run() {
        new Question().askInt("Introduce un número entre el 0 y el 10 para salir: ", (i) -> i >= 0 && i <= 10);
    }
}
