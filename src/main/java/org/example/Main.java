package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            String testoGigante = FigletFont.convertOneLine("NIGGER E HITLER");

            System.out.println(testoGigante);

        } catch (IOException e) {
            System.err.println("Errore durante la generazione del testo ASCII: " + e.getMessage());
        }
    }
}