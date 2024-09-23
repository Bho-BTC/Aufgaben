package com.btcag.bootcamp;

import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        double i = 3;
        double pi = 0;
        double ergebnis = 1;

        System.out.println("Wie viele Durchläufe sollen erfolgen?");
        long maxruns = eingabe.nextLong();
        long runs = 0;

        while (runs < maxruns) {
            while (runs % 2 == 0) {
                ergebnis = ergebnis - 1 / i;
                runs++;
                i+=2;
            }

            while (runs % 2 != 0) {
                ergebnis = ergebnis + 1 / i;
                runs++;
                i+=2;
            }
        }
        pi = 4 * (ergebnis);
        System.out.println("Nach " + runs + " Durchläufen wurde Pi auf den Wert " + pi + " berechnet.");
    }
}

