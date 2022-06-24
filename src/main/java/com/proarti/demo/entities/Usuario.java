package com.proarti.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false)
	private String password;
	private String nombres;
	@Column(nullable = false)
	private String email;
	
	
	public Usuario() {
		
	}
	

	
	public Usuario(int id, String username, String password, String nombres, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nombres = nombres;
		this.email = email;
	}




	public Usuario(String username, String password, String nombres, String email) {
		super();
		this.username = username;
		this.password = password;
		this.nombres = nombres;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
