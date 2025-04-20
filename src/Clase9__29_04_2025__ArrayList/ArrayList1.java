package Clase9__29_04_2025__ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'salir' para finalizar): ");
        String nombre;

        do{
            System.out.println("Nombre: ");
            nombre= entrada.nextLine();

            if(!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }

        }while (!nombre.equalsIgnoreCase("salir"));

        int opcion;
        boolean continuar = true;

        do {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("2. Obtener nomnre por posición");
            System.out.println("0. Salir");
            System.out.println("Consola: ");

            opcion = entrada.nextInt();
            entrada.nextInt();

            switch (opcion) {

                case 1 -> {
                    if (nombres.isEmpty()) { //Comprobamos si está vacio o no hay nombres
                        System.out.println("No hay nombres");
                    } else {
                        for (String nom : nombres) {
                        System.out.println(" - " + nom);
                        }
                    }
                }

                case 2 -> {
                    System.out.println("Introduce la posición:");
                    int pos = entrada.nextInt();
                    pos--;

                    if (pos >= 0 && pos < nombres.size()) {
                        System.out.println("Nombre en la posición elegida: " + nombres.get(pos));
                    } else {
                        System.out.println("Introduce una posición válida.");
                    }
                }

                case 0 -> {
                    System.out.println("Fin");
                    continuar = false;
                }

                default ->{
                        System.out.println("Opción no válida");
                        continuar = false;
                }
            }

        } while (opcion != 0 && continuar);

        entrada.close();
    }
}
