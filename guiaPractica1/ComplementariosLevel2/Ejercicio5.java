package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio5 {

    public static ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
    public static ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
    public static ArrayList<Integer> totales = new ArrayList<Integer>();

    public static void main(String[] args) {
        carga(horasTrabajadas, 10, 1);
        carga(valorPorHora, 600, 300);
        for (int i = 0; i < horasTrabajadas.size(); i++) {
            totales.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
        System.out.println(totales);
        System.out.print("Total Final: " + totales.stream().reduce((n, acc) -> acc + n).get());
    }

    public static void carga(ArrayList<Integer> lista, int max, int min) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            lista.add(random.nextInt(max - min + 1) + min);
        }
    }
}
