package cliente;

import java.util.ArrayList;
import java.util.Scanner;
import objeto.VideoTeca;
import objeto.DataRetriever;

public class MenuClientes {

	public static void tipoDeBusqueda() {

		Scanner read = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
		int opc; // Variable para almacenar la opción seleccionada por el usuario

		// Crea una instancia de DataRetriever
		DataRetriever dataRetriever = new DataRetriever();

		// Crea un ArrayList<VideoTeca>
		ArrayList<VideoTeca> listaPeliculas = dataRetriever.getListaPeliculas();

		// Pasa el ArrayList al constructor de EntradaCliente
		EntradaCliente entradaCliente = new EntradaCliente(dataRetriever);

		do {
			System.out.println("Bienvenido a la Videoteca elige la operacion que quieres hacer");
			System.out.println("1: Buscar peliculas por titulo");
			System.out.println("2: Buscar peliculas por director ");
			System.out.println("3: Buscar peliculas por id");
			System.out.println("4: Buscar peliculas por genero");
			opc = read.nextInt(); // Lee la opción seleccionada por el usuario

			switch (opc) { // Realiza una acción diferente dependiendo de la opción seleccionada
			case 1:
				entradaCliente.busquedaPorTitulo(); // Usa la instancia para llamar al método busquedaPorTitulo()
				break;
			case 2:
				entradaCliente.busquedaPorDirector(); // Usa la instancia para llamar al método busquedaPorDirector()
				break;
			case 3:
				entradaCliente.busquedaPorId(); // Usa la instancia para llamar al método busquedaPorId()
				break;
			case 4:
				entradaCliente.buscarPeliculasGenero(); // Usa la instancia para llamar al método buscarPeliculasGenero()
				break;
			default:
				System.out.println("Opcion no valida. Por favor, elige una opcion entre 1 y 4."); // Imprime un mensaje si la opción seleccionada no es válida
			}

		} while (opc < 1 || opc > 4); // Repite el bucle mientras la opción seleccionada sea menor que 1 o mayor que 4
	}
}
