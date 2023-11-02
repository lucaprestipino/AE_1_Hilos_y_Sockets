package cliente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import objeto.VideoTeca;
import objeto.DataRetriever;

public class EntradaCliente implements Serializable{
    private DataRetriever dataRetriever; // Objeto para recuperar datos
    private Scanner read = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
    ArrayList<VideoTeca> listaPeliculas = DataRetriever.getListaPeliculas(); // Lista de películas

    public EntradaCliente(DataRetriever dataRetriever) {
        this.dataRetriever = dataRetriever; // Inicializa el objeto dataRetriever
    }

    public void busquedaPorDirector() {
        VideoTeca directorEncontrado = null; // Variable para almacenar la película encontrada

        while (true) { // Bucle infinito hasta encontrar una coincidencia
            System.out.println("Introduce el nombre del director"); // Solicita al usuario que introduzca el nombre del director
            String dato = read.next(); // Lee la entrada del usuario

            for (VideoTeca peliculas : listaPeliculas) { // Bucle para recorrer la lista de películas
                if (peliculas.getDirector().equals(dato)) { // Comprueba si el director de la película coincide con la entrada del usuario
                    directorEncontrado = peliculas; // Si hay una coincidencia, almacena la película en directorEncontrado
                    System.out.println("Pelicula encontrada: " + directorEncontrado.getTitulo()); // Imprime el título de la película encontrada
                    return; // Sale del método
                }
            }

            System.out.println("Dato no encontrado vuelve a introducirlo"); // Si no se encuentra ninguna coincidencia, solicita al usuario que introduzca de nuevo el nombre del director
        }
    }

    public void busquedaPorId() {
        VideoTeca idEncontrado = null; // Variable para almacenar la película encontrada
        System.out.println("Introduce el id de la pelicula"); // Solicita al usuario que introduzca el ID de la película
        String dato = read.next(); // Lee la entrada del usuario

        for (VideoTeca peliculas : listaPeliculas) { // Bucle para recorrer la lista de películas
            if (peliculas.getIdpelicula().equals(dato)) { // Comprueba si el ID de la película coincide con la entrada del usuario
                idEncontrado = peliculas; // Si hay una coincidencia, almacena la película en idEncontrado
                System.out.println("Pelicula encontrada: " + idEncontrado.getTitulo()); // Imprime el título de la película encontrada
                return; // Sale del método
            }
        }

        System.out.println("Dato no encontrado vuelve a introducirlo"); // Si no se encuentra ninguna coincidencia, solicita al usuario que introduzca de nuevo el ID de la película
    }

    public void busquedaPorTitulo() {
        VideoTeca tituloEncontrado = null; // Variable para almacenar la película encontrada

        System.out.println("Introduce el titulo de la pelicula"); // Solicita al usuario que introduzca el título de la película
        String dato = read.next(); // Lee la entrada del usuario

        for (VideoTeca peliculas : listaPeliculas) { // Bucle para recorrer la lista de películas
            if (peliculas.getTitulo().equals(dato)) { // Comprueba si el título de la película coincide con la entrada del usuario
                tituloEncontrado = peliculas; // Si hay una coincidencia, almacena la película en tituloEncontrado
                System.out.println("Pelicula encontrada: " + tituloEncontrado.getTitulo()); // Imprime el título de la película encontrada
                return; // Sale del método
            }
        }

        System.out.println("Dato no encontrado vuelve a introducirlo");  // Si no se encuentra ninguna coincidencia, solicita al usuario que introduzca de nuevo el título de la película
    }

    public void imprimirListado() {
        for (VideoTeca peliculas : listaPeliculas) {  // Bucle para recorrer la lista de películas
            System.out.println(peliculas.getTitulo());  // Imprime el título de cada película en la lista
        }
    }

    public void buscarPeliculasGenero() {

        System.out.println("Introduce el genero de las peliculas que quieres buscar");  // Solicita al usuario que introduzca el género de las películas que quiere buscar
        String genero = read.next();  // Lee la entrada del usuario

        for (VideoTeca pelicula : listaPeliculas) {  // Bucle para recorrer la lista de películas
            if (pelicula.getGeneropelicula().equals(genero)) {  // Comprueba si el género de la película coincide con la entrada del usuario
                System.out.println(pelicula.getTitulo());  // Si hay una coincidencia, imprime el título de la película
            }
        }
    }
}
