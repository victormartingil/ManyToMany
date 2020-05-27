package com.app.jpa.dto;

import java.util.HashSet;
import java.util.Set;

//@LibroDtoConstraint(groups = {Create.class, Edit.class})
//@LibroDtoDeleteConstrait(groups = {Delete.class})
public class LibroConAutoresDto extends LibroDto {
	
	private Set<AutorDto> autores;
	
	public LibroConAutoresDto() {
		this(0);
	}
	
	public LibroConAutoresDto(long id) {
		this(id, null, new HashSet<>());
	}
	
	public LibroConAutoresDto(String titulo, Set<AutorDto> autores) {
		this(0, titulo, autores);
	}
	
	public LibroConAutoresDto(long id, String titulo, Set<AutorDto> autores) {
		super(id, titulo);
		this.autores = autores;
	}

	public Set<AutorDto> getAutores() {
		return autores;
	}

	public void setAutores(Set<AutorDto> autores) {
		this.autores = autores;
	}
	
}
