package Clase9__29_04_2025__ArrayList;

import java.util.ArrayList;
import java.util.Collections;
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
            System.out.println("2. Obtener nomnbre por posición");
            System.out.println("3. Reemplazar nombre (set)");
            System.out.println("4. Eliminar nombre por posición (remove)");
            System.out.println("5. Verificar si existe un nombre (contains)");
            System.out.println("6. Obtener índice de un nombre (indexOf)");
            System.out.println("7. Vaciar lista de nombres (clear)");
            System.out.println("8. Ordenar lista alfabéticamente (Collections.sort)");
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


                case 3 -> {
                    System.out.println("Introduce la posición:");
                    int pos = entrada.nextInt();
                    entrada.nextLine();
                    pos--;

                    if (pos >= 0 && pos < nombres.size()) {
                        System.out.println("Escribe nombre: ");
                        String nuevoNombre = entrada.nextLine();
                        nombres.set(pos, nuevoNombre);
                        System.out.println("Nombre remplazado");
                    }else{
                        System.out.println("Posición no válida");
                    }
                }

                case 4 -> {
                    System.out.println("Introduce la posición:");
                    int pos = entrada.nextInt();
                    entrada.nextLine();
                    pos--;
                    if (pos >= 0 && pos < nombres.size()) {
                        nombres.remove(pos);
                        System.out.println("Nombre eliminado");

                    }else {
                        System.out.println("Posición no válida");
                    }
                }

                case 5 -> {
                    System.out.println("Introduce el nombre:");
                    String nombreAux = entrada.nextLine();

                    if (nombres.contains(nombreAux)){
                        System.out.println("Está en la lista");
                    }else{
                        System.out.println("No está en la lista");
                    }
                }

                case 6 -> {

                    System.out.println("Introduce el nombre:");
                    String nombreAux = entrada.nextLine();
                    int indice = nombres.indexOf(nombreAux);
                    if(indice != -1){
                        System.out.println("El nombre está en la posición : " + (indice+ 1));
                    }else {
                        System.out.println("El nombre no está en la lista");
                    }
                }

                case 7 -> {
                    nombres.clear();
                    System.out.println("Te has cargado la lista");
                }

                case 8 -> {
                    Collections.sort(nombres);
                    System.out.println("Has ordenado la lista");
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
