package org.example;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int divider;
        int divBisHier;
        int counter = 1;
        do {
            System.out.println("Gib eine Zahl an, die als Divisor benutzt werden soll");
            divider = scanner.nextInt();
        }while(divider<=1);


        do {
            System.out.println("Gib eine Zahl an, bis zu der die Teilbarkeit überprüft werden soll.");
            divBisHier = scanner.nextInt();
        }while(divBisHier<=1);


        while(counter<=divBisHier){
        while(counter%divider==0){
            System.out.println("Die Zahl "+ counter+ " ist durch "+ divider+" teilbar.");
            counter++;
        }
        counter++;


        }






    }





    }
