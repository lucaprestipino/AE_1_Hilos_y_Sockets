package cliente;

import java.util.ArrayList;
import java.util.Scanner;

import objeto.Empleados;
import objeto.DataRetriever;

public class LoginVentas {

	public class Login {

		public static void accessoClientes() {

			Empleados usuariotemp = new Empleados(); // Crea un nuevo objeto de la clase Empleados
			Scanner read = new Scanner(System.in); // Crea un nuevo objeto Scanner para leer la entrada del usuario

			ArrayList<Empleados> listaEmpleados = DataRetriever.getListaEmpleados(); // Obtiene la lista de empleados de DataRetriever

			boolean opcionNoValidaLogin = true; // Variable para controlar el bucle while

			while (opcionNoValidaLogin) { // Bucle while que se ejecuta mientras la opción no sea válida
				System.out.println("Dame tu usuario"); // Solicita al usuario que introduzca su nombre de usuario
				String user = read.next(); // Lee la entrada del usuario

				for (Empleados empleados : listaEmpleados) { // Bucle for para recorrer la lista de empleados
					String userId = empleados.getUserId();
					if (userId.equalsIgnoreCase(user)) { // Comprueba si el nombre de usuario introducido coincide con algún nombre de usuario en la lista de empleados
						usuariotemp = empleados; // Si hay una coincidencia, almacena el empleado en usuariotemp
					}
				}

				if (usuariotemp.getUserId() == null) { // Comprueba si el nombre de usuario de usuariotemp es null, lo que significa que no se encontró ninguna coincidencia
					System.out.println("Usuario no encontrado."); // Imprime un mensaje indicando que el usuario no fue encontrado

				} else {
					boolean correcto = false; // Variable para controlar el bucle while

					while (!correcto) { // Bucle while que se ejecuta mientras la contraseña no sea correcta
						System.out.println("Dame tu contraseña"); // Solicita al usuario que introduzca su contraseña
						String password = read.next(); // Lee la entrada del usuario

						if (password.equals(usuariotemp.getPassWd())) { // Comprueba si la contraseña introducida coincide con la contraseña del empleado almacenado en usuariotemp
							System.out.println("Bienvenido " + usuariotemp.getNombre()); // Si hay una coincidencia, imprime un mensaje de bienvenida
							MenuClientes.tipoDeBusqueda(); 
						}
					}
				}
			}
		}
	}
}
