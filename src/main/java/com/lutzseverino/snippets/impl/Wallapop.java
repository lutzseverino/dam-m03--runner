package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

public class Wallapop implements Snippet {

    @Override public void run() {
        Question question = new Question();

        double price = question.askDouble("Introduce el precio de la figura: ");
        boolean goodState = question.askBoolean("¿Está en buen estado? (true/false): ");
        double finalPrice = goodState ? price * 1.25 : price * 1.10;

        System.out.println("\nEl precio final es de " + finalPrice + " €.");
    }
}
