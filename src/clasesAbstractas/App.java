package clasesAbstractas;

public class App {
    public static void main(String[] args) {
        Figura figura = new Cuadrado("Azul", 3);
        Cuadrado cuadrado = new Cuadrado("Rojo", 3);

        cuadrado.area();
        figura.area();

        int a = 10;
    }
}
