package Clase5;

import java.util.Random;
import java.util.Scanner;
public class EjerciciosClase5 {
    public static void main(String[] args) {
        //Clase10_13_05_25_ArrayListBase.Ejercicios de Nivel Medio (Fácil)

        //Ejercicio 1: Clasificación de edad
            //Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.
        Scanner scanner = new Scanner(System.in);
                //Pedimos la edad:
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
                 //Usamos if para clasificar la edad:
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
        //scanner.close();
        //Ejercicio 2: Contador de vocales
            //Pide al usuario una palabra y cuenta cuántas vocales tiene.
        Scanner scanner1 = new Scanner(System.in);
                    //Pedimos la palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase(); // pasamos to_do a minúsculas
        int contador = 0;
                     //Recorremos la palabra con un for
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if ("aeiou".indexOf(letra) != -1) { // si la letra es una vocal
                contador++;
            }
        }
        System.out.println("Número de vocales: " + contador);
         // scanner.close();

        //Clase10_13_05_25_ArrayListBase.Ejercicios de Nivel Medio (Intermedio)

        //Ejercicio 3: Simulación de una calculadora
            //Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.
        Scanner scanner2= new Scanner(System.in);

        System.out.println("Menú:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");

        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
        //scanner.close();
        //Ejercicio 4: Números pares hasta N
            //Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        //scanner.close()

        //Ejercicio 5: Contraseña con intentos limitados
            //Pide al usuario una contraseña. Solo tiene 3 intentos antes de bloquearse.
        Scanner scanner4 = new Scanner(System.in);
        String contrasenaCorrecta = "secreta";
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Ingresa la contraseña: ");
            String contrasena = scanner.nextLine();
            if (contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido.");
                return;
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
            }
        }
        System.out.println("Acceso bloqueado.");
        //scanner.close();

        //Clase10_13_05_25_ArrayListBase.Ejercicios de Nivel Alto (Avanzado)

        //Ejercicio 6: Adivina el número
            //Genera un número aleatorio entre 1 y 100 y deja que el usuario lo adivine con pistas.

        Scanner scanner5 = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento1;
        do {
            System.out.print("Adivina el número (1-100): ");
            intento1 = scanner.nextInt();
            if (intento1 < numeroSecreto) {
                System.out.println("Muy bajo.");
            } else if (intento1 > numeroSecreto) {
                System.out.println("Muy alto.");
            }
        } while (intento1 != numeroSecreto);
        System.out.println("¡Felicidades! Adivinaste el número.");
        //scanner.close();

        //Ejercicio 7: Serie Fibonacci
            //Pide un número n y muestra los primeros n términos de la serie de Fibonacci.

        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Número de términos: ");
        int m = scanner.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
