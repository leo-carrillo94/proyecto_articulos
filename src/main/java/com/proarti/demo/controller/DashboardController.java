package com.proarti.demo.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proarti.demo.entities.Usuario;
import com.proarti.demo.servicios.UsuarioServicio;

@Controller
@RequestMapping("/html")
public class DashboardController {
	
	@Autowired
	private UsuarioServicio usuarioSer;
	
	@GetMapping("/dashboard")
	public String dashboard(Authentication auth, HttpSession session) {
		
		String username = auth.getName();
		
		if (session.getAttribute("usuario")==null) {
				Usuario usuario = usuarioSer.findByUsername(username);
				usuario.setPassword(null);
				session.setAttribute("usuario", usuario);
			
		}
		return "/html/dashboard";
	}
	

}
