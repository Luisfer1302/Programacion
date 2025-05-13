package Clase9__29_04_2025__ArrayList;

import java.util.Scanner;

public class Ejercicio4_Arrays1 {
    public static void main(String[] args) {
        int[] numeros = {12, 34, 56, 78, 90};
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número para buscar: ");
        int buscado = scanner.nextInt();

        // Buscar el número en el array
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
                break; // Salir del bucle al encontrarlo
            }
        }

        // Si no se encuentra
        if (!encontrado) {
            System.out.println("Número no encontrado en el array.");
        }

        scanner.close();
    }
}
