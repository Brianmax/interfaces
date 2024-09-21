package interfaces;

public interface Vehiculo {
    String color = "Azul"; // estatico final y publico

    void acelerar();
    void frenar();

    default void printColor() {
        System.out.println(color);
    }
}
