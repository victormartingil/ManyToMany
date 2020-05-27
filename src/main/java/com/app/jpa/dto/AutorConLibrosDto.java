package com.app.jpa.dto;

import java.util.HashSet;
import java.util.Set;

//@AutorDtoConstraint(groups = {Create.class, Edit.class})
//@AutorDtoDeleteConstrait(groups = {Delete.class})
public class AutorConLibrosDto extends AutorDto{

	private Set<LibroDto> libros;
	
	public AutorConLibrosDto() {
		this(0);
	}
	
	public AutorConLibrosDto(long id) {
		this(id, null, new HashSet<>());
	}
	
	public AutorConLibrosDto(String nombre) {
		this(0, nombre, new HashSet<>());
	}
	
	public AutorConLibrosDto(long id, String nombre, Set<LibroDto> libros) {
		super(id, nombre);
		this.libros = libros;
	}

	public Set<LibroDto> getLibros() {
		return libros;
	}

	public void setLibros(Set<LibroDto> libros) {
		this.libros = libros;
	}
	
	public void addLibro (LibroDto libro) {
		if (libros.contains(libro))
			return;
		libros.add(libro);
	}
	
	public void removeLibro (LibroDto libro) {
		if (!libros.contains(libro))
			return;
		libros.remove(libro);
	}
	
}
