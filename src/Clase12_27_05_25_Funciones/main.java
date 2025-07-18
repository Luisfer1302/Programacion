package Clase12_27_05_25_Funciones;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String name = "María";
        saludar();
        saludar(name);
        saludar("Juan");
        saluda2(name);

        System.out.println(saluda2(name));
        System.out.println(sumar(5,7));
        System.out.println(sumar());
        System.out.println(sumar(2,5,8,5,7,4,5,8,7));
        System.out.println(esPar(4));

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = ent.nextInt();

        if (esPar(num)){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");

        }
    }

    //1.Imprime saludo
    public static void saludar() {
        System.out.println("Hola");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static String saluda2(String nombre) {
        System.out.println("Estoy componiendo...");
        return ("Hola, " + nombre + "!");
    }

    public static int sumar(int n1, int n2){

        return n1 + n2;
    }

    public static int sumar(int... numeros){
        int suma = 0;

        for (int n: numeros){
            suma += n;
        }
        return suma;
    }
    public static boolean esPar (int n1){
        if (n1 % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
}
