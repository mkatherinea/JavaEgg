package org.example;

import java.util.Scanner;

public class ej_11_otraForma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase, que termine en un punto");
        String frase = leer.nextLine();
        String retorno = modificarFrase(frase);
        System.out.println(retorno);
    }


    public static String modificarFrase(String frase) {
        String fraseMod = "";

        for (int i = 0; i < frase.length(); i++) {
            String letra;
            letra = frase.substring(i, i + 1);


            switch (letra.toLowerCase()) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "%";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "&";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:


                    //System.out.println(letra);

            }
            fraseMod = fraseMod.concat(letra);
        }

            return fraseMod;
    }
}