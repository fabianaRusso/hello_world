package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")
public class ObjetivosController {

	@GetMapping
	public List<String> getAprendizagem() {

		List<String> lista = new ArrayList<>();
		lista.add("DB - MYSQL2 - Creating Relational Database with MYSQL");
		lista.add("DB - MYSQL3 - Introduction to SQL");
		lista.add("DB - MYSQL4 - Advanced SQL - Join Tables");
		lista.add("SA-PI-T2 - Prototipando o Banco de Dados");
		lista.add("Web-Java1 - Introduction to Web Development using Java and Spring Boot");
		lista.add("Web-Java2 - Dependencies Injection using Spring Framework");

		return lista;
	}

}
