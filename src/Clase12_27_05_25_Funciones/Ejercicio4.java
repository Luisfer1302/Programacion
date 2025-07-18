//4. Reorganiza este código en funciones
//Convierte este código en un programa que use mínimo dos funciones: una para cargar datos, y otra para imprimirlos.

package Clase12_27_05_25_Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String[] datos = cargarDatos();
        imprimirMensaje(datos[0], Integer.parseInt(datos[1]));

    }

    public static String[] cargarDatos(){
        Scanner sc = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.print("Introduce tu nombre: ");
        datos[0] = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        datos[1] = sc.nextLine();

        return datos;
    }

    public static void imprimirMensaje(String nombre, int edad){
        System.out.println("Hola "+ nombre + " tienes " + edad + " años");
    }
}
