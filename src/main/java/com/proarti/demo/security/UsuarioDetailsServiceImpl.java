package com.proarti.demo.security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.proarti.demo.entities.Usuario;
import com.proarti.demo.repository.UsuarioRepository;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UsuarioRepository usuarioR;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario  usuario = usuarioR.findByUsername(username);
		
		UserBuilder builder = null;
		 if (usuario != null) {
			 builder= User.withUsername(username);
			 builder.disabled(false);
			 builder.password(usuario.getPassword());
			 builder.authorities(new SimpleGrantedAuthority("ROLE_USER")); 
			 
		}
		 else {
			 throw new UsernameNotFoundException("Usuario no Encontrado");
			 
		 }
		return builder.build();
	}

}
