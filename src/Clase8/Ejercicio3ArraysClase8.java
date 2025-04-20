package Clase8;

public class Ejercicio3ArraysClase8 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 1, 9, -3, 0, 12, 5};

        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}

