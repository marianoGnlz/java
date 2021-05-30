package guiaPractica1.ComplementariosLevel2;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        ciudades.add("Resistencia");
        ciudades.add("Cordoba");
        ciudades.add("Corrientes");
        for (String elemento : ciudades) {
            System.out.printf("#%d - %s%n", ciudades.indexOf(elemento) + 1, elemento);
        }
    }
}
