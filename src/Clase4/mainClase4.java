package Clase4;

public class mainClase4 {
    public static void main(String[] args) {
        //1.Conversión implícita de int a double
        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;

        System.out.println("Número entero:" + numeroEntero);
        System.out.println("Número convertido a double:" + numeroDecimal);

        //2.Conversión explícita de double a int con truncamiento
        double valorDecimal = 8.80;
        //conversión explicita, casting
        int valorEntero = (int) valorDecimal;

        System.out.println("Valor original, double: " + valorDecimal);
        System.out.println("Valor convertido con el int: " + valorEntero);

        //3. Desbordamiento. Int a byte
        int numeroGrande = 150;
        //conversión explícita a byte
        byte numeroPequeño = (byte) numeroGrande;

        System.out.println("Número original en int: " + numeroGrande);
        System.out.println("Número convertido a byte:" + numeroPequeño);

        //4. Conversión de String a int con Integer.parseInt()
        String texto = "123";
        int numero = Integer.parseInt(texto);

        System.out.println("Texto:" + texto);
        System.out.println("Número convertido: " + numero);
        //Haz el cambio al reves

        //5. Conversión de char a int (Código ASCII)
        // Declaramos un carácter
        char letra = 'A';
        // Conversión implícita de char a int
        // Java convierte 'A' a su código ASCII (65)
        int codigoASCII = letra;

        System.out.println("Carácter: " + letra);
        System.out.println("Código ASCII: " + codigoASCII);

        //6. Convertir un int a String
        int numerito = 456;
        String textito = String.valueOf(numerito);

        System.out.println("Numero: " + numerito);
        System.out.println("Texto convertido: " + textito);

        //7. Conversión double a String
        double precio = 99.99;
        String textoPrecio = Double.toString(precio);

        System.out.println("Precio como String: " + textoPrecio);

        //8. Conversión de Boolean a String
        boolean activo = true;
        //conversión a String
        String estado = String.valueOf(activo);

        System.out.println("Estado convertido: " + estado);

        //9. Conversión para operaciones matemáticas
        int a = 5, b = 2;

        System.out.println("División entera: " + (a/b));
        //conversión a double para tener decimales
        double resultado = (double)a/b;

        System.out.println("División con casting: " + resultado);

        //10. Conversión de long a int y de float a int
        long numeroLargo = 1_000_000_000L;
        //convertir de long a int
        int numeroEnterito = (int)numeroLargo;

        System.out.println("Número con cambio de long a int: " + numeroEnterito);

    }
}
