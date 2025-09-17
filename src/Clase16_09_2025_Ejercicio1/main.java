package Clase16_09_2025_Ejercicio1;

public class main {

    public static void main(String[] args){

        Vehiculo[] vehiculos = { new coche(120), new Bicicleta(18)};
        for (Vehiculo v : vehiculos){
            if ( v instanceof coche c){
                System.out.println("Velocidad máxima: " + c.calcularVelocidadMaxima() + "km/h");
                System.out.println("Consumo : " + c.consumo() + "l/km");
            }else if (v instanceof Bicicleta b){
                System.out.println("Velocidad máxima: " + b.calcularVelocidadMaxima() + "km/h");
                System.out.println("Calorias : " + b.consumo() + "cal");
            }
    }
}

}