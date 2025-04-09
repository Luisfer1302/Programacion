package Clase7;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio4Clase7Excepciones {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Adivina el número (1-10): ");
            String intentoTexto = sc.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes escribir un número válido.");
        } finally {
            System.out.println("Juego finalizado.");
            sc.close();
        }
    }
}