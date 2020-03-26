package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* Dar de alta dos profesores titulares y dos profesores adjuntos

         */


        /*
        1) Voy a crear una clase de DigitalHouseManager para usar las formulas de alta antes
        2) Uso las formulas de alta profesores
        3) Uso las formulas para dar de alta dos cursos
        4) Uso la formula para asignar profesores
        5) Uso la formuala para dar de alta 3 alumnos
        
        */

        //1)
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        //2) Dar de alta dos profesores titulares y dos profesores adjuntos
        digitalHouseManager.altaProfesorTitular("jirafales","garcia", 001, "Tv Show");
        digitalHouseManager.altaProfesorTitular("edu","venezuelan",002,"Lectura");
        digitalHouseManager.altaProfesorAdjunto("Lopi","miami", 003, 5);
        digitalHouseManager.altaProfesorAdjunto("viviana","koch", 004, 6);
        //3) Dar de alta dos cursos. Estan los datos
        digitalHouseManager.altaCurso("Full Stack", 20001,3);
        digitalHouseManager.altaCurso("Android",20002,2);
        //4) Asignarle un profesor titular y un adjunto a cada curso.
        digitalHouseManager.asignarProfesores(20001,001,003);
        digitalHouseManager.asignarProfesores(2002,002,004);
        //5)Dar de alta a tres alumnos
        digitalHouseManager.altaAlumno("alan","spina", 001);
        digitalHouseManager.altaAlumno("Julian","Nari",002);
        digitalHouseManager.altaAlumno("Pedro","Aznar",003);
        //6)Inscribir a dos alumnos ne le curso de full stack
        digitalHouseManager.inscribirAlumno(001,20001);
        digitalHouseManager.inscribirAlumno(002,20001);
        //7)Inscribir a tres alimnos en el curso de android
        digitalHouseManager.inscribirAlumno(001,20002);
        digitalHouseManager.inscribirAlumno(002,20002);
        digitalHouseManager.inscribirAlumno(003,20002);
        //8) Dar de baja a un profesor
        digitalHouseManager.bajaProfesor(004);
        digitalHouseManager.bajaCurso(20001);
    }
}
