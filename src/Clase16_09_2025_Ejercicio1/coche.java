package Clase16_09_2025_Ejercicio1;

public class coche extends Vehiculo{
    private int caballos;

    public coche(){

    }
    public coche(int c){
        this.caballos = c;

    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.caballos * 2.0;
    }
    @Override
    public double consumo(){
        return this.caballos * 0.05;
    }
}
