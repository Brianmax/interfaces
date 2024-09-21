package ejercicio9.clases;

import ejercicio9.interfaces.Estudiante;

import java.util.List;

public class SoloEstudiante extends Persona implements Estudiante {
    private List<String> cursos;

    public SoloEstudiante(String nombre, List<String> cursos) {
        super(nombre);
        this.cursos = cursos;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Login desde una cuenta estudiantil");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesion desde una cuenta estudiantil");
    }

    @Override
    public void matricularCurso() {
        System.out.println("Matriculandonos a un curso ...");
    }

    @Override
    public void entregarTarea() {
        System.out.println("Entregando tarea ...");
    }
}
