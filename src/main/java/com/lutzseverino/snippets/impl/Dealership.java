package com.lutzseverino.snippets.impl;

import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

public class Dealership implements Snippet {

    /*
        START
            SHOW ("Introduce el salario base")
            READ (baseSalary)

            FOR (i <- 1 TO 3) DO
                SHOW ("Introduce el importe de la venta " + i)
                READ (sale)

                commission <- sale * (10 / 100)
                totalCommission <- totalCommission + commission
            END FOR

            totalSalary <- baseSalary + totalCommission

            SHOW ("El salario total es de " + totalSalary + "€.")
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el salario base: ");
        double baseSalary = scanner.nextDouble();

        double totalCommission = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el importe de la venta " + (i + 1) + ": ");
            double sale = scanner.nextDouble();

            double commission = sale * 10 / 100;
            totalCommission += commission;
        }

        double totalSalary = baseSalary + totalCommission;

        System.out.println("\nEl salario total es de " + totalSalary + "€.");
    }
}
