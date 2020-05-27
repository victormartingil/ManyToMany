package com.app.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.jpa.converter.Converter;
import com.app.jpa.db.entity.Libro;
import com.app.jpa.dto.LibroConAutoresDto;
import com.app.jpa.repository.LibroRepository;

@Service
public class LibroServiceImpl extends CrudServiceImpl<Libro, LibroConAutoresDto, LibroRepository> {

	@Autowired
	public LibroServiceImpl(LibroRepository repository, Converter<Libro, LibroConAutoresDto> converter) {
		super(repository, converter);
	}

}
