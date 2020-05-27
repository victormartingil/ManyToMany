package com.app.jpa.dto;


public class AutorDto {

	private long id;
	
	private String nombre;
	
	public AutorDto() {
	}
	
	public AutorDto(long id) {
		this(id, null);
	}
	
	public AutorDto(String nombre) {
		this(0, nombre);
	}
	
	public AutorDto(long id, String nombre) {
		this.id = id;
		this.nombre= nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
