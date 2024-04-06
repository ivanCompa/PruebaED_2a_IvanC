/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diurno
 */
public class PersonaTest {

    Persona p;

    @BeforeEach
    public void setUp() {
        p = new Persona(46, "Ivan", 'M', 17, 8, 2005);

    }

    @Test
    public void testGetNif() {
        assertEquals("46-T", p.getNif().toString());

    }

    @Test
    public void testSetNif() {

        Nif nif = new Nif(12345678);

        p.setNif(nif);

        assertEquals(nif, p.getNif());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Ivan", p.getNombre());
    }

    @Test
    public void testSetNombre() {
        p.setNombre("Juan Pérez");

        assertEquals("Juan Pérez", p.getNombre());
    }

    @Test
    public void testGetGenero() {
        assertEquals('M', p.getGenero());
    }

    @Test
    public void testSetGenero() {
        p.setGenero('M');

        assertEquals('M', p.getGenero());
    }

    @Test
    public void testGetNacimiento() {
        assertEquals(LocalDate.of(2005, 8, 17), p.getNacimiento());
    }

    @Test
    public void testSetNacimiento() {
        LocalDate fechaNacimiento = LocalDate.of(1995, 5, 10);

        p.setNacimiento(fechaNacimiento);

        // Verificar que la fecha de nacimiento se ha establecido correctamente
        assertEquals(fechaNacimiento, p.getNacimiento());
    }

    @Test
    public void testGetEdad() {
        assertEquals(18, p.getEdad());
    }

    @Test
    public void testToString() {
        assertEquals("46-T	Ivan			18", p.toString());
    }

}
