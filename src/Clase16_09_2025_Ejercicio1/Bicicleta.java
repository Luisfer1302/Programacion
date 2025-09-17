package Clase16_09_2025_Ejercicio1;

public class Bicicleta extends Vehiculo{
    private int numeroMarchas;

    public Bicicleta(int numeroMarchas){
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.numeroMarchas * 5.0;
    }
    @Override
    public double consumo(){
        return this.numeroMarchas * 10.0;
    }
}
