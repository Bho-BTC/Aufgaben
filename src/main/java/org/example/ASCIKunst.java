package org.example;

import java.util.Scanner;

public class ASCIKunst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int counter2;


        System.out.println("Gib die Größe des Quadrats ein.");
        int input = scanner.nextInt();
        char Star = 42;


        while (counter < input) {
            counter++;
            counter2=0;
            System.out.println();
            while (counter2 < input) {
                System.out.print(Star);
                counter2++;
            }
        }

        System.out.println();
        System.out.println("Gib die Größe des Dreiecks ein.");
        int input3eck = scanner.nextInt();
        counter =0;

        while (counter < input3eck) {
            counter++;
            counter2=0;
            System.out.println();
            while (counter2 <counter) {
                System.out.print(Star);
                counter2++;
            }
        }



    }
}