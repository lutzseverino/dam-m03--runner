package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

@Name("negative") @Name("loop")
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
        int number = -1;

        while (number < 0 || number > 10) {
            System.out.print("Introduce un número entre el 0 y el 10 entre para salir: ");
            number = new Scanner(System.in).nextInt();
        }
    }
}
