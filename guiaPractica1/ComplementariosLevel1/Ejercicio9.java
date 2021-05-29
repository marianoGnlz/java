package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String entrada = scan.nextLine();
        System.out.print("Ingrese una letra: ");
        String string = scan.nextLine();
        char letra = string.charAt(0);
        scan.close();
        char[] entradaArray = entrada.toCharArray();
        int acc = 0;
        for (char elemento: entradaArray) {
            if (elemento == letra) acc++;
        }
        System.out.printf("La cantidad de %c en '%s' es: %d", letra, entrada, acc);
    }
}
