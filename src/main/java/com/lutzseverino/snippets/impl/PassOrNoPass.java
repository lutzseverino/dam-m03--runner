package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;

import java.util.Scanner;

@Name("pass")
public class PassOrNoPass implements Snippet {

    /*
        START
            SHOW ("¿Cuántos alumnos hay?")
            READ (students)

            FOR (i <- 0 TO students) DO
                SHOW ("Para el alumno nº" + i)

                SHOW ("Introduce la nota de los ejercicios entregables: ")
                READ (exercises)
                SHOW ("Introduce la nota de los POUS evaluables: ")
                READ (pous)
                SHOW ("Introduce la nota del examen final: ")
                READ (finalExam)
                SHOW ("Introduce la nota de la práctica final: ")
                READ (finalEssay)

                average <- (exercises * 0.10) + (pous * 0.20) + (finalExam * 0.40) + (finalEssay * 0.30)

                IF (average >= 5) THEN
                    SHOW ("Aprobado")
                ELSE THEN
                    SHOW ("Suspenso")
                END IF
            END FOR
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos alumnos hay?: ");
        int students = scanner.nextInt();

        for (int i = 0; i < students; i++) {
            System.out.println("Para el alumno nº" + (i + 1));

            System.out.print("Introduce la nota de los ejercicios entregables: ");
            double exercises = scanner.nextDouble();

            System.out.print("Introduce la nota de los POUS evaluables: ");
            double pous = scanner.nextDouble();

            System.out.print("Introduce la nota del examen final: ");
            double finalExam = scanner.nextDouble();

            System.out.print("Introduce la nota de la práctica final: ");
            double finalEssay = scanner.nextDouble();

            double average = (exercises * 0.10) + (pous * 0.20) + (finalExam * 0.40) + (finalEssay * 0.30);

            System.out.print("\n");
            System.out.println(average >= 5 ? "Aprobado" : "Suspenso");
        }

    }
}
