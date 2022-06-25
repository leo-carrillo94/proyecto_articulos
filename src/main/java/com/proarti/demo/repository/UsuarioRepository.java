package com.proarti.demo.repository;






import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.proarti.demo.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	
	Usuario findByUsername(String username);
	
	Optional<Usuario> findByEmail(String email);
	

	

}
