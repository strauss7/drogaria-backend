package com.amira.drogaria1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DogariaController {

	@RequestMapping("/ola")
	public String exibirMensagem() {
		return "Olá mundo!";
	}
}
