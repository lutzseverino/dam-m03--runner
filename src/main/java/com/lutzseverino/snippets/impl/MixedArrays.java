package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

public class MixedArrays implements Snippet {

    @Override public void run() {
        Question question = new Question();

        int[] firstArray = new int[10];
        int[] secondArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = question.askInt("Introduce el número " + (i + 1) + " de la primera lista: ");
            secondArray[i] = question.askInt("Introduce el número " + (i + 1) + " de la segunda lista: ");
        }

        int[] mixedArray = new int[firstArray.length + secondArray.length];

        for (int i = 0, j = 0; i < mixedArray.length; i += 2, j++) {
            mixedArray[i] = firstArray[j];
            mixedArray[i + 1] = secondArray[j];
        }

        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");

            if ((i + 1) % 2 == 0) System.out.println();
        }
    }
}
