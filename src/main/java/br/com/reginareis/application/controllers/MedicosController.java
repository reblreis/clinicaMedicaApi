package br.com.reginareis.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/medicos")
public class MedicosController {

	@PostMapping("criar")
	public void criar() {
		// TODO
	}

	@PostMapping("autenticar")
	public void autenticar() {
		// TODO
	}
}