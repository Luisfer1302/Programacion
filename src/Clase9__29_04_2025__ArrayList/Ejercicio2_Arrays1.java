package Clase9__29_04_2025__ArrayList;

public class Ejercicio2_Arrays1 {
    public static void main(String[] args) {
        // Array de enteros
        int[] numeros = {5, 10, 15, 20, 25};

        // Variable para guardar la suma
        int suma = 0;

        // Sumar los elementos
        for (int num : numeros) {
            suma += num;
        }

        // Mostrar el total
        System.out.println("Suma total: " + suma);
    }
}
