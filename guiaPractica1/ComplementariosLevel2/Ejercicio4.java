package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static ArrayList<String> estudiantes = new ArrayList<String>();
    public static ArrayList<String> curso1 = new ArrayList<String>();
    public static ArrayList<String> curso2 = new ArrayList<String>();
    public static ArrayList<String> curso3 = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        cargarEstudiantes(scan);
        scan.close();
        separarEstudiantes();
        imprimirLista(curso1);
        imprimirLista(curso2);
        imprimirLista(curso3);
    }

    public static void cargarEstudiantes(Scanner scan) {
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese un nombre: ");
            estudiantes.add(scan.nextLine());
        }
    }

    public static void separarEstudiantes() {
        curso1.addAll(estudiantes.subList(0, 4));
        curso2.addAll(estudiantes.subList(4, 8));
        curso3.addAll(estudiantes.subList(8, 12));
    }

    public static void imprimirLista(ArrayList<String> lista) {
        lista.forEach((n) -> System.out.println(n));
    }
}
