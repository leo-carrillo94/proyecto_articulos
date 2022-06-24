package com.proarti.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	
	@GetMapping("/")
	public String getLogin() {
		return "index";
	}
	
	@GetMapping("/form")
	public String getFormulario() {
		return "registro";
	}

}
