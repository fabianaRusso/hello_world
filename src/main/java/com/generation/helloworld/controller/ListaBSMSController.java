package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista")
public class ListaBSMSController {

	@GetMapping
	public List<String> getListaBMS() {

		List<String> lista = new ArrayList<>();
		lista.add("Orientação ao Futuro");
		lista.add("Responsabilidade Pessoal");
		lista.add("Persistência");
		lista.add("Trabalho em Equipe");
		lista.add("Mentalidade de Crescimento");
		lista.add("Proatividade");
		lista.add("Orientação ao Detalhe");
		lista.add("Comunicação");

		return lista;
	}
}
