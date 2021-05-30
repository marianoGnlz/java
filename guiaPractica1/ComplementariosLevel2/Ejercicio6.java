package guiaPractica1.ComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicio6 {
    public static HashSet<Empleado> empleados = new HashSet<Empleado>();
    public static Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        cargarEmpleados();
        empleados.forEach(empleado -> diccionario.put(empleado.getDNI(), empleado.calcularSalario()));
        diccionario.forEach((key, value) -> {
            System.out.printf("DNI: %d --- Salario: %d", key, value);
            System.out.println();
        });
    }

    public static void cargarEmpleados() {
        empleados.add(new Empleado("Mariano", "Gonzalez", 11111111, 40, 8));
        empleados.add(new Empleado("Jose", "Fernandez", 22222222, 45, 8));
        empleados.add(new Empleado("Jeremias", "Gonzalez", 33333333, 37, 8));
    }
}

class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;

    Empleado(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNombreYApellido() {
        return nombre + " " + apellido;
    }

    public int getDNI() {
        return dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public int calcularSalario() {
        return horasTrabajadas * valorPorHora;
    }

}