package ejercicio9.clases;


import ejercicio9.interfaces.Usuario;

public abstract class Persona implements Usuario {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
