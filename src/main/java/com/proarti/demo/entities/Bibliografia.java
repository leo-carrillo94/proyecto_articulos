package com.proarti.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bibliografia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String pais;
	private String cita;
	private String enlace;
	@Column(length = 10000)
	private String resumen;
	private String palabras_clave;
	@ManyToOne
	private Usuario usuario;
	
	
	
	
	public Bibliografia() {

	}
	
	public Bibliografia(int id, String titulo, String pais, String cita, String enlace, String palabras_clave,
			Usuario usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.pais = pais;
		this.cita = cita;
		this.enlace = enlace;
		this.palabras_clave = palabras_clave;
		this.usuario = usuario;
	}
	public Bibliografia(String titulo, String pais, String cita, String enlace, String palabras_clave,
			Usuario usuario) {
		super();
		this.titulo = titulo;
		this.pais = pais;
		this.cita = cita;
		this.enlace = enlace;
		this.palabras_clave = palabras_clave;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCita() {
		return cita;
	}
	public void setCita(String cita) {
		this.cita = cita;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public String getPalabras_clave() {
		return palabras_clave;
	}
	public void setPalabras_clave(String palabras_clave) {
		this.palabras_clave = palabras_clave;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	


}
