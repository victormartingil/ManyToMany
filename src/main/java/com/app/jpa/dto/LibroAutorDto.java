package com.app.jpa.dto;

public class LibroAutorDto {

	private long id;
	
	private String titulo;

	public LibroAutorDto() {
		
	}	

	public LibroAutorDto(long id) {
		this.id = id;
	}

	public LibroAutorDto(long id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
