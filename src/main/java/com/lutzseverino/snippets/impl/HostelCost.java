package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("hostel")
public class HostelCost implements Snippet {

    /*
        START
            SHOW ("Introduce el número de personas")
            READ (people)

            SHOW ("Introduce el número de días")
            READ (days)

            totalCost <- people * days * 20

            SHOW ("¿Quieres desayuno y comida? (s/n)")
            READ (halfBoard)

            IF (halfBoard) THEN
                SHOW ("Introduce el número de días de desayuno y comida")
                READ (halfBoardDays)

                totalCost <- totalCost + (people * halfBoardDays * 20)

                WHILE (halfBoardDays > days) DO
                    SHOW ("El número de días de desayuno y comida no puede ser mayor que el número de días de estancia.")
                    READ (halfBoardDays)
                END WHILE
            END IF

            SHOW ("¿Quieres salir más tarde? (s/n)")
            READ (lateCheckout)

            IF (lateCheckout) THEN
                totalCost <- totalCost + (people * days * 15)
            END IF
        END
     */
    @Override public void run() {
        Question question = new Question();

        int people = question.askInt("Introduce el número de personas: ");
        int days = question.askInt("Introduce el número de días: ");
        int totalCost = people * days * 20;
        boolean halfBoard = question.askBoolean("¿Quieres desayuno y comida? (true/false): ");

        if (halfBoard) {
            int halfBoardDays = question.askInt("Introduce el número de días de desayuno y comida: ");

            totalCost += people * halfBoardDays * 20;

            while (halfBoardDays > days) {
                halfBoardDays = question.askInt("El número de días de desayuno y comida no puede ser mayor que el número de días de estancia ");
            }
        }

        boolean lateCheckout = question.askBoolean("¿Quieres salir más tarde? (true/false): ");

        if (lateCheckout) totalCost += people * days * 15;

        System.out.println("\nEl coste total es de " + totalCost + "€");
    }
}
