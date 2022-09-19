package com.lutzseverino.snippets;

import com.lutzseverino.annotation.Name;

import java.util.Scanner;

@Name("river") @Name("girona")
public class GironaRiver implements Snippet {

    /*
        START
            SHOW ("¿Cuántos litros de agua por metro cuadrado han llovido?")
            READ (litersPerSquareMeter)

            doorIsOpen <- litersPerSquareMeter > 90

            IF doorIsOpen THEN
                SHOW ("La puerta está abierta.")
            ELSE
                SHOW ("La puerta está cerrada.")
            END IF
        END
     */
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos litros de agua por metro cuadrado han llovido?: ");
        int litersPerSquareMeter = scanner.nextInt();

        boolean isDoorOpen = litersPerSquareMeter > 90;

        System.out.println(isDoorOpen ? "La puerta está abierta." : "La puerta está cerrada.");
    }
}
