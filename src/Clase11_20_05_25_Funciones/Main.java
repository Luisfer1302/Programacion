package Clase11_20_05_25_Funciones;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();

        int suma = sumar(5,4);
        System.out.println(sumar(5,4));

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Luis", 10.0);
        notas.put("Pepe", 9.0);
        notas.put("Juan", 3.0);
        notas.put("Sergio", 6.0);
        notas.put("Bea", 9.0);

        for (Map.Entry<String, Double> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        System.out.println("Introduce un nombre:");
        String nombre = scanner.nextLine();

        if(notas.containsKey(nombre)){
            System.out.println(nombre + " tiene una nota de: " + notas.get(nombre));
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        TreeMap<String, Double> ordenado = new TreeMap<>(notas);

        for (Map.Entry<String, Double> entrada: ordenado.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }
    }

    public static int sumar(int n1, int n2){
        return n1+n2;
    }
}
