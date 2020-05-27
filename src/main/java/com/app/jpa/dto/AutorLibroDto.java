package com.app.jpa.dto;


public class AutorLibroDto {

	private long id;
	
	private String nombre;
	
	public AutorLibroDto() {
	}
	
	public AutorLibroDto(long id) {
		this(id, null);
	}
	
	public AutorLibroDto(String nombre) {
		this(0, nombre);
	}
	
	public AutorLibroDto(long id, String nombre) {
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
