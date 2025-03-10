package Clase3;

public class Clase3Ejercicios {
    public static void main(String[] args) {

        //Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        final double GRAVEDAD = 9.81;
        System.out.println("El valor de GRAVEDAD es: " + GRAVEDAD);

        //Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        int a = 25;
        int b = 7;
        System.out.println("Suma:" + (a + b));
        System.out.println("Resta:" + (a - b));
        System.out.println("Multiplicación:" + (a * b));
        System.out.println("División:" + (a / b));
        System.out.println("Módulo:" + (a % b));

        //Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).
        int v = 20;
        System.out.println("La persona es menor de edad: " + (v<18));
        System.out.println("La persona es mayor de edad: " + (v>18));

        //Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.
        int c = 20;
        int d = 15;
        System.out.println("¿Es c igual a d?: " + (c==d));
        System.out.println("¿Es c menor a d?: " + (c<d));
        System.out.println("¿Es c mayor a d?: " + (c>d));

        //Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?
        boolean resultado = (5 > 3) && (10 < 20);
        System.out.println("El resultado de la expresión es: " + resultado);

        //Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.
        boolean resultado1 = (5 > 3) || (10 > 20);
        System.out.println("El resultado de la expresión es: " + resultado1);
        //Al tener uno de los dos true, el resultado será true.

        //Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("¿Es x+y igual a z?: " + (x+y==z));
        System.out.println("¿Es x+y menor a z?: " + (x+y<z));
        System.out.println("¿Es x+y mayor que z?: " + (x+y>z));
        System.out.println("¿Es x+y diferente a z?: " + (x+y!=z));

        //Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).


        //Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).


        // Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.


    }
}
