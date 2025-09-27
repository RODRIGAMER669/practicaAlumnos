package com.example.psp.practica.uno.modelo;

import lombok.Data;

@Data
public class Alumnos {
    private String nombre;
    private String apellidos;
    private int edad;

    public Alumnos(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


}
