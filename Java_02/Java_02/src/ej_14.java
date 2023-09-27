import java.util.Scanner;

public class ej_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros");
        int euros = leer.nextInt();
        System.out.println("Digite la moneda a la cual desea convertir?\n"+
                "Dolares\n"+
                "Yenes\n"+
                "Libras");
        String moneda = leer.next();

        ConvertirEuros(euros,moneda);

    }

    public static void ConvertirEuros(int euros, String moneda) {
        switch (moneda.toLowerCase()){
            case "dolares":
                System.out.println(euros+" euros son "+(euros*1.28611)+" dolares.");
                break;
            case "yenes":
                System.out.println(euros+ " euros son "+(euros*129.852)+" Yenes.");
                break;
            case "libras":
                System.out.println(euros+ " euros son "+(euros*0.86)+ " Libras");
                break;
            default:
                System.out.println("No se puede procesar la moneda");


        }
    }
}
