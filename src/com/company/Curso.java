package com.company;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
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
        this.listadoDeAlumnos = new ArrayList<>();
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
    public void setProfesorTitular(Profesor profesorTitular) {
        this.profesorTitular = profesorTitular;
    }
    public void setProfesorAdjunto(Profesor profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
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

    //Agregar y eliminar alumno
    public Boolean agregarUnAlumno(Alumno unAlumno) {
        if (listadoDeAlumnos.size() < this.cupoMaximoDeAlumnos){
            listadoDeAlumnos.add(unAlumno);
            System.out.println("Se a agregado el alumno código: " + unAlumno.getCodigoDeAlumno());
            return true;
        }
        else{
            System.out.println("No es posible agrear el alumno código: " + unAlumno.getCodigoDeAlumno());
            return false;
        }

    }


    public void eliminiarAlumno(Alumno unAlumno){
        listadoDeAlumnos.remove(unAlumno);
    }


}
