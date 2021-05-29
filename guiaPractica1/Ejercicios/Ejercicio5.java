package guiaPractica1.Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }
    }
}
