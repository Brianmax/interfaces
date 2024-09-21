package ejercicio9.clases;

import ejercicio9.interfaces.Estudiante;
import ejercicio9.interfaces.Profesor;

import java.util.List;

public class EstudianteProfesor extends Persona implements Estudiante, Profesor {
    private List<String> cursos;
    private List<String> cursosImpartidos;

    public EstudianteProfesor(String nombre, List<String> cursos, List<String> cursosImpartidos) {
        super(nombre);
        this.cursos = cursos;
        this.cursosImpartidos =  cursosImpartidos;
    }
    // interfaz usuario
    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando sesion desde una cuenta de estudiante y profesor");
    }
    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion desde una cuenta de estudiante profesor");
    }

    // interfaz estudiante
    @Override
    public void matricularCurso() {
        System.out.println("ProfesorEstudiante se matriculo a un curso");
    }

    @Override
    public void entregarTarea() {
        System.out.println("ProfesorEstudiante entregando tarea...");
    }

    // interfaz profesor

    @Override
    public void calificarExamen() {
        System.out.println("ProfesorEstudiante calificando un examen...");
    }
    @Override
    public void asignarTarea() {
        System.out.println("ProfesorEstudiante asignando una tarea");
    }
}
