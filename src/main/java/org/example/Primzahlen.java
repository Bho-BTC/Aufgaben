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
        }while(input<=1);


        boolean check = true;
        boolean prime= true;
        double div = 0;
            while(check){
                while(div<=input){
                    div= div +1;
                    if(input%div==0 && div != 1 && div !=input )
                    {
                        check = false;
                        prime = false;
                    }else{
                        check= false;
                    }
                }
            }
            String ergebnis = "";
            if(prime) {
                ergebnis= "eine";
            } else {
                ergebnis = "keine";
            }
            System.out.println("Die Zahl ist "+ergebnis+ " Primzahl" );
    }
}