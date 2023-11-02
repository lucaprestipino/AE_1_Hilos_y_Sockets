package objeto;

import java.io.Serializable;

public class Empleados implements Serializable{
	
	
	
	private String nombre, apellido, userId, passWd;

	public Empleados(String nombre, String apellido, String userId, String passWd) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.userId = userId;
		this.passWd = passWd;
	}

	public Empleados() {

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

}



