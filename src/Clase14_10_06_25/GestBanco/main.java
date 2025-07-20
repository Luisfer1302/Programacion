package Clase14_10_06_25.GestBanco;

public class main {

    public static void main(String[] args) {

        Banco miBanco = new Banco("Mi Banco");

        Cliente c1 = new Cliente("Pepe Pérez", "444444444A", 1500.0);
        Cliente c2 = new Cliente("María Pérez", "444444444B", 800.0);

        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);

        miBanco.mostrarTodosLosClientes();

        miBanco.transferir("444444444A", "444444444B", 200.0);
        miBanco.mostrarTodosLosClientes();

    }

}
