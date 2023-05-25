package org.example;

import java.util.Scanner;

public class ej_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.next();
        modificarFrase(frase);

    }

    public static void modificarFrase(String frase){
        String fraseMod = "";


        for(int i = 0; i < frase.length(); i++){
            String letra = frase.substring(i,i);

            switch (letra){
                case "a":
                    letra= "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    letra = letra;
            }
            fraseMod = fraseMod.concat(letra);


        }


        System.out.println(fraseMod);


    }


}
