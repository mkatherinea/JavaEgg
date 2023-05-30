package org.example;

import java.util.Scanner;

public class ej_final_guia_4 {
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados centígrados");
        Scanner leer = new Scanner(System.in);
        int temp = leer.nextInt();

        int tempFarh = ConvertToFahrenheit(temp);
        System.out.println(tempFarh);
    }

    public static int ConvertToFahrenheit(int unaTemp) {
        int farh = 32+(9*unaTemp/5);
        return farh;
    }
}
