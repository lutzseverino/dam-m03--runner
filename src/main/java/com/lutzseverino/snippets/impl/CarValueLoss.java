package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

@Name("volkswagen")
public class CarValueLoss implements Snippet {

    @Override public void run() {
        Question question = new Question();

        int kilometers = question.askInt("Introduce los kilómetros recorridos: ");
        boolean camper = question.askBoolean("¿Es la versión Camper Full Equip? (true/false): ");
        float price = 73490;
        float valueLoss = price * kilometers * 0.00001f;
        float camperPrice = camper ? 20000 : 0;
        float total = price - valueLoss + camperPrice;

        System.out.println("\nEl valor de la Volkswagen es de " + total + "€.");
    }
}
