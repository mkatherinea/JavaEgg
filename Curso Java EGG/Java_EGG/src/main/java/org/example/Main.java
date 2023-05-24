package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner leer = new Scanner(System.in);

        System.out.println("Con esta Clase guardami+os valores ingresados en las variables");
        System.out.println("Ingrese su nombre");

        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        System.out.println("Nombre: "+ nombre+" Edad: "+edad);

        */


        //Scanner leer = new Scanner(System.in);


       /* System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();


        System.out.println("Eres mayor de edad");
        boolean esMayor = leer.nextBoolean();

        System.out.println("Cual es tu altura?");
        double altura = leer.nextDouble();

        System.out.println("Hombre o Mujer?");
        String sexo = leer.next();

        System.out.println("Nombre: "+nombre +"\n"+"Edad: "+edad+ "\n" +"Eres mayor de edad:"+esMayor+ "\n"+"De que sexo eres? "+sexo);
       */
       /* System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
       int num2 = leer.nextInt();

       if(num1 > num2){
           System.out.println("El primer numero ingresado es el mayor, es el: " +num1);

        }else if(num1 < num2){
           System.out.println("El segundo numero ingresado es el mayor. Es el: "+num2);
       }else{
           System.out.println("Los numeros ingresados son iguales");


       }
*/
/*
        System.out.println("Ingrese el tipo de motor");
        int tipoMotor = leer.nextInt();

        switch (tipoMotor) {
            case 1 -> System.out.println("La bomba es una bomba de gasolina.");
            case 2 -> System.out.println("“La bomba es una bomba de\n" +
                    "hormigón”.");
            case 3 -> System.out.println("“La bomba es una bomba de\n" +
                    "gasolina”.");
            case 4 -> System.out.println("“La bomba es una bomba de\n" +
                    "pasta alimenticia”.");

            default -> System.out.println("No existe un valor válido para tipo de bomba");
        }
        /*int nota = 20;

        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
        while (nota > 10 || nota < 0);

        System.out.println("La nota ingresada es: "+nota);
*/
        //leer.next().charAt(0)

        /*int numeros = (int)(Math.random()*200-20);
        int cont = 0, suma = 0;


        while (cont < 20) {

            cont = cont + 1;
            System.out.println(cont);
            System.out.println(numeros);
            if (numeros == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (numeros > 0) {
                suma = suma + numeros;
                System.out.println("contador: "+cont);
            }
        }

        System.out.println("La suma de los numeros es: "+suma);

         */


        //FOR//
        /*for(int i = 0; i<10; i++){
            System.out.println("Imprimo el valor de i: "+i);
        }
        for(int i = 10;i >0; i--){
            System.out.println("Imprimo el valor decreciente de i: "+i);
        }
        */


        Scanner leer = new Scanner(System.in);

        for (int i = 1; i <=4; i++){
            System.out.println("Ingrese el número "+i);
            int num = leer.nextInt();
            System.out.print(num + " ");
            for(int j = 1; j <= num; j++){

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


}