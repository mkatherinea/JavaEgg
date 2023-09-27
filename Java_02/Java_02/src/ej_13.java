import java.util.Arrays;
import java.util.Scanner;

public class ej_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese lado del cuadrado");
        int num = leer.nextInt();

        //String vector = Arrays.toString(new String[num]);
        String vector = Arrays.toString(new String[num][num]);

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(j == 0 || j == num-1 || i == 0 || i == num-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.print("\n");

        }




    }

}
