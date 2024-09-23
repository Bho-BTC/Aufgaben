package org.example;

import java.util.Scanner;

public class Einkaufen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie Produktkosten in Cent an. Bestätigen sie die Rechnung mit dem Betrag 0");
        double[] schein = {
                50000,
                20000,
                10000,
                5000,
                2000,
                1000,
                500,
                200,
                100,
                50,
                20,
                10,
                5,
                2,
                1
        };
        double input = 1;
        double kostenGesamt = 0;
        int counter = 0;
        while (input != 0) {
            input = scanner.nextInt();
            kostenGesamt += input;

        }

        System.out.println("Die gesamt Kosten betragen " + kostenGesamt / 100+"€");
        System.out.println();
        System.out.println("Wie viel Geld hat der Kunde in Cent gegeben?");
        double geGeben = scanner.nextInt();

        double zuGeben = geGeben - kostenGesamt;


        boolean notYet = true;
        int i = 0;
            while (i <= 14) {

                while (zuGeben >= schein[i]) {
                    zuGeben = zuGeben - schein[i];
                    counter++;
                }
                System.out.println(counter + " x " + schein[i] / 100 + "€");
                i++;
                counter = 0;
            }



    }


}
