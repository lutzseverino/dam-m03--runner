package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

public class SchoolAgenda implements Snippet {

    @Override public void run() {
        String[][] agenda = new String[2][5];
        String[] weekDays = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String[] turns = {"Mañana", "Tarde"};

        agenda[0][0] = "Matemáticas";
        agenda[0][1] = "Catalán";
        agenda[0][2] = "Castellano";
        agenda[0][3] = "Inglés";
        agenda[0][4] = "Ed. Física";

        agenda[1][0] = "Geografía";
        agenda[1][1] = "Ciencia";
        agenda[1][2] = "Tecnología";
        agenda[1][3] = "Ed. Plástica";
        agenda[1][4] = "";

        Question question = new Question();

        outer:
        while (true) {
            int option = question.askInt("Escoge una opción: \n" +
                    "\t1. Ver la agenda de la semana \n" +
                    "\t2. Ver la agenda de mañanas o tardes \n" +
                    "\t3. Ver la agenda de un día \n" +
                    "\t4. Modificar la asignatura de un día \n" +
                    "\t5. Salir \n" +
                    "> ");

            switch (option) {
                case 1:
                    System.out.printf("%15s", "");
                    for (String weekDay : weekDays) System.out.printf("%15s", weekDay);

                    System.out.printf("%n%15s", "Mañanas");
                    for (int i = 0; i < 5; i++) System.out.printf("%15s", agenda[0][i]);

                    System.out.printf("%n%15s", "Tardes");
                    for (int i = 0; i < 5; i++) System.out.printf("%15s", agenda[1][i]);

                    System.out.println("\n");
                    break;
                case 2:
                    int turn = askTurn(question);

                    System.out.printf("%15s", "");
                    for (String weekDay : weekDays) System.out.printf("%15s", weekDay);

                    System.out.printf("%n%15s", turns[turn]);
                    for (int i = 0; i < 5; i++) System.out.printf("%15s", agenda[turn - 1][i]);

                    System.out.println("\n");
                    break;
                case 3:
                    int day = askDay(question);

                    System.out.printf("%15s", "");
                    System.out.printf("%15s", weekDays[day - 1]);

                    System.out.printf("%n%15s", "Mañanas");
                    System.out.printf("%15s", agenda[0][day - 1]);

                    System.out.printf("%n%15s", "Tardes");
                    System.out.printf("%15s", agenda[1][day - 1]);

                    System.out.println("\n");
                    break;
                case 4:
                    int dayToModify = askDay(question);
                    int turnToModify = askTurn(question);

                    String subject = question.ask("¿Qué asignatura quieres poner?: ");
                    agenda[turnToModify - 1][dayToModify - 1] = subject;

                    break;
                case 5:
                    break outer;
            }
        }
    }

    private int askDay(Question question) {
        return question.askInt("¿Qué día?" + "\n" +
                "\t1. Lunes \n" +
                "\t2. Martes \n" +
                "\t3. Miércoles \n" +
                "\t4. Jueves \n" +
                "\t5. Viernes \n" +
                "> ", integer -> integer >= 1 && integer <= 5);
    }

    private int askTurn(Question question) {
        return question.askInt("¿Qué turno?" + "\n" +
                "\t1. Mañana \n" +
                "\t2. Tarde \n" +
                "> ", integer -> integer == 1 || integer == 2);
    }
}
