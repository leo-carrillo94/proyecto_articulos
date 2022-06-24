package com.proarti.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nombre;
	
	@Column(length = 10000)
	private String descripcion;
	private Date fechaIncio;
	private String estado;
	@ManyToOne
	private Usuario usuario;
	
	
	
	public Proyecto(String nombre, String descripcion, Date fechaIncio, String estado, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaIncio = fechaIncio;
		this.estado = estado;
		this.usuario = usuario;
	}
	public Proyecto() {
		super();
	}
	public Proyecto(int id, String nombre, String descripcion, Date fechaIncio, String estado, Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaIncio = fechaIncio;
		this.estado = estado;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaIncio() {
		return fechaIncio;
	}
	public void setFechaIncio(Date fechaIncio) {
		this.fechaIncio = fechaIncio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	
	

}