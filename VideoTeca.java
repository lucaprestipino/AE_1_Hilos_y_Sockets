package objeto;

import java.io.Serializable;

public class VideoTeca implements Serializable{

	
	
	private String generopelicula;
	private String titulo;
	private String director;
	private int stock;
	private String idpelicula;
	private double preciopelicula;
	
	
	
	public VideoTeca() {
		
		
	}
	
	public VideoTeca( String generopelicula, String titulo, String director, int stock, double preciopelicula, String idpelicula) {
		this.generopelicula = generopelicula;
		this.titulo = titulo;
		this.director = director;
		this.stock = stock;
		this.preciopelicula = preciopelicula;
		this.idpelicula = idpelicula;
	}
	
	public String getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(String idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getGeneropelicula() {
		return generopelicula;
	}
	public void setGeneropelicula(String generopelicula) {
		this.generopelicula = generopelicula;
	}
	public double getPreciopelicula() {
		return preciopelicula;
	}
	public void setPreciopelicula(double preciopelicula) {
		this.preciopelicula = preciopelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	
}