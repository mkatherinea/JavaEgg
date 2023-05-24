package org.example;

import java.util.Scanner;

public class ej_8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una nota entre 0 y 10");
        int num = leer.nextInt();

        while (num < 0 || num > 10) {
            System.out.println("La nota no está entre 0 y 10. Ingresa nuevamente la nota: ");
            num = leer.nextInt();
        }
        System.out.println("La nota ingresada es: "+num);



    }
}
