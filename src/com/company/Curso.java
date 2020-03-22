package com.company;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombre;
    private Integer codigoDeCurso;
    private Profesor profesorTitular;
    private Profesor profesorAdjunto;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno> listadoDeAlumnos;

    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximoDeAlumnos) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximoDeAlumnos = cupoMaximoDeAlumnos;
    }

    //3. Crear los getter y setters para los atributos anteriores.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCurso) {
        this.codigoDeCurso = codigoDeCurso;
    }

    //4. Un curso es igual a otro si sus códigos de curso son iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoDeCurso, curso.codigoDeCurso);
    }


    @Override
    public int hashCode() {
        return Objects.hash(codigoDeCurso);
    }

    public Boolean agregarUnAlumno(Alumno unAlumno) {
        return (listadoDeAlumnos.size() < this.cupoMaximoDeAlumnos);
    }
    public void eliminiarAlumno(Alumno unAlumno){
        listadoDeAlumnos.remove(unAlumno);
    }

}
