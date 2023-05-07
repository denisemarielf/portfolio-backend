package com.denise.portfolio.models;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import javax.persistence.*;

@Entity
@Table(name="proyectos")
public class ProyectoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getRepositorio() {
		return repositorio;
	}
	public void setRepositorio(String repositorio) {
		this.repositorio = repositorio;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	private String titulo;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name="fecha")
	private String fecha;
	private String descripcion;
	private String link;
	private String repositorio;
	private String imagen;
}
