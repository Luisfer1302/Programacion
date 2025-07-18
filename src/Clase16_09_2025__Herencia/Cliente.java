package Clase16_09_2025__Herencia;

public class Cliente extends Usuario{

    private int puntosFidelidad;

    public Cliente(String nombre, String email, int puntosFidelidad){
        super(nombre, email);
        this.puntosFidelidad = puntosFidelidad;
    }

    public int getPuntosFidelidad(){
        return puntosFidelidad;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Cliente: " + nombre + " - " + email + " | Puntos de Fidelidad: " + this.puntosFidelidad);
    }
}
