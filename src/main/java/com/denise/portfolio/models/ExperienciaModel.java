package com.denise.portfolio.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import javax.persistence.*;

@Entity
@Table(name="experiencia")
public class ExperienciaModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;
	private String titulo;	
	private String logo;
	private String descripcion;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name="inicio")
	private String inicio;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name="fin")
	private String fin;
	
	public Long getId() {
		return id;	
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
