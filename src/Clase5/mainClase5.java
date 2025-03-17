package Clase5;

import java.util.Scanner;
//Sin esto, no voy a poder pedirle al usuario dato alguno
public class mainClase5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int numero = scanner.nextInt(); //cpm esto, leo el número del usuario

        //Estructura del if-else
        if (numero>0){
            System.out.println("El número es positivo");
        } else if (numero<0) {
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es cero");
        }

    //scanner.close(); //Cierra el scanner.


        //3. Creame un menu interactivo donde el usuario elija una opción y muestre un mensaje

        Scanner scanner1 = new Scanner(System.in);

        //Menú de opcines
        System.out.println("*Menú de opciones*");
        System.out.println("1.Saludar");
        System.out.println("2. Mensaje motivacional");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción");
        int opcion = scanner.nextInt(); //Leemos la opción del usuario
        //Evaluar opciones con el switch
        switch (opcion) {
            case 1:
                System.out.println("Hola, Bienvenido");
                break;
            case 2:
                System.out.println("Bro, esto es massico!");
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Macho, me has dado algo que no entiendo");
        }
        //scanner. close();


        //4. Imprimir los números del 1 al 10 con un for
        //Usar un bucle para CONTAR del 1 al 10
        for (int i=1;i<=10;i++){
            System.out.println("Número: " + i);
            //Así muestro cada interacción
        }
        //Usa el while para pedir números hasta que ponga 0
      Scanner scanner2 = new Scanner(System.in);
        int numero1;
        System.out.println("Dame un número y pon 0 para salir");
        numero1 = scanner.nextInt();
            //Mientras que no sea cero, sigue pidiendo
        while(numero1!=0){
            System.out.println("Has introducido:" + numero1);
            System.out.println("Introduce otro número.");
            numero1 = scanner.nextInt();
        }
        System.out.println("Programa finalizado.");
        //scanner.close();


      //5. Pide contrasela y que nopueda entrar el usuario hasta que ponga java123
      Scanner scanner3 = new Scanner(System.in);
      String password;
      //Bucle do-while
        do{
            System.out.println("Introduce tu contraseña:");
            password = scanner.nextLine();
        }while (!password.equals("java123"));

        System.out.println("Acceso concedido");
        scanner.close();

    }

}
