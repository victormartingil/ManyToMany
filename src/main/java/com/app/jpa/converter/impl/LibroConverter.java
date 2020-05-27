package com.app.jpa.converter.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.jpa.converter.AbstractConverter;
import com.app.jpa.db.entity.Autor;
import com.app.jpa.db.entity.Libro;
import com.app.jpa.dto.AutorDto;
import com.app.jpa.dto.LibroConAutoresDto;

@Component
public class LibroConverter extends AbstractConverter<Libro, LibroConAutoresDto>{

	@Autowired
	public LibroConverter () {
	}
	
	public Libro convertDtoToEntity(LibroConAutoresDto dto) {
		
		Set <Autor> autores = new HashSet<>();
		if (dto.getAutores() != null) {
			for (AutorDto autor : dto.getAutores()) {
				autores.add(new Autor(autor.getId()));
			}
		}
		return new Libro (dto.getId(),
							dto.getTitulo(),
							autores);
	}
	
	public LibroConAutoresDto convertEntityToDto (Libro entity) {
		
		Set<AutorDto> autores = new HashSet<>();
		if (entity.getAutores() != null) {
			for (Autor autor : entity.getAutores()) {
				autores.add(new AutorDto(autor.getId(), autor.getNombre()));
			}
		}
		
		return new LibroConAutoresDto (entity.getId(),
							entity.getTitulo(),
							autores);
	}
	
	public Set<LibroConAutoresDto> convertEntityToDto(Set<Libro> set) {
		if (set == null) {
			return null;
		}
		return set.stream()
				  .map(this::convertEntityToDto)
				  .collect(Collectors.toSet());
	}

	public Set<Libro> convertDtoToEntity(Set<LibroConAutoresDto> set) {
		if (set == null) {
			return null;
		}
		return set.stream()
				  .map(this::convertDtoToEntity)
				  .collect(Collectors.toSet());
	}
	
	public Optional<LibroConAutoresDto> convertEntityToDto(Optional<Libro> optional) {
		return optional.map(this::convertEntityToDto);
	}
	
	public void updateEntity (LibroConAutoresDto dto, Libro entity) {
		entity.setTitulo(dto.getTitulo());
	}

}
