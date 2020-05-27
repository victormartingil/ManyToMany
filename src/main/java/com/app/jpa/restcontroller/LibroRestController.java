package com.app.jpa.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.jpa.db.entity.Libro;
import com.app.jpa.dto.LibroConAutoresDto;
import com.app.jpa.service.CrudService;

@RestController
@RequestMapping("/api/libros")
public class LibroRestController extends RestCrudController<Libro, LibroConAutoresDto> {
	
	@Autowired
	public LibroRestController(CrudService<Libro, LibroConAutoresDto> service) {
		super(service);
    }
		
}