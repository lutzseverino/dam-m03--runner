package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

@Name("water")
public class WaterCost implements Snippet {

    /*
        START
            SHOW ("Introduce el consumo de agua en litros: ")
            READ (liters)

            fixedFee <- 6
            variableFee <- 0

            IF liters < 200 THEN
                variableFee <- 0.15
            ELSE
                variableFee <- 0.30
            END IF

            totalFee <- fixedFee + (variableFee * liters)

            SHOW ("El coste total es de " + totalFee + "€.")
        END
     */
    @Override public void run() {
        Question question = new Question();

        int liters = question.askInt("Introduce el consumo de agua en litros: ");
        double fixedFee = 6;
        double variableFee = liters > 50 ? liters < 200 ? 0.15 : 0.30 : 0;
        double totalFee = fixedFee + (variableFee * liters);

        System.out.println("\nEl coste total es de " + totalFee + "€.");
    }
}
