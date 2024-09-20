package org.example;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Primzahlen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        do {
            System.out.println("Gib eine Zahl über 1 an um zu prüfen ob es eine Primzahl ist.");
            input = scanner.nextDouble();
        } while (input <= 1);
        boolean divinc = false;
        boolean checkedDiv = false;
        boolean check = true;
        String prime = "true";
        int div = 2;
        while (check) {
            while (div < input) {
                divinc=false;

                while (input % div == 0) {
                    prime = "false";
                    check = false;
                    div++;
                    divinc = true;
                }
                while (!divinc) {
                    div = div + 1;
                    divinc=true;
                }
            }
            check=false;
        }
        String ergebnis = "";
        while (prime == "true") {
            ergebnis = "eine";
            prime = "fertig";
        }
        while (prime == "false") {
            ergebnis = "keine";
            prime = "fertig";
        }
        System.out.println("Die Zahl ist " + ergebnis + " Primzahl");
    }
}

