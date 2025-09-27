
package com.example.psp.practica.uno;

import com.example.psp.practica.uno.modelo.mock.AcademiaMock;
import com.example.psp.practica.uno.modelo.Alumnos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AcademiaTest {

    @Test
    public void testInsertarYListarAlumnos() {
        AcademiaMock academia = new AcademiaMock();
        Alumnos alumno = new Alumnos();
        alumno.setNombre("Juan");
        alumno.setApellidos("Pérez");
        alumno.setEdad(20);

        academia.insertar(alumno);
        List<Alumnos> lista = academia.listarAlumnos();

        assertEquals(1, lista.size());
        assertEquals("Juan", lista.get(0).getNombre());
        assertEquals("Pérez", lista.get(0).getApellidos());
        assertEquals(20, lista.get(0).getEdad());
    }
}
