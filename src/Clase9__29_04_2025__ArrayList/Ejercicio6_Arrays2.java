package Clase9__29_04_2025__ArrayList;

public class Ejercicio6_Arrays2 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] invertido = new int[original.length];

        // Copiar los elementos en orden inverso
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }

        // Mostrar resultado
        System.out.print("Array invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}
