package herencia;


public class Profesor extends Persona {
    private float salario;

    public Profesor(String nombre, String apellido, float salario) {
        super(nombre, apellido);
        this.salario = salario;
    }

    @Override
    public void decirHola() {
        System.out.println("Buenos dias alumnos");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
