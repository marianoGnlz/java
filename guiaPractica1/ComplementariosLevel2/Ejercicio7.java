package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;

public class Ejercicio7 {
    public static ArrayList<String> lista = new ArrayList<String>();

    public static void main(String[] args) {
        cargarDatos(8, 1);
        cargarDatos(8, 2);
        cargarDatos(2, 45);
        System.out.println(lista);
    }

    public static void cargarDatos(int num1, int num2) {
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                lista.add("FizzBuzz");
            } else if (i % 2 == 0) {
                lista.add("Fizz");
            } else if (i % 3 == 0) {
                lista.add("Buzz");
            } else {
                lista.add(Integer.toString(i));
            }
        }
    }
}
