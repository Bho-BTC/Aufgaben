package org.example;

import java.util.Scanner;
import java.util.Random;

public class Zahlenraten {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int currBit = 1;
        int bitValue = 1;
        int maxNumberDec = 0;
        int versuch = 1;
        int gues = -1;
        System.out.println("Geben sie die Zahlengröße in Bit an.");
        int maxNumberBit = scanner.nextInt();

        while (currBit <= maxNumberBit) {
            maxNumberDec += bitValue;
            currBit++;
            bitValue *= 2;
        }

        int guesTarget = random.nextInt(0, maxNumberDec);

        while (gues != guesTarget) {
            System.out.println();
            System.out.println(versuch + ". Versuch: Bitte Zahl im Bereich von 0 und " + maxNumberDec + " eingeben:");
            gues = scanner.nextInt();
                while(gues==guesTarget)
                {
                    System.out.println("Super");
                    break;
                }
                while(gues<guesTarget)
                {
                    System.out.println("Die gesuchte Zahl ist größer.");
                    break;
                }
                while(gues>guesTarget)
                {
                    System.out.println("Die gesuchte Zahl ist kleiner.");

                    break;
                }


            versuch++;
        }


    }
}
