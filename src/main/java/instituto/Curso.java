/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Devuelve el nombre del curso
     * @return Nombre del curso
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Crea un curso que se identifica con un nombre
     * @param nombre Nombre del curso que se va a crear
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Devuelve la lista de alumnos del curso
     * @return Lista de alumnos del curso
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade una persona a la lista de alumnos
     * @param p Persona a añadir a la lista
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}

