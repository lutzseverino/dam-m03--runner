package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

@Name("percentage") @Name("class")
public class MaleFemalePercentage implements Snippet {

    /*
        START
            SHOW ("¿Cuántos hombres hay?")
            READ (males)

            SHOW ("¿Cuántas mujeres hay?")
            READ (females)

            total <- males + females

            malePercentage <- males / total * 100
            femalePercentage <- females / total * 100

            SHOW ("El " + femalePercentage + "% de la clase son hombres.")
            SHOW ("El " + malePercentage + "% de la clase son mujeres.")
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos hombres hay?: ");
        int males = scanner.nextInt();

        System.out.print("¿Cuántas mujeres hay?: ");
        int females = scanner.nextInt();

        int total = males + females;

        // calculate percentages
        double malePercentage = (double) males / total * 100;
        double femalePercentage = (double) females / total * 100;

        // print results
        System.out.println("\nEl " + malePercentage + "% de la clase son hombres.");
        System.out.println("El " + femalePercentage + "% de la clase son mujeres.");
    }

}
