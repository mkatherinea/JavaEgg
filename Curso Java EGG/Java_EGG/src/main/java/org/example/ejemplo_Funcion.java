package org.example;

public class ejemplo_Funcion {
    public static void main(String[] args) {
       // Scanner leer = new Scanner(System.in);
        int num1 = 5;
        int num2 = 7;
        //puedo invocar el retorno de esta funcion de esta manera:
        System.out.println("La suma de ambos es: "+sumar(num1, num2));

        //pero se recomienda llamar una funcion asi:
        int retorno = sumar(num1, num2);
        System.out.println("La suma de ambos es: "+retorno);
    }



    public static int sumar (int num1, int num2){
        int suma;
        suma = num1+num2;
        return suma;
    }
}
