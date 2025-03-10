package Clase2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("TIPOS PRIMITIVOS DE JAVA");


        // ENTEROS (NÚMEROS SIN DECIMALES)
        // EJERCICO 1:
        // Crea una variable de cada tipo entero y asígnale valores distintos.
        // Luego imprimelas con System.out.println().

        byte numeroByte = 8;
        System.out.println("Quiero imprimir mi numero: " + numeroByte );

        short numeroShort = 19800;
        System.out.println("Quiero ver mi número short pero YA: " + numeroShort);

        int numeroInt = 265891472;
        System.out.println("Quiero ver mi entero: " + numeroInt);

        long numeroLong = 263987521L;
        System.out.println("Quiero ver mi long: " + numeroLong);


        //FLOTANTES (NÚMEROS CON DECIMALES)
        //EJERCICIO 2:
        // Declara una variable de tipo float y otra de tipo double con valores distintos.
        // Imprímelas en la consola.


        System.out.println("NUMEROS FLOTANTES");
        float numeroFloat =0.8f;
        System.out.println("Mi float querido es: " + numeroFloat);

        double numeroDouble = 32325620.35;
        System.out.println("Aquí está mi double bonito: " + numeroDouble);

        //BOOLEANOS (VERDADERO O FALSO)
        //EJERCICIO 3:
        //Declara una variable boolean y asígnale un valor falso.
        //Luego usa un `if` para imprimir un mensaje si es true o false.

        System.out.println("BOOLEANOS");

        boolean esFalso = false;
        boolean esVerdadero = true;
        System.out.println("¿Es Carlos Alcaraz el mejor tenista del mundo?" + esFalso);
        System.out.println("¿Es Rafael Nadal el mejor tenista español de la historia?: " + esVerdadero);


        //CARACTERES (UN SOLO USO)
        // EJERCICIO 4:
        //Declara una variable de tipo char con tu inicial y otra con un símbolo especial.
        //Imprímelas en la consola.

        System.out.println("CARACTERES");
        char letra ='L';
        char simbolo = '+';
        char unicode = '㚉';
        System.out.println("La letra de mi inicial es:" + letra);
        System.out.println("¿Cómo escribo el signo se sumar?: " + simbolo);
        System.out.println("¿Qué símbolo soy?: " + unicode);

        //CADENAS DE TEXTO (STRINGS)
        //EJERCICIO 5:
        //Declara una variable String con tu nombre y otra con tu lenguaje favorito.
        //Concátalas en un mensaje y muestra el resultado.
        System.out.println("CADENAS DE TEXTO");
        String texto = "Mi nombre es Luis";
        System.out.println("¿Cómo me llamo?: " + texto);
        String texto1 = "Mi lenguaje favorito es el Inglés";
        System.out.println("¿Cuál es mi lenguaje favorito?: " + texto1);

        //ARRAYS (LISTAS DE VALORES)
        //EJERCICIO 6:
        // Declara un array de 5 nombres y muéstralos en la consola usando un bucle.

        int [] numerosArray = {10,20,30,40,50};
        System.out.println("Te imprimo el valor de la primera posición: " + numerosArray[0]);
        System.out.println("Te imprimo el segundo valor: " + numerosArray[1]);
        System.out.println("Te imprimo el tercer valor: " + numerosArray[2]);
        System.out.println("Te imprimo el cuarto valor: " + numerosArray[3]);
        System.out.println("Te imprimo el quinto valor: " + numerosArray[4]);


        //=====================================================
        //  LITERALES EN JAVA
        // Un literal es un valor constante que se usa directamente en el código.
        // Ejemplos: números, texto, valores booleanos.
        // =====================================================
        //  EJERCICIO 7:
        // Usa literales para imprimir en consola:
        // Un número entero, un decimal, un booleano y una cadena de texto

        System.out.println(100);
        System.out.println(0.68);
        System.out.println("¿Voy a aprobar todas las asignaturas?: " + esVerdadero);
        System.out.println("Hola clase");
    }
}
