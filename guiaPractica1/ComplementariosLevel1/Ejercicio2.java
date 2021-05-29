package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = scan.nextInt();
        System.out.printf("%d + %d = %d%n", num1, num2, suma(num1, num2));
        System.out.printf("%d - %d = %d%n", num1, num2, resta(num1, num2));
        System.out.printf("%d * %d = %d%n", num1, num2, multiplicacion(num1, num2));
        System.out.printf("%d / %d = %f%n", num1, num2, division(num1, num2));
        System.out.printf("%d %% %d = %d%n", num1, num2, modulo(num1, num2));
        scan.close();

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    public static double division(int num1, int num2) {
        return num1 / num2;
    }
    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }
}
