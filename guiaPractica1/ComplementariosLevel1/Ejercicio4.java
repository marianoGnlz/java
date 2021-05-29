package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("Resultado: " + factorial(num));
    }

    public static int factorial(int num) {
        if (num < 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
