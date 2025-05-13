package Clase9__29_04_2025__ArrayList;

public class Ejercicio7_Arrays2 {
    public static void main(String[] args) {
        int[] original = {1, 2, 2, 3, 4, 4, 5};
        int[] temporal = new int[original.length];
        int tamaño = 0; // cantidad de elementos únicos encontrados

        // Recorrer cada elemento del array original
        for (int i = 0; i < original.length; i++) {
            boolean duplicado = false;

            // Verificar si ya está en el array temporal
            for (int j = 0; j < tamaño; j++) {
                if (original[i] == temporal[j]) {
                    duplicado = true;
                    break;
                }
            }

            // Si no está duplicado, lo agregamos al array temporal
            if (!duplicado) {
                temporal[tamaño] = original[i];
                tamaño++;
            }
        }

        // Crear array final sin duplicados con tamaño exacto
        int[] sinDuplicados = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            sinDuplicados[i] = temporal[i];
        }

        // Mostrar resultado
        System.out.print("Array sin duplicados: ");
        for (int num : sinDuplicados) {
            System.out.print(num + " ");
        }
    }
}
