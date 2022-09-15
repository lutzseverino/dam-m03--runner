package com.lutzseverino.snippets;

import com.lutzseverino.annotation.Name;

import java.util.Scanner;

@Name("overtime") @Name("salary")
public class HealthcareSalary implements Snippet {
    @Override public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Estás enfermo? (s/n): ");
        boolean isSick = scanner.nextLine().equals("s");

        System.out.print("¿Cuántas horas extra trabajaste?: ");
        int overtimeHours = scanner.nextInt();

        System.out.print("¿Cuál es tu salario base?: ");
        int baseSalary = scanner.nextInt();

        int firstOvertimeRate = 15;
        int secondOvertimeRate = 12;
        int overtimeSalary = 0;

        if (isSick) {
            baseSalary += 250;
            firstOvertimeRate += 5;
            secondOvertimeRate += 5;
        }

        if (overtimeHours > 0) overtimeSalary = overtimeHours <= 5
                ? overtimeHours * firstOvertimeRate
                : (5 * firstOvertimeRate) + ((overtimeHours - 5) * secondOvertimeRate);

        int totalSalary = baseSalary + overtimeSalary;

        System.out.println("\nTus horas extras constituyen una ganancia de €" + overtimeSalary);
        System.out.println("Lo que deja un salario final de €" + totalSalary);
    }
}
