package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

@Name("water")
public class WaterCost implements Snippet {

    /*
        START
            SHOW ("Introduce el consumo de agua en litros: ")
            READ (liters)

            fixedFee <- 6
            variableFee <- 0

            IF liters < 200 THEN
                variableFee <- 0.15
            ELSE
                variableFee <- 0.30
            END IF

            totalFee <- fixedFee + (variableFee * liters)

            SHOW ("El coste total es de " + totalFee + "€.")
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el consumo de agua en litros: ");
        int liters = scanner.nextInt();

        double fixedFee = 6;
        double variableFee = liters > 50 ? liters < 200 ? 0.15 : 0.30 : 0;
        double totalFee = fixedFee + (variableFee * liters);

        System.out.println("El coste total es de " + totalFee + "€.");
    }
}
