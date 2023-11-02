package cliente;

import java.util.ArrayList;
import java.util.Scanner;
import objeto.Clientes;
import objeto.DataRetriever;

public class Login {
    private static Scanner read = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario

    public static void accessoClientes() {

        Clientes usuariotemp = null; // Variable para almacenar el usuario temporal

        // Llama a un método de la clase DataRetriever que devuelve un ArrayList de clientes
        ArrayList<Clientes> listaClientes = DataRetriever.getListaClientes();

        boolean opcionNoValida = true; // Variable para controlar el bucle while

        while (opcionNoValida){ // Bucle while que se ejecuta mientras la opción no sea válida
            System.out.println("Dame tu usuario"); // Solicita al usuario que introduzca su nombre de usuario
            String user = read.next(); // Lee la entrada del usuario

            for (Clientes clientes : listaClientes) { // Bucle for para recorrer la lista de clientes
                String userId = clientes.getUserId(); 
                if (userId.equalsIgnoreCase(user)) { // Comprueba si el nombre de usuario introducido coincide con algún nombre de usuario en la lista de clientes
                    usuariotemp = clientes; // Si hay una coincidencia, almacena el cliente en usuariotemp
                    break; // Rompe el bucle for
                }
            }

            if (usuariotemp == null) { // Comprueba si usuariotemp es null, lo que significa que no se encontró ninguna coincidencia
                System.out.println("Usuario no encontrado."); // Imprime un mensaje indicando que el usuario no fue encontrado

            } else { 
                boolean correcto = false; // Variable para controlar el bucle while

                while (!correcto) { // Bucle while que se ejecuta mientras la contraseña no sea correcta
                    System.out.println("Dame tu contraseña"); // Solicita al usuario que introduzca su contraseña
                    String password = read.next(); // Lee la entrada del usuario

                    if (password.equals(usuariotemp.getPassWd())) { // Comprueba si la contraseña introducida coincide con la contraseña del cliente almacenado en usuariotemp
                        System.out.println("Bienvenido " + usuariotemp.getNombre()); // Si hay una coincidencia, imprime un mensaje de bienvenida
                        correcto = true; // Establece correcto a true para romper el bucle while
                        opcionNoValida = false; // Establece opcionNoValida a false para romper el bucle while exterior
                        MenuClientes.tipoDeBusqueda(); 
                    } else {
                        System.out.println("Contraseña incorrecta. Inténtalo de nuevo."); // Si no hay una coincidencia, imprime un mensaje indicando que la contraseña es incorrecta
                    }
                }
            }
        }
    }
}
