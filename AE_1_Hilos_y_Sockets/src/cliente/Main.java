package cliente;

import java.util.ArrayList;
import java.util.Scanner;

import objeto.Clientes;
import objeto.Tienda;

public class Main {


	public static void main(String[] args) {
		
		ArrayList<Clientes> listaClientes = Tienda.listaClientes();

      MenuPrincipal.inicio();

}
	
}
