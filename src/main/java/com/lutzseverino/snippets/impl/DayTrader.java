package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

@Name("trade")
public class DayTrader implements Snippet {

    /*
        START
            SHOW ("¿Cuánto quieres invertir?")
            READ (investment)

            SHOW ("¿El mercado está oscilando hacia arriba o hacia abajo?")
            READ (direction)

            IF (direction) THEN
                profit <- investment * (2 / 100)
            ELSE
                profit <- investment * (-2 / 100)
            END IF

            SHOW ("El beneficio es de " + profit + "€.")
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuánto quieres invertir?: ");
        double investment = scanner.nextDouble();

        System.out.print("¿Oscila para arriba o para abajo? (s/n): ");
        boolean oscillation = scanner.next().equals("s");

        double profit = investment * (oscillation ? 2 : -2) / 100;

        System.out.println("\nEl beneficio es de " + profit + "€.");
    }
}
