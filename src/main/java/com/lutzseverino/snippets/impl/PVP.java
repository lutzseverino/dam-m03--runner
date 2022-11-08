package com.lutzseverino.snippets.impl;

import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

public class PVP implements Snippet {

    @Override public void run() {
        Question question = new Question();

        double price = question.askDouble("Introduce el precio del producto: ");
        double iva = question.askDouble("Introduce el IVA: ");

        double finalPrice = price * (1 + iva / 100);
        System.out.println("\nEl precio final es de " + finalPrice + " €.");
    }

}
