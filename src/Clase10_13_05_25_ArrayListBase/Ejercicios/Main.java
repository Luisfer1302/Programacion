package Clase10_13_05_25_ArrayListBase.Ejercicios;

import java.util.Random;

//2. Rellenar una Matriz con Números Aleatorios:
//Crea una matriz de 4x4 y rellénala con números aleatorios entre 1 y 100.
//Imprime la matriz.
//4. Transposición de una Matriz:
//Crea una matriz de 2x3 y transponla, es decir, convierte sus filas en columnas.
//Imprime la matriz original y la transpuesta.
public class Main {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transpuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();

        }
    }
}