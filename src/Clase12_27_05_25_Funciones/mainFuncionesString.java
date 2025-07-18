package Clase12_27_05_25_Funciones;

public class mainFuncionesString {
    public static void main(String[] args) {

        String email = "pepe@gmail.com";
        String nombreUsuario = email.substring(0,email.indexOf("@"));
        System.out.println(nombreUsuario);

        String servidor = email.substring(email.indexOf("@")+ 1);
        System.out.println(servidor);

        int [] numeros = {1,5,6,8,10};
        System.out.println("La media es: " + calcularMedia(numeros));

    }

    public static double calcularMedia (int [] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
    }
}
