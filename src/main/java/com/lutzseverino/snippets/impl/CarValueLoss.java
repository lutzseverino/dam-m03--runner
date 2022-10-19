package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

@Name("volkswagen")
public class CarValueLoss implements Snippet {

    @Override public void run() {
        Question question = new Question();

        final float PRICE = 73_490;
        final float FULL_PRICE = PRICE + 20_000;

        int kilometers = question.askInt("Introduce los kilómetros recorridos: ");
        boolean camper = question.askBoolean("¿Es la versión Camper Full Equip? (true/false): ");
        float valueLoss = kilometers * 0.00001f;
        float total = camper ? FULL_PRICE - valueLoss : PRICE - valueLoss;

        System.out.println("\nEl precio final es de " + total + " €, ha perdido " + valueLoss + " € de valor.");
    }
}
