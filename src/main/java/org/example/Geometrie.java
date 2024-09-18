package org.example;
import java.util.Scanner;

public class Geometrie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input;
        double input2;
        double pi = 3.14;
        do {
            System.out.println("Gib eine Zahl über 1 an, die den Radius eines Kreises darstellt");
            input = scanner.nextDouble();
        }while(input<=1);
        double kreisFlaeche = pi * (input*input);

        System.out.println("Die Fläche des Kreises mti den Radius von "+ input+ "cm ist "+ kreisFlaeche+"cm²");


        do {
            System.out.println("Gib eine Zahl über 1 an, die die Rreite eines Rechecks darstellt");
            input = scanner.nextDouble();
            System.out.println("Gib eine Zahl über 1 an, die die Höhe eines Rechecks darstellt");
            input2 = scanner.nextDouble();
        }while(input<=1 && input2<=1);
            double rechteckFlaeche = input * input2;

        System.out.println("Die Fläche des Rechtecks mit einer Breite von "+ input+ "cm und einer Höhe von "+  input2+ "cm ist " + rechteckFlaeche +"cm²");



    }
}

