package cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import objeto.VideoTeca;
import objeto.DataRetriever;

public class EntradaVentas implements Serializable{

    private ArrayList<VideoTeca> listaPeliculas; // Lista de películas
    private ArrayList<VideoTeca> listaCompra; // Lista de compras
    private transient Scanner read = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    private DataRetriever dataRetriever; // Objeto para recuperar datos

    public EntradaVentas(DataRetriever dataRetriever) {
        this.dataRetriever = dataRetriever; // Inicializa el objeto dataRetriever
        this.listaPeliculas = dataRetriever.getListaPeliculas(); // Obtiene la lista de películas
        this.listaCompra = new ArrayList<>(); // Inicializa la lista de compras
    }

	public ArrayList<VideoTeca> agregarPeliculas() {

		VideoTeca nuevaPelicula = new VideoTeca(); // Crea una nueva película

		System.out.println("Dame el titulo de la pelicula que quieres agregar");
		nuevaPelicula.setTitulo(read.next()); // Establece el título de la película
		System.out.println("Dame el nombre del Director de la pelicula que quieres agregar");
		nuevaPelicula.setDirector(read.next()); // Establece el director de la película
		System.out.println("Dame el genero de la pelicula que quieres agregar");
		nuevaPelicula.setGeneropelicula(read.next()); // Establece el género de la película
		System.out.println("Dame el id de la pelicula que quieres agregar");
		nuevaPelicula.setIdpelicula(read.next()); // Establece el ID de la película
		System.out.println("Dame el stock de existencias de la pelicula que quieres agregar");
		nuevaPelicula.setStock(read.nextInt()); // Establece el stock de la película

		listaPeliculas.add(nuevaPelicula); // Agrega la nueva película a la lista

		return listaPeliculas; // Devuelve la lista actualizada

	}

	public ArrayList<VideoTeca> removerPeliculas() {

		System.out.println("Dame el id de la pelicula que quieres remover");
		String idPelicula = read.next(); // Lee el ID de la película a eliminar

		for (int i = 0; i < listaPeliculas.size(); i++) { // Bucle para recorrer la lista de películas
			if (listaPeliculas.get(i).getIdpelicula().equals(idPelicula)) { // Comprueba si el ID de la película coincide con el ID proporcionado por el usuario
				listaPeliculas.remove(i); // Si hay una coincidencia, elimina la película de la lista
				break;
			}
		}

		return listaPeliculas; // Devuelve la lista actualizada
	}
}
