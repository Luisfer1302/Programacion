package Clase8;

import java.util.Arrays;
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int indice = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        System.out.println("CONTENIDO:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ":" + numeros[i]);

        }

        for (int num : numeros ){
            System.out.println("Elemento:" + num);
        }
        while (indice < numeros.length){

            System.out.println("Posición" + (indice+1) + ":" + numeros[indice]);

            indice++;
        }


        Arrays.stream(numeros).forEach( num -> System.out.println("Elemento: " + num));


    }
}
