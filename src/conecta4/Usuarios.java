package conecta4;

import java.io.Serializable;

public class Usuarios implements Serializable{
/*Clase con la que se trabajara con los datos de lo usuarios registrados*/
	
	private String nombre;
	private String nickname;
	private int edad;
	
	public Usuarios(String nombre, String nickname,int edad) {
		super();
		this.nombre = nombre;
		this.nickname = nickname;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Usuario: " + nombre + ", " + nickname + ", " + edad;
	}

}
