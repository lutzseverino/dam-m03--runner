package com.lutzseverino.snippets.impl;

import com.lutzseverino.annotation.Name;
import com.lutzseverino.question.Question;
import com.lutzseverino.snippets.Snippet;

@Name("healthcare")
public class HealthcareSalary implements Snippet {

    /*
        START
            SHOW ("¿Estás enfermo?" (s/n)")
            READ (isSick)

            SHOW ("¿Cuántas horas extra has trabajado?")
            READ (overtimeHours)

            baseSalary <- 1250
            frstOvertime <- 15
            secondOvertime <- 12
            overtimeSalary <- 0

            IF (isSick) THEN
                baseSalary <- baseSalary + 250
                firstOvertime <- firstOvertime + 5
                secondOvertime <- secondOvertime +5
            END IF

            IF (overtimeHours > 0) THEN
                IF (overtimeHours <= 5) THEN
                    overtimeSalary <- overtimeHours * firstOvertime
                ELSE THEN
                    overtimeSalary <- (5 * firstOvertime) + ((overtimeHours - 5) * secondOvertime)
                END IF
            END IF

            totalSalary <- baseSalary + overtimeSalary

            SHOW ("Tus horas extras constituyen una ganancia de €" + overtimeSalary);
            SHOW ("Lo que deja un salario final de €" + totalSalary);
     */
    @Override public void run() {
        Question question = new Question();

        int firstOvertimeRate = 15;
        int secondOvertimeRate = 12;
        int overtimeSalary = 0;
        boolean isSick = question.askBoolean("¿Estás enfermo? (true/false): ");
        int overtimeHours = question.askInt("¿Cuántas horas extra trabajaste?: ");
        int baseSalary = question.askInt("¿Cuál es tu salario base?: ");

        if (isSick) {
            baseSalary += 250;
            firstOvertimeRate += 5;
            secondOvertimeRate += 5;
        }

        if (overtimeHours > 0)
            overtimeSalary = overtimeHours <= 5
                    ? overtimeHours * firstOvertimeRate
                    : (5 * firstOvertimeRate) + ((overtimeHours - 5) * secondOvertimeRate);

        int totalSalary = baseSalary + overtimeSalary;

        System.out.println("\nTus horas extras constituyen una ganancia de €" + overtimeSalary);
        System.out.println("Lo que deja un salario final de €" + totalSalary);
    }
}
