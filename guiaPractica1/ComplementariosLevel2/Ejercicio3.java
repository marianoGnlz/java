package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static ArrayList<Integer> lista = new ArrayList<Integer>();
    public static void main(String[] args) {
        cargarLista();
        System.out.print("Impresion normal: ");
        imprimirLista(lista);
        Collections.sort(lista, Collections.reverseOrder());
        System.out.print("Impresion reversa: ");
        imprimirLista(lista);
        Collections.shuffle(lista);
        System.out.print("Impresion mezclada: ");
        imprimirLista(lista);
    }
    public static void cargarLista() {
        for (int i = 1; i <= 12; i++) {
            lista.add(i);
        }
    }
    public static void imprimirLista(ArrayList<Integer> lista) {
        for (Integer integer : lista) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
