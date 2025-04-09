package Clase7;
import java.util.Scanner;

public class Ejercicio3Clase7Excepciones {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 2: ");

        try {
            int posicion = sc.nextInt();
            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. Debe ser 0, 1 o 2.");
        }

        sc.close();
    }
}