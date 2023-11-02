package objeto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda implements Serializable{

	public static ArrayList<VideoTeca> listaPeliculas() {

		// rellenamos los array con las variables creadas en nuestro objeto VideoTeca, y
		// nuestro objeto Usuario

		ArrayList<VideoTeca> listaPeliculas = new ArrayList<>();

		listaPeliculas.add(new VideoTeca("Terror", "A NIGHTMARE ON ELM STREET 3: DREAM WARRIORS", "Chuck Russell", 20, 20.5, "P01"));
		listaPeliculas.add(new VideoTeca("Terror", "PHENOMENA", "Dario Argento", 20, 20.5, "P02"));
		listaPeliculas.add(new VideoTeca("Terror", "BRAM STOKER'S DRACULA", " Francis Ford Coppola", 20, 20.5, "P03"));

		listaPeliculas.add(new VideoTeca("Comedy", "Haunted Mansion", "Justin Simien", 20, 20.5, "P04"));
		listaPeliculas.add(new VideoTeca("Comedy", "Barbie", "Greta Gerwig", 20, 20.5, "P05"));
		listaPeliculas.add(new VideoTeca("Comedy", "Totally Killer", "Nahnatchka Khan", 20, 20.5, "P06"));

		listaPeliculas.add(new VideoTeca("Drama", "Reptile ", "Grant Singer", 20, 20.5, "P07"));
		listaPeliculas.add(new VideoTeca("Drama", "The Creator ", "Gareth Edwards", 20, 20.5, "P08"));
		listaPeliculas.add(new VideoTeca("Drama", "Nowhere ", "Albert Pintó", 20, 20.5, "P09"));

		listaPeliculas.add(new VideoTeca("Documentary", "Beckham", " Fisher Stevens", 20, 20.5,"P10"));
		listaPeliculas.add(new VideoTeca("Documentary", "Encounters ", "Gráinne Kelly", 20, 20.5, "P11"));
		listaPeliculas.add(new VideoTeca("Documentary", "Welcome to Wrexham", "Ryan Reynolds", 20, 20.5,"P12"));

		return listaPeliculas;

	}

	public static ArrayList<Clientes> listaClientes() {

		ArrayList<Clientes> listaClientes = new ArrayList<>();

		listaClientes.add(new Clientes("Luca", "Vazquez", "Luca86", "Admin1"));
		listaClientes.add(new Clientes("Mario", "Vargas", "Mario11", "Admin2"));
		listaClientes.add(new Clientes("Sergio", "Dalmas", "Sergio12", "Admin3"));
		listaClientes.add(new Clientes("Marcos", "Aurelio", "Marcos2", "Admin4"));

		return listaClientes;

	}

	public static ArrayList<Empleados> listaEmpleados() {

		ArrayList<Empleados> listaEmpleados = new ArrayList<>();

		listaEmpleados.add(new Empleados("Lucas", "Montessori", "Luca90", "Admin11"));
		listaEmpleados.add(new Empleados("Rud", "Mikes", "Mike22", "Admin22"));
		listaEmpleados.add(new Empleados("Alberto", "Rios", "Sergio12", "Admin33"));
		listaEmpleados.add(new Empleados("Pau", "Guerrero", "Guerrero22", "Admin44"));

		return listaEmpleados;

	}

}
