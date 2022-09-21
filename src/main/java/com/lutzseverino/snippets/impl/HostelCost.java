package com.lutzseverino.snippets.impl;

import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de personas: ");
        int people = scanner.nextInt();

        System.out.print("Introduce el número de días: ");
        int days = scanner.nextInt();

        int totalCost = people * days * 20;

        System.out.print("¿Quieres desayuno y comida? (s/n): ");
        boolean halfBoard = scanner.next().equals("s");

        if (halfBoard) {
            System.out.print("Introduce el número de días de desayuno y comida: ");
            int halfBoardDays = scanner.nextInt();

            totalCost += people * halfBoardDays * 20;

            while (halfBoardDays > days) {
                System.out.print("El número de días de desayuno y comida no puede ser mayor que el número de días de estancia ");
                halfBoardDays = scanner.nextInt();
            }
        }

        System.out.print("¿Quieres salir más tarde? (s/n): ");
        boolean lateCheckout = scanner.next().equals("s");

        if (lateCheckout) totalCost += people * days * 15;

        System.out.println("El coste total es de " + totalCost + "€");
    }
}
