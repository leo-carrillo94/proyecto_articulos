package com.proarti.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Proyecto_bibliografia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String observacion;
	
	@Column(length = 10000)
	private String razones;
	
	@ManyToOne
	private Proyecto proyecto;
	
	@ManyToOne
	private Bibliografia bibliografia;
	
	

	public Proyecto_bibliografia(int id, String observacion, String razones, Proyecto proyecto,
			Bibliografia bibliografia) {
		super();
		this.id = id;
		this.observacion = observacion;
		this.razones = razones;
		this.proyecto = proyecto;
		this.bibliografia = bibliografia;
	}

	public Proyecto_bibliografia() {
	}

	public Proyecto_bibliografia(String observacion, String razones, Proyecto proyecto, Bibliografia bibliografia) {
		super();
		this.observacion = observacion;
		this.razones = razones;
		this.proyecto = proyecto;
		this.bibliografia = bibliografia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getRazones() {
		return razones;
	}

	public void setRazones(String razones) {
		this.razones = razones;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Bibliografia getBibliografia() {
		return bibliografia;
	}

	public void setBibliografia(Bibliografia bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	
	

	
	

}

