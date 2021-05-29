package guiaPractica1.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Que operacion desea ejecutar");
            System.out.println("1 - Ejercicio 2");
            System.out.println("2 - Ejercicio 3");
            System.out.println("3 - Ejercicio 4");
            System.out.println("4 - Ejercicio 5");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio2(scan);
                    break;
                case 2:
                    ejercicio3(scan);
                    break;
                case 3:
                    ejercicio4(scan);
                    break;
                case 4:
                    ejercicio5(scan);
                    break;
                default:
                    break;
            }
            System.out.println("Desea continuar?");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            System.out.flush();
            int continuar = scan.nextInt();
            if (continuar != 1) break;
        }
        scan.close();
    }

    public static void ejercicio5(Scanner scan) {
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", num, i, num * i);
        }
    }

    public static void ejercicio4(Scanner scan) {
        System.out.print("Ingrese un número entre 1 y 7: ");
        int dia = scan.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                break;
        }
    }

    public static void ejercicio3(Scanner scan) {
        System.out.print("Ingrese un califcación: ");
        int califcacion = scan.nextInt();
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

    public static void ejercicio2(Scanner scan) {

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("El primero número ingresado es: " + a);
        System.out.println("El segundo número ingresado es: " + b);
        System.out.println("El tercer número ingresado es: " + c);
    }
}
