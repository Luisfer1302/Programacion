package Clase11_20_05_25_Funciones;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Luis", 5.0);
        notas.put("Pepe", 9.0);

        for (Map.Entry<String, Double> entrada : notas.entrySet()){

            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}
