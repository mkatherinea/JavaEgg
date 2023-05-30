package org.example;

import java.util.Scanner;

public class ej_3_final_guia {
    public static void main(String[] args) {
       /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
        Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase bonita");
        String frase = leer.nextLine();


        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
