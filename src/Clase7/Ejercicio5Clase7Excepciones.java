package Clase7;
public class Ejercicio5Clase7Excepciones {
    public static void main(String[] args) {
        String nombre = null;

        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: El nombre no ha sido inicializado.");
        }
    }
}
