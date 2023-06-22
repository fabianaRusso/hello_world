package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") // Endereço da requisição
public class HelloWorldController {

	// solicitações para os Métodos da Classe controladora
	// a anotação @RequestMapping é usada para mapear
	@GetMapping
	public String helloworld() {
		return "Hello World!!!";
	}
}
