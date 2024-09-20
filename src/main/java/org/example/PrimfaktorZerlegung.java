package org.example;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class PrimfaktorZerlegung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Gib eine Zahl über 1 an um die Primfaktoren zu prüfen.");
            input = scanner.nextInt();
        } while (input <= 1);


        String output = "";
        boolean prime = true;
        int div = 2;
        while (div < input) {

            if (input % div == 0) {
                prime = true;
                for (int i = 2; i < Math.sqrt(div); i++) {
                    if (div % i == 0) {
                        prime = false;
                        break;
                    }

                }
                if (prime) {
                    output += div + "  ";
                }

            }
            div++;
        }
        System.out.println("Die Zahl " + input + " kann in die Primfaktoren " + output + "zerlegt werden.");

    }
}

