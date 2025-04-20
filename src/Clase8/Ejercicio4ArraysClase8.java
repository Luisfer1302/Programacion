package Clase8;
import java.util.Scanner;

public class Ejercicio4ArraysClase8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = {10, 25, 30, 16, 58};

        System.out.println("Introduce el número a buscar:");
        int buscado = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado){
                System.out.println("El número" + buscado + "está en la posición: "+ (i + 1));
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Tu número no está en la lista");
        }
    entrada.close();
    }
}
