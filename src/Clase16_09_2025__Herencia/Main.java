package Clase16_09_2025__Herencia;

public class Main {
    public static void main (String [] args){

        Usuario user = new Usuario("PEPE", "pepe@usuario.com");
        Usuario admin = new Admin("maría", "maria@usuario.com", "Gestor");
        Usuario cli = new Cliente("Juan", "juan@usuario.com",50);

        Usuario[] usuarios = { user, admin, cli};

        for (Usuario u : usuarios){
            if (u instanceof Admin){

            }else if (u instanceof Cliente){

            }
            u.mostrarInfo();
        }

    }
}
