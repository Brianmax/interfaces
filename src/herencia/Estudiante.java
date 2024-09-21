package herencia;


public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(String nombre, String apellido, float promedio) {
        super(nombre, apellido);
        this.promedio = promedio;
    }

    @Override
    public void decirHola() {
        System.out.println("Buenos dias a todos");
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
