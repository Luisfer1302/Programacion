package Clase9__29_04_2025__ArrayList;

public class Ejercicio3_Arrays1 {
    public static void main(String[] args) {
        int[] numeros = {23, 5, 87, 16, 45};

        // Inicializar mínimo y máximo con el primer valor
        int max = numeros[0];
        int min = numeros[0];

        // Buscar máximo y mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}
