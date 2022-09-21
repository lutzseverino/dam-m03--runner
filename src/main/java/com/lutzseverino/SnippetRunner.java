package com.lutzseverino;

import com.lutzseverino.registry.SnippetRegistry;
import com.lutzseverino.snippets.*;
import com.lutzseverino.snippets.impl.*;
import com.lutzseverino.util.Color;

import java.util.Scanner;

public class SnippetRunner {
    private static SnippetRunner instance;
    private final SnippetRegistry registry = new SnippetRegistry();

    public SnippetRunner() {
        instance = this;
    }

    public static SnippetRunner getInstance() {
        return instance;
    }

    public SnippetRegistry getRegistry() {
        return registry;
    }

    public void init() {
        getRegistry().registerAlgorithms(
                new Terminate(),
                new ListAvailable(),
                new HealthcareSalary(),
                new MaleFemalePercentage(),
                new RiverDoor(),
                new NegativeNumberLoop(),
                new PassOrNoPass(),
                new DayTrader(),
                new WaterCost(),
                new DealershipSalary(),
                new HostelCost()
        );

        execute(getRegistry());
    }

    public void execute(SnippetRegistry registry) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(Color.BLUE_BOLD + "EJECUTOR DE FRAGMENTOS\n" + Color.RESET);

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print(Color.WHITE +
                    "¿Qué quieres ejecutar?\n" +
                    "    - 'list' para ver la lista de comandos\n" +
                    "    - 'exit' para salir del programa\n" + Color.RESET
            );
            System.out.print("> ");

            String command = scanner.nextLine();

            System.out.print("\n");
            registry.getSnippet(command).ifPresentOrElse(
                    Snippet::run,
                    () -> System.out.println(Color.RED + "No se encontró el comando '" + command + "'" + Color.RESET)
            );
            System.out.print("\n");
        }
    }
}
