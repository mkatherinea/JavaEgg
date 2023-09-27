import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        int contCorrectos = 0;
        int contIncorrectos = 0;

        String secuencia;
        do {
            System.out.println("Ingrese una cadena de 5 caracteres, el primero debe ser X, el ultimo O.");
            secuencia = leer.nextLine();

            if (secuencia.length() == 5 && secuencia.substring(0, 1).equalsIgnoreCase("X") && secuencia.substring(4, 5).equalsIgnoreCase("O")) {
                contCorrectos = contCorrectos + 1;
            } else {
                contIncorrectos = contIncorrectos + 1;
            }


        } while (!secuencia.equalsIgnoreCase("&&&&&"));

        System.out.println("Secuencias correctas: " + contCorrectos);
        System.out.println("Secuencias Incorrectas: " + contIncorrectos);

    }
}