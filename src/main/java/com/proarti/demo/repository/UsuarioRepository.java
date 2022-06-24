package com.proarti.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proarti.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Query(
			value="SELECT * FROM usuario WHERE usuario.username= %:usuario% AND usuario.password= %:password%",
			nativeQuery=true
			)
	List<Usuario> login(@Param("usuario") String usuario, @Param("password") int password);
	

}
