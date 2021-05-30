package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static ArrayList<Integer> lista = new ArrayList<Integer>();
    public static void main(String[] args) {
        cargarLista(lista, 5);
        imprimirLista(lista);
        System.out.println();
        lista.add(0,2);
        lista.add(lista.size(), 2);
        imprimirLista(lista);
    }

    public static void cargarLista(ArrayList<Integer> lista, int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            lista.add(i);
        }
    }
    
    public static void imprimirLista(ArrayList<Integer> lista) {
        for (Integer integer : lista) {
            System.out.print(integer);
        }
    }
}
