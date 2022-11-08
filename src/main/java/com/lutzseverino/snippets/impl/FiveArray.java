package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

public class FiveArray implements Snippet {

    @Override public void run() {
        Question question = new Question();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) array[i] = question.askInt("Introduce el número " + (i + 1) + ": ");

        boolean showInverted = question.askBoolean("¿Mostrar la lista invertida? (true/false): ");

        if (showInverted) for (int i = (array.length - 1); i >= 0; i--) System.out.println(array[i]);
        else for (int i : array) System.out.println(i);

        int zeros = 0, positives = 0, negatives = 0;

        for (int i : array)
            if (i == 0) zeros++;
            else if (i > 0) positives++;
            else negatives++;

        int[] positiveArray = new int[positives], negativeArray = new int[negatives];

        for (int i = 0, j = 0, k = 0; i < array.length; i++)
            if (array[i] > 0) positiveArray[j++] = array[i];
            else if (array[i] < 0) negativeArray[k++] = array[i];

        float positiveSum = 0, negativeSum = 0;

        for (int i : positiveArray) positiveSum += i;
        for (int i : negativeArray) negativeSum += i;

        float positiveAverage = positiveSum / positiveArray.length;
        float negativeAverage = negativeSum / negativeArray.length;

        System.out.println("\nHay " + zeros + " ceros.");
        System.out.println("La media de los " + positiveArray.length + " números positivos es de " + positiveAverage + ".");
        System.out.println("La media de los " + negativeArray.length + " números negativos es de " + negativeAverage + ".");
    }
}
