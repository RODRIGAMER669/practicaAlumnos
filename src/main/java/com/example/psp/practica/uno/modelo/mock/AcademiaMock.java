package com.example.psp.practica.uno.modelo.mock;

import java.util.ArrayList;
import java.util.List;

import com.example.psp.practica.uno.modelo.Academia;
import com.example.psp.practica.uno.modelo.Alumnos;

public class AcademiaMock implements Academia {

    private List<Alumnos> lista = new ArrayList<>();

    @Override
    public void insertar(Alumnos a){
        lista.add(a);
    }

    @Override
    public List<Alumnos> listarAlumnos(){
        return lista;
    }

}
