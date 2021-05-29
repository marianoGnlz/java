package guiaPractica1.ComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();
        scan.close();
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = (char)((int)caracteres[i] - (int)'a' + (int)'A');
        }
        caracteres.toString();
        System.out.println(caracteres);
    }
}
