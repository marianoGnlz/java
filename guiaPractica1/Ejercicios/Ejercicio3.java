package guiaPractica1.Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un califcación: ");
        int califcacion = scan.nextInt();
        scan.close();
        if (califcacion > 92) {
            System.out.println("Excelente");
        } else if (califcacion > 84) {
            System.out.println("Sobresaliente");
        } else if (califcacion > 74) {
            System.out.println("Distinguido");
        } else if (califcacion > 59) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
