package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        int num2 = scan.nextInt();
        scan.close();
        int resultado = num2 == 0 ? 1 : num1;

        for (int i = 1; i < num2; i++) {
            resultado *= num1;
        }

        System.out.printf("%d^%d = %d", num1, num2, resultado);
    }
}
