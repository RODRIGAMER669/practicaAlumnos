package com.example.psp.practica.uno;

import java.util.List;

import javax.swing.JOptionPane;
import com.example.psp.practica.uno.modelo.mock.AcademiaMock;
import com.example.psp.practica.uno.modelo.Alumnos;

public class App {

    public static final String INSERTAR_ALUMNO = "1";
    public static final String LISTAR_ALUMNOS = "2";
    public static final String SALIR_PANEL = "0";
    public static final String MSG_PANEL = String.format("""
            Ingrese opción:
            %s. Insertar alumno
            %s. Listar alumnos
            %s. Salir del panel""", INSERTAR_ALUMNO, LISTAR_ALUMNOS, SALIR_PANEL);
    public static final String PREGUNTA_SALIR = "¿Quierés salir del panel? \nSi o no";
    public static final String OPCION_ERRONEA = "Opción insertada es errónea";

    public static void main(String[] args) {
        AcademiaMock academia = new AcademiaMock();
        boolean salir = false;
        do {
            String opcionElegida = mostrarMenu();
            switch (opcionElegida) {
                case INSERTAR_ALUMNO:
                    insertarAlumnoMenu(academia);
                    break;
                case LISTAR_ALUMNOS:
                    listarAlumnosMenu(academia);
                    break;
                case SALIR_PANEL:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, OPCION_ERRONEA);
            }
        } while (!salir);
    }

    public static String mostrarMenu() {
        return JOptionPane.showInputDialog(MSG_PANEL);
    }

    public static void insertarAlumnoMenu(AcademiaMock academia) {
        Alumnos alumno = new Alumnos();
        String nombre = JOptionPane.showInputDialog("Nombre del alumno:");
        String apellidos = JOptionPane.showInputDialog("Apellidos del alumno:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del alumno:"));
        alumno.setNombre(nombre);
        alumno.setApellidos(apellidos);
        alumno.setEdad(edad);
        academia.insertar(alumno);
        JOptionPane.showMessageDialog(null, "Alumno insertado correctamente");
    }

    public static void listarAlumnosMenu(AcademiaMock academia) {
        List<Alumnos> lista = academia.listarAlumnos();
        StringBuilder sb = new StringBuilder();
        for (Alumnos a : lista) {
            sb.append(a.getNombre()).append(" ").append(a.getApellidos()).append(", Edad: ").append(a.getEdad()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.length() > 0 ? sb.toString() : "No hay alumnos registrados");
    }

    

}
