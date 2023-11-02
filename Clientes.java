package objeto;

import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;

public class Clientes{

	private String nombre, apellido, userId, passWd;

	public Clientes(String nombre, String apellido, String userId, String passWd) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.userId = userId;
		this.passWd = passWd;
	}

	public Clientes() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}		
	
	
	public static void main(String[] args)throws IOException {
		
		int port = 1234;
		String host ="localhost";
		
		Socket cliente = new Socket(host,port);
		
	}
	
		
	}
	
	


