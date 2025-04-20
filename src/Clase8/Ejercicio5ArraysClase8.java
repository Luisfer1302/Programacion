package Clase8;

import java.util.Arrays;

public class Ejercicio5ArraysClase8 {
    public static void main(String[] args) {

        int[] numeros = {10, 25, 30, 16, 58};

        Arrays.sort(numeros);

        for (int num : numeros){
            System.out.println(num);
        }
    }
}
