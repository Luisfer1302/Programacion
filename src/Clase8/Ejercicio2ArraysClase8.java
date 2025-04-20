package Clase8;

import java.util.Scanner;

public class Ejercicio2ArraysClase8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int indice = 0;
        int suma = 0;
        System.out.println("CONTENIDO:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ":" + numeros[i]);
            numeros[i] = sc.nextInt();
        }

        for (int numero: numeros){
            suma += numero;
        }
        System.out.println("Suma: " + suma);

    }
}
