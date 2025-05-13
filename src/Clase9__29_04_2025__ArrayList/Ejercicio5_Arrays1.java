package Clase9__29_04_2025__ArrayList;

import java.util.Arrays;

public class Ejercicio5_Arrays1 {
    public static void main(String[] args) {
        int[] numeros = {42, 17, 8, 33, 4};

        // Mostrar array antes de ordenar
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenar el array de menor a mayor
        Arrays.sort(numeros);

        // Mostrar array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
