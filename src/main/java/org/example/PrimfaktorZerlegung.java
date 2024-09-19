package org.example;

import java.util.Scanner;

public class PrimfaktorZerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=0;
        int mInput;
        int div=0;
        String output = "";
        boolean check = true;
        int i = 1;
        do {
            System.out.println("Gib eine Zahl an, bis zu der die Teilbarkeit überprüft werden soll.");
            mInput = scanner.nextInt();
        } while (mInput <= 1);

        boolean prime= true;

        while (i <= mInput) { //für jede zahl bis zum input
            if (mInput % i == 0) { //für jede zahl durch die der input teilbar ist
                input=i;
                while(check){
                    while(div<=input){
                        div= div +1;
                        if(input%div==0 && div != 1 && div !=input )
                        {
                            prime = false;
                        }else{
                            check= false;
                        }
                    }
                }
                if(prime) {
                    output= input+", ";
                }



            }
            i++;
        }



        System.out.println("Die Zahl " + input + " kann in die folgenden Faktoren zerlegt werden: " + output);
    }


}

