package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Con esta Clase guardami+os valores ingresados en las variables");
        System.out.println("Ingrese su nombre");

        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        System.out.println("Nombre: "+ nombre+" Edad: "+edad);
    }
}