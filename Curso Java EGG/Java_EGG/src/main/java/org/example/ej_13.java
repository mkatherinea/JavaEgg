package org.example;

import java.util.Scanner;

public class ej_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos compañeros hay en el equipo?");
        int comp = leer.nextInt();
        String[] equipo = new String[comp];

        IngresarNombres(equipo, comp);
        MostrarNombres(equipo, comp);
    }


    public static void IngresarNombres(String[] equipo, int comp) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < comp; i++) {
            System.out.println("Ingrese el nombre del compañero en la posicion: " + i);
            String nombre = leer.next();
            equipo[i] = nombre;
        }

    }
    private static void MostrarNombres(String[] equipo, int comp) {
        for(int i = 0; i< comp; i++){
            System.out.println((i+1) + " - "+equipo[i]);

        }
    }

}