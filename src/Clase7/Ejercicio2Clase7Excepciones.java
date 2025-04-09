package Clase7;
import java.util.Scanner;

public class Ejercicio2Clase7Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número (en texto): ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes escribir un número válido.");
        }

        sc.close();
    }
}
