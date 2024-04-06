/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Crear una persona con unos valores por defecto
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Creacion de persona usando los valores por defecto, pero añadiendo un NIF
     * @param nif El nif de la persona a crear
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Creacion de persona introduciendo todos los datos
     * @param nif El nif de la persona a crear
     * @param nombre El nombre de la persona a crear
     * @param genero El genero de la persona a crear
     * @param dia El dia de nacimiento de la persona a crear
     * @param mes El mes de nacimiento de la persona a crear
     * @param ano El año de nacimiento de la persona a crear
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    /**
     * Devuelve el nif de la persona
     * @return NIF de la persona
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Cambia el NIF de la persona
     * @param nif El nuevo NIF que se asignará a la persona
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el nombre de la persona
     * @return Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la persona
     * @param nombre  El nuevo nombre que se asignará a la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el genero de la persona
     * @return Genero de la persona
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Cambia el genero de la persona
     * @param genero El nuevo genero que se asignará a la persona
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Devuelve la fecha de nacumiento de la persona
     * @return La fecha de nacumiento de la persona
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Cambia la fecha de nacumiento de la persona
     * @param nacimiento La nueva fecha de nacumiento que se asignará a la persona
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Devuelve la edad de la persona
     * @return Edad de la persona
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve el dni, nombre y edad de la persona
     * @return dni, nombre y edad de la persona
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Comprueba si una persona es igual a otra por su NIF
     * @param a persona a comparar
     * @return True (si es igual) / False (no es igual)
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Comprueba si una persona es igual a un objeto por su NIF
     * @param obj objeto comparar
     * @return True (si es igual) / False (no es igual)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Ordena los objetos según su NIF
     * @param o persona a comparar
     * @return 0 (No son iguales) / 1 (Si son iguales)
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
