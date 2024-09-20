package org.example;

import java.util.Scanner;

public class FibonacciZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNbr = 0;
        int secondNbr = 1;

        System.out.println("Gib eine Zahl ein.");
        int maxRounds = scanner.nextInt();

        int ergebnis = 0;
        while (ergebnis <= maxRounds) {
            ergebnis = firstNbr + secondNbr;
            firstNbr = secondNbr;
            secondNbr = ergebnis;

            while (ergebnis < maxRounds) {
                System.out.println(ergebnis);
                ergebnis = maxRounds+1;
            }

        }


    }
}

