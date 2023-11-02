package cliente;

import java.util.ArrayList;
import objeto.DataRetriever;
import java.util.Scanner;

import objeto.Clientes;
import objeto.Tienda;
import objeto.VideoTeca;

public class MenuPrincipal {

	static public void inicio() {
		int opc;
		
		DataRetriever dataRetriever = new DataRetriever();
		ArrayList<VideoTeca> listaPeliculas = dataRetriever.getListaPeliculas();

		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Bienvenido a la videoteca indica la operacion a realizar:");
		System.out.println("1: Login Cliente");
		System.out.println("2: Login Empleado");
		opc = read.nextInt();
		
		
		if(opc==1) {
			
			Login login = new Login();
			login.accessoClientes();
		}

	}

}
