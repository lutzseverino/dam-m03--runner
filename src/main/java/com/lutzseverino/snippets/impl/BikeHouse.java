package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

@Name("bike")
public class BikeHouse implements Snippet {

    @Override public void run() {
        Question question = new Question();

        float price = question.askFloat("Introduce el precio de la bicicleta: ");
        boolean vip = question.askBoolean("¿Eres cliente VIP? (true/false): ");
        float discount = vip || price > 200 ? price * 20 / 100 : 0;
        float total = price - discount;

        System.out.println("\nEl precio final es de " + total + " €.");
    }
}
