package com.bolsadeideas.springboot.web.app.models;

public class Usuario {

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String email) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	private String nombre;

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

	private String apellido;

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
