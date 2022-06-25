package com.proarti.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proarti.demo.entities.Usuario;
import com.proarti.demo.servicios.UsuarioServicio;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioServicio usuarioSer;
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "index";
	}
	
	
	
	
	@GetMapping("/registro")
	public String getFormulario(Model modelo) {
		modelo.addAttribute("suarioForm", new Usuario());
		return "registro";
	}

	@PostMapping("/registro")
	public String crearUsuario(@Validated @ModelAttribute("usuarioForm")Usuario usuario, BindingResult result, ModelMap model) throws Exception {
		if (result.hasErrors()) {
			model.addAttribute("usuarioForm", usuario);
		}else {
			try {
				usuarioSer.crearUsuario(usuario);
				model.addAttribute("suarioForm", new Usuario());		
			}catch (Exception e) {
				model.addAttribute("errorForm", e.getMessage());
				model.addAttribute("usuarioForm", usuario);
			}
		}
				return "index";
	}
	
	
	
}
