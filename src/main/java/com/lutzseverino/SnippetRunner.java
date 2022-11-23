package com.lutzseverino;

import com.lutzseverino.registry.SnippetRegistry;
import com.lutzseverino.snippets.*;
import com.lutzseverino.snippets.impl.*;
import com.lutzseverino.util.ColorUtils;

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
        getRegistry().registerSnippets(
                new Terminate(),
                new ListAvailable(),
                new HealthcareSalary(),
                new MaleFemalePercentage(),
                new RiverGate(),
                new NegativeNumberLoop(),
                new QualifyStatus(),
                new DayTrader(),
                new WaterCost(),
                new DealershipSalary(),
                new HostelCost(),
                new Coffee(),
                new Wallapop(),
                new BikeHouse(),
                new CarValueLoss(),
                new PVP(),
                new ArrayEvaluation(),
                new MixedArrays(),
                new Matrixes()
        );

        execute(getRegistry());
    }

    public void execute(SnippetRegistry registry) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println(ColorUtils.BLUE_BOLD + "EJECUTOR DE FRAGMENTOS\n" + ColorUtils.RESET);

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print(ColorUtils.WHITE +
                    "¿Qué quieres ejecutar?\n" +
                    "\t- 'list' para ver la lista de comandos\n" +
                    "\t- 'exit' para salir del programa\n" + ColorUtils.RESET
            );
            System.out.print("> ");

            String command = scanner.nextLine();

            System.out.print("\n");
            registry.getSnippet(command).ifPresentOrElse(
                    Snippet::run,
                    () -> System.out.println(ColorUtils.RED + "No se encontró el comando '" + command + "'" + ColorUtils.RESET)
            );
            System.out.print("\n");
        }
    }
}
