package org.example;

import java.util.Scanner;

public class ej_10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            System.out.print(num+ "-");
            for(int j = 0; j < num; j++){

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
