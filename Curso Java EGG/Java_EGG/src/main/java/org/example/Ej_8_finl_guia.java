package org.example;

import java.util.Scanner;

public class Ej_8_finl_guia {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int largo;
        do {
            System.out.println("Ingrese una frase");
            String frase = leer.nextLine();
            largo = frase.length();
        }
        while (largo != 8);

        if(largo == 8){

        }

    }
}
