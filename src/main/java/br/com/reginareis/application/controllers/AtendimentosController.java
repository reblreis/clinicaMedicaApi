package br.com.reginareis.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/atendimentos")
public class AtendimentosController {

	@PostMapping("criar")
	public void criar() {
		// TODO
	}

	@PostMapping("consultar")
	public void autenticar() {
		// TODO
	}
}