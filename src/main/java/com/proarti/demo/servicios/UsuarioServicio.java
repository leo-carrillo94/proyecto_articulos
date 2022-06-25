package com.proarti.demo.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.proarti.demo.entities.Usuario;
import com.proarti.demo.repository.UsuarioRepository;

@Service
public class UsuarioServicio {
	
	@Autowired
	UsuarioRepository usuarioR;
	
	@Autowired
	public BCryptPasswordEncoder encriptarContra;
	
	private boolean checkUsuername(Usuario user) throws Exception {
		Optional<Usuario> usuarioE = usuarioR.findByEmail(user.getEmail());
		if (usuarioE.isPresent()) {
			throw new Exception("Nombre de Usuario ya Existe");	
		}
		return true;
	}
	
	private boolean checkEmail(Usuario user) throws Exception {
		Optional<Usuario> usuarioE = usuarioR.findByEmail(user.getEmail());
		if (usuarioE.isPresent()) {
			throw new Exception("Correo de Usuario ya Existe");	
		}
		return true;
	}
	
	public Usuario crearUsuario(Usuario user) throws Exception {
		if (checkEmail(user) && checkUsuername(user)) {
			//encriptar la contraseña
			user.setPassword(encriptarContra.encode(user.getPassword()));
			
			user = usuarioR.save(user);	
		}
		return user;
	}
	
	public Usuario findByUsername(String username) {
		Usuario user = usuarioR.findByUsername(username);
		return user;
	}

}
