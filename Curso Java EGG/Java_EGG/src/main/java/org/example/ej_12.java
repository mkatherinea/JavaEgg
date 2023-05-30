package org.example;

import java.util.Scanner;

public class ej_12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);


    }

    public static void EsMultiplo(int unNum1, int unNum2){
        if(unNum1 % unNum2 == 0){
            System.out.println("El número "+unNum1+ " es múltiplo de "+unNum2+".");
        }else{
            System.out.println("El número "+unNum1+ " no es múltiplo de "+unNum2+".");
        }
    }
}
