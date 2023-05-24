package org.example;

import java.util.Scanner;

public class ej_9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont = 0, suma = 0;

        do{
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if(num > 0){
                suma = suma + num;
                cont++;
            }
            if(num ==0){
                System.out.println("Se capturó el número cero");
                break;
            }
        }while(cont < 20);

        System.out.println("La suma de los numeros hasta ahora es: "+suma);




    }
}
