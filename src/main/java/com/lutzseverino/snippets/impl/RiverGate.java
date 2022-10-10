package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("river") @Name("girona")
public class RiverGate implements Snippet {

    /*
        START
            SHOW ("¿Cuántos litros de agua por metro cuadrado han llovido?")
            READ (litersPerSquareMeter)

            doorIsOpen <- litersPerSquareMeter > 90

            IF doorIsOpen THEN
                SHOW ("La puerta está abierta.")
            ELSE
                SHOW ("La puerta está cerrada.")
            END IF
        END
     */
    @Override public void run() {
        Question question = new Question();

        int litersPerSquareMeter = question.askInt("¿Cuántos litros de agua por metro cuadrado han llovido?: ");
        boolean isDoorOpen = litersPerSquareMeter > 90;

        System.out.print("\n");
        System.out.println(isDoorOpen ? "La puerta está abierta." : "La puerta está cerrada.");
    }
}
