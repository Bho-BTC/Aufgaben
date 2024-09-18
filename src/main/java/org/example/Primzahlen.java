package org.example;
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Primzahlen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl über 0 an um zu prüfen ob es eine Primzahl ist.");
        double input = scanner.nextDouble();
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