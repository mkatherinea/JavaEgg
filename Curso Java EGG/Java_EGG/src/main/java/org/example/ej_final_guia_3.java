package org.example;

import java.util.Scanner;

public class ej_final_guia_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
}
