package com.app.jpa.dto;

import java.util.HashSet;
import java.util.Set;

//@LibroDtoConstraint(groups = {Create.class, Edit.class})
//@LibroDtoDeleteConstrait(groups = {Delete.class})
public class LibroDto {

	private long id;
	
	private String titulo;
	
	private Set<AutorLibroDto> autores;
	
	public LibroDto() {
	}
	
	public LibroDto(long id) {
		this(id, null, new HashSet<>());
	}
	
	public LibroDto(String titulo, Set<AutorLibroDto> autores) {
		this(0, titulo, autores);
	}
	
	public LibroDto(long id, String titulo, Set<AutorLibroDto> autores) {
		this.id = id;
		this.titulo = titulo;
		this.autores = autores;
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

	public Set<AutorLibroDto> getAutores() {
		return autores;
	}

	public void setAutores(Set<AutorLibroDto> autores) {
		this.autores = autores;
	}
	
}
