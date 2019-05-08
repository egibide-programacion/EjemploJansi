package com.jaureguialzo;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Main {

    public static void main(String[] args) {

        AnsiConsole.systemInstall();

        System.out.println(ansi().eraseScreen().render("@|red Hello|@ @|green World|@"));

        AnsiConsole.systemUninstall();
    }
}
