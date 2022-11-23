package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

import java.util.Arrays;

public class Matrixes implements Snippet {

    @Override public void run() {
        Question question = new Question();

        int answer = question.askInt("¿Qué matriz quieres ejecutar? (1-8): ", integer -> integer >= 1 && integer <= 8);

        switch (answer) {
            case 1:
                matrix1();
                break;
            case 2:
                matrix2();
                break;
            case 3:
                matrix3();
                break;
            case 4:
                matrix4();
                break;
            case 5:
                matrix5();
                break;
            case 6:
                matrix6();
                break;
            case 7:
                matrix7();
                break;
            case 8:
                matrix8();
                break;
        }
    }

    private int[] askLength() {
        Question question = new Question();

        int lines = question.askInt("¿Con cuántas líneas?: ");
        int columns = question.askInt("¿Y cuántas columnas?: ");

        return new int[]{lines, columns};
    }

    /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
     */
    private void matrix1() {
        int[] length = askLength();
        int[][] matrix = new int[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = j + 1;
        }

        for (int[] is : matrix) {
            for (int i : is) System.out.printf("%-2s", i);
            System.out.println();
        }
    }

    /*
        1    2    3    4    5
        6    7    8    9    10
        11   12   13   14   15
        16   17   18   19   20
        21   22   23   24   25
     */
    private void matrix2() {
        int[] length = askLength();
        int[][] matrix = new int[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = (i * matrix[i].length) + j + 1;
        }

        for (int[] is : matrix) {
            for (int i : is) System.out.printf("%-5s", i);
            System.out.println();
        }
    }

    /*
        true   false  false  false  false
        false  true   false  false  false
        false  false  true   false  false
        false  false  false  true   false
        false  false  false  false  true
     */
    private void matrix3() {
        int[] length = askLength();
        boolean[][] matrix = new boolean[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = i == j;
        }

        for (boolean[] bs : matrix) {
            for (boolean b : bs) System.out.printf("%-7s", b);
            System.out.println();
        }
    }

    /*
        A B A B A
        A B A B A
        A B A B A
        A B A B A
        A B A B A
     */
    private void matrix4() {
        int[] length = askLength();
        char[][] matrix = new char[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = j % 2 == 0 ? 'A' : 'B';
        }

        for (char[] cs : matrix) {
            for (char c : cs) System.out.printf("%-2s", c);
            System.out.println();
        }
    }

    /*
        25   24   23   22   21
        20   19   18   17   16
        15   14   13   12   11
        10   9    8    7    6
        5    4    3    2    1
     */
    private void matrix5() {
        int[] length = askLength();
        int[][] matrix = new int[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (matrix[i].length * matrix.length) - ((i * matrix[i].length) + j);
        }

        for (int[] is : matrix) {
            for (int i : is) System.out.printf("%-5s", i);
            System.out.println();
        }
    }

    /*
        true   false  true   false  true
        false  true   false  true   false
        true   false  true   false  true
        false  true   false  true   false
        true   false  true   false  true
     */
    private void matrix6() {
        int[] length = askLength();
        boolean[][] matrix = new boolean[length[0]][length[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2 == 0;
            }
        }

        for (boolean[] bs : matrix) {
            for (boolean b : bs) System.out.printf("%-7s", b);
            System.out.println();
        }
    }

    /*
        X X X X X
        0 X 0 0 0
        0 0 X 0 0
        0 0 0 X 0
        X X X X X
     */
    public void matrix7() {
        int[] length = askLength();
        int[][] matrix = new int[length[0]][length[1]];

        int track = -1;
        for (int i = 0; i < matrix.length; i++) {
            track = (track == (matrix[i].length - 2)) ? 0 : (track + 1);

            if (i % (matrix[i].length - 1) == 0) Arrays.fill(matrix[i], 1);
            else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j == track ? 1 : 0;
                }
            }
        }

        for (int[] is : matrix) {
            for (int i : is) System.out.printf("%-2s", i);
            System.out.println();
        }
    }

    private void matrix8() {
        Question question = new Question();
        String name = question.ask("¿Cuál es tu nombre?: ").toUpperCase();

        char[][] matrix = new char[name.length()][name.length()];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) matrix[i][j] = name.charAt(i);
                else matrix[i][j] = (char) (Math.random() * 26 + 'A');
            }
        }

        for (char[] cs : matrix) {
            for (char c : cs) System.out.printf("%-3s", (int) c);
            System.out.println();
        }

        for (char[] cs : matrix) {
            for (char c : cs) System.out.printf("%-2s", c);
            System.out.println();
        }
    }

}
