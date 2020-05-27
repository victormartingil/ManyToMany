package com.app.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.jpa.converter.Converter;
import com.app.jpa.db.entity.Autor;
import com.app.jpa.dto.AutorConLibrosDto;
import com.app.jpa.repository.AutorRepository;

@Service
public class AutorServiceImpl extends CrudServiceImpl<Autor, AutorConLibrosDto, AutorRepository> {

	@Autowired
	public AutorServiceImpl(AutorRepository repository, Converter<Autor, AutorConLibrosDto> converter) {
		super(repository, converter);
	}

}
