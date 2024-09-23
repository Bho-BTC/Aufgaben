package org.example;

import java.util.Scanner;

public class SubnettingReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//------------------------------------------------------------------Input einlesen----------------------------------------------------------------------------
        System.out.println("Bitte gib das erste Oktett der Ip-Addresse an:");
        long erstesOktet = scanner.nextLong();

        System.out.println("Bitte gib das zweite Oktett der Ip-Addresse an:");
        long zweitesOktet = scanner.nextLong();

        System.out.println("Bitte gib das dritte Oktett der Ip-Addresse an:");
        long drittesOktet = scanner.nextLong();

        System.out.println("Bitte gib das vierte Oktett der Ip-Addresse an:");
        long viertesOktet = scanner.nextLong();

        System.out.println("Bitte gib die Subnetzmaske an:");
        long subMaske = scanner.nextLong();
        long hostAnteil = 32 - subMaske;

        long iprange = -1;
        iprange = -1*(iprange << hostAnteil);
        System.out.println(iprange);






    }
}
