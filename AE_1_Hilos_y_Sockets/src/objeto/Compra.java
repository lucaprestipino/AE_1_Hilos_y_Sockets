package objeto;

import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable {

	private VideoTeca peliculas;

	private String id;
	private int cantidad;
	private ArrayList<Compra> listaCompras;

	public Compra(VideoTeca peliculas, String id, int cantidad, ArrayList<Compra> listaCompras) {
		super();
		this.peliculas = peliculas;
		this.id = id;
		this.cantidad = cantidad;
		this.listaCompras = listaCompras;
	}

	public Compra() {
	}

	public VideoTeca getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(VideoTeca peliculas) {
		this.peliculas = peliculas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

}
