package cliente;

import java.util.Scanner;

import objeto.DataRetriever;

public class MenuVentas {
	
 public static void operacionVendedor() {
	 
	DataRetriever dataRetriever = new DataRetriever();
	EntradaVentas entradaVentas = new EntradaVentas(dataRetriever); // Crea una instancia de EntradaVentas

	Scanner read = new Scanner(System.in);
	 
	System.out.println("Indica la operacion a realizar ");
	System.out.println("1: Agregar pelicula");
	System.out.println("2: Remover peliculas ");
	int opc = read.nextInt();
	 
	if(opc==1) {
		entradaVentas.agregarPeliculas(); // Usa la instancia para llamar al método agregarPeliculas()
	}
	else if(opc==2) {
		entradaVentas.removerPeliculas(); // Usa la instancia para llamar al método removerPeliculas()
	}
 }
}
