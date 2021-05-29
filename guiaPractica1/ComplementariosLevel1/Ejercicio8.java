package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scan.next();
        System.out.print("Edad: ");
        int edad = scan.nextInt();
        System.out.print("Direccion: ");
        String direccion = scan.next();
        System.out.print("Ciudad: ");
        String ciudad = scan.next();
        scan.close();

        System.out.printf("%s - %s - %d - %s", ciudad, direccion, edad, nombre);
    }
}
