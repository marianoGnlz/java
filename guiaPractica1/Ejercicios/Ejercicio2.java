package guiaPractica1.Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println("El primero número ingresado es: " + a );
        System.out.println("El segundo número ingresado es: " + b );
        System.out.println("El tercer número ingresado es: " + c );
    }
}
