package Clase9__29_04_2025__ArrayList;

public class Ejercicio8_Arrays2 {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        //guardar último elemento
        int ultimo = array[array.length - 1];

        //recorrido inverso
        for (int i = array.length - 1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = ultimo;
    }
}
