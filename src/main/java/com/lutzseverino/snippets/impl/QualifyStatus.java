package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

@Name("qualify")
public class QualifyStatus implements Snippet {

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
        Question question = new Question();

        System.out.println();
        int students = question.askInt("¿Cuántos alumnos hay?: ");

        for (int i = 0; i < students; i++) {
            System.out.println("Para el alumno nº" + (i + 1));

            float exercises = question.askFloat("Introduce la nota de los ejercicios entregables: ");
            float pous = question.askFloat("Introduce la nota de los POUS evaluables: ");
            float finalExam = question.askFloat("Introduce la nota del examen final: ");
            float finalEssay = question.askFloat("Introduce la nota de la práctica final: ");
            float average = (exercises * 0.10f) + (pous * 0.20f) + (finalExam * 0.40f) + (finalEssay * 0.30f);

            System.out.print("\n");
            System.out.println(average >= 5 ? "Aprobado" : "Suspenso");
        }
    }
}
