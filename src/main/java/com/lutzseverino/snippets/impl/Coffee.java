package com.lutzseverino.snippets.impl;

import com.lutzseverino.snippets.Snippet;
import com.lutzseverino.question.Question;

public class Coffee implements Snippet {

    /*
        START
            SHOW ("¿Qué producto desea?")
            SHOW ("1. Café")
            SHOW ("2. Cortado")
            SHOW ("3. Café con leche")
            SHOW ("4. Salir")
            READ (product)

            IF (product > 0 AND product < 4) THEN
                SHOW ("Introduce una moneda")
                READ (coin)

                IF (coin >= 0.5) THEN
                    SHOW ("Aquí tiene su café")
                    SHOW ("Su cambio es de " + (coin - 0.5) + "€")
                ELSE
                    SHOW ("El importe introducido es insuficiente")
                END IF
            ELSE
                SHOW ("Opción no válida")
            END IF
        END
     */
    @Override public void run() {
        Question question = new Question();

        int product = question.askInt(
                "¿Qué producto desea? \n" +
                        "\t1. Café \n" +
                        "\t2. Cortado \n" +
                        "\t3. Café con leche\n" +
                        "> "
        );

        if (product > 0 && product < 4) {
            double coin = question.askDouble("Introduce una moneda: ");

            if (coin >= 0.5) {
                System.out.println("¡Aquí tiene su café!");
                System.out.println("\nSu cambio es de " + (coin - 0.5) + "€.");
            } else System.out.println("\nEl importe introducido es insuficiente.");
        } else System.out.println("\nOpción no válida.");
    }
}
