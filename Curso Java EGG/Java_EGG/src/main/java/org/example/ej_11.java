package org.example;

import java.util.Scanner;

public class ej_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase, que termine en un punto");
        String frase = leer.nextLine();
        modificarFrase(frase);

    }

    public static void modificarFrase(String frase){
        String fraseMod = "";


        for(int i = 0; i < frase.length(); i++){
           char letra = frase.charAt(i);

            switch (Character.toLowerCase(letra)){
                case 'a':
                    letra= '@';
                    break;
                case 'e':
                    letra = '#';
                    break;
                case 'i':
                    letra = '$';
                    break;
                case 'o':
                    letra = '%';
                    break;
                case 'u':
                    letra = '*';
                    break;
            }
            fraseMod = fraseMod.concat(String.valueOf(letra));


        }


        System.out.println(fraseMod);


    }


}
