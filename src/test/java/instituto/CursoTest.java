/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Diurno
 */
public class CursoTest {

    Curso c;
    Persona p;

    @BeforeEach
    public void setUp() {
        c = new Curso("1DAM");
        p = new Persona(45218654);
    }

    @Test
    public void testGetNombre() {
        assertEquals("1DAM", c.getNombre());

    }

    @Test
    public void testToString() {
        assertEquals("--------------------1DAM-----------------\n"
                + "NumExp	NIF		Nombre		Apellidos\n"
                + "-------------------------------------------------\n"
                + "", c.toString());

    }

    @Test
    public void testAniadirAlumno() {

        c.aniadirAlumno(p);

        assertTrue(c.toString().contains(p.toString()));

    }

}
