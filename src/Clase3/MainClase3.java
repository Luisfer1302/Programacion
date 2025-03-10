package Clase3;

public class MainClase3 {
    public static void main(String[] args) {
      //Declaras una constante con la palabra final//
        final double PI = 3.1416;
        final int mayoriaEdad = 18;

        System.out.println("El valor de PI es : " + PI);
        System.out.println("La edad mínima para ser adulto en España es  :" + mayoriaEdad );

        //Operadores aritméticos (módulo es el resto de la división)
        int numero1 = 8;
        int numero2 = 4;

        System.out.println("Suma:" + (numero1 + numero2));
        System.out.println("Resta:" + (numero1 - numero2));
        System.out.println("Multiplicación:" + (numero1 * numero2));
        System.out.println("División:" + (numero1 / numero2));
        System.out.println("Módulo:" + (numero1 % numero2));

        //Operadores relacionales
            int x = 10;
            int y = 20;

        System.out.println("Es x igual a y?: " + (x==y));
        System.out.println("Es x diferente a y?: " + (x!=y));
        System.out.println("Es x mayor que y?: " + (x>y));
        System.out.println("Es x menor que y?: " + (x<y));

        //Operadores lógicos - es aquel que combina expresiones lógicas
            boolean a = true;
            boolean b = false;

        System.out.println("a AND b:" + (a && b)); //Y
        System.out.println("a OR b: " + (a || b)); //O
        System.out.println("NOT a: " + (!a)); //No algo (negativo o lo contrario)

        //Expresiones y/o evaluaciones
            int resultado = (10 + 5) * 2/3;
            int resultado2 = 10+5*2/3;
            System.out.println("El resultado de la expresión es: " + resultado);
            System.out.println("El resultado de la expresión es: " + resultado2);

    }
}
