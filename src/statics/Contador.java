package statics;

public class Contador {
    public String nombreContador;
    public static int contadorVariable = 0;

    public Contador(String nombreContador) {
        this.nombreContador = nombreContador;
        contadorVariable++;
    }

    public static void hola() {
        System.out.println("Hola desde un metodo estatico");
        System.out.println("El numero de instancias de contador es: " + contadorVariable);
    }

    public String getNombreContador() {
        return nombreContador;
    }

    public void setNombreContador(String nombreContador) {
        this.nombreContador = nombreContador;
    }
}
