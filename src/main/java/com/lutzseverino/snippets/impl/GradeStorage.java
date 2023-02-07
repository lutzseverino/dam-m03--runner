package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

import java.util.ArrayList;
import java.util.List;

public class GradeStorage implements Snippet {
    private final List<Float> grades = new ArrayList<>();
    private final Question question = new Question();

    @Override
    public void run() {
        loop:
        while (true) {
            System.out.println("¿Qué quieres hacer?\n" +
                    "\t1. Añadir nota\n" +
                    "\t2. Eliminar nota\n" +
                    "\t3. Ver nota en índice\n" +
                    "\t4. Establecer nota en índice\n" +
                    "\t5. Ver notas\n" +
                    "\t6. Salir");

            int option = question.askInt("Introduce una opción: ");

            switch (option) {
                case 1:
                    addGrade();
                    break;
                case 2:
                    removeGrade(question.askInt("Introduce el índice: ", i -> i >= 0 && i < grades.size()));
                    break;
                case 3:
                    getGrade(question.askInt("Introduce el índice: ", i -> i >= 0 && i < grades.size()));
                    break;
                case 4:
                    setGrade(
                            question.askInt("Introduce el índice: ", i -> i >= 0 && i < grades.size()),
                            question.askFloat("Introduce la nota: ", f -> f >= 0 && f <= 10));
                    break;
                case 5:
                    showGrades();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break loop;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private void setGrade(int index, float grade) {
        grades.set(index, grade);
    }

    private void getGrade(int index) {
        System.out.println("Nota: " + grades.get(index));
    }

    private void removeGrade(int index) {
        grades.remove(index);
    }


    private void showGrades() {
        System.out.println("Notas:");
        grades.forEach(System.out::println);
    }

    private void addGrade() {
        float grade = question.askFloat("Introduce la nota: ", f -> f >= 0 && f <= 10);
        grades.add(grade);
    }
}
