package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Profesor> listaProfesor;
    List<Alumno> listaAlumno;
    List<Curso> listaCurso;
    List<Inscripcion> listaInscripcion;

    DigitalHouseManager() {
        this.listaAlumno = new ArrayList<>();
        this.listaCurso = new ArrayList<>();
        this.listaInscripcion = new ArrayList<>();
        this.listaProfesor = new ArrayList<>();
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        Curso unCurso = new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        listaCurso.add(unCurso);
        System.out.println("Se a agregador a la lista de curso el curso código" + codigoCurso);
    }

    public void bajaCurso(Integer codigoCurso){
        listaCurso.remove(codigoCurso);
        System.out.println("Se a dado el curso codigo: " + codigoCurso);
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras) {
        Profesor unProfesor = new ProfesorAdjunto(nombre, apellido, 0, codigoProfesor, cantidadDeHoras);
        listaProfesor.add(unProfesor);
        System.out.println("Se a agregado a la lista de profesores el profesor código" + codigoProfesor);
    }


}
