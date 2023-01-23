package com.denise.portfolio.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.*;

@Entity
@Table(name="persona")
public class PersonaModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Integer id;
	private String nombre;
	private String apellido;
	@JsonFormat(pattern="yyyy-MM-dd", shape=Shape.STRING)
	@Column(name="fecha_nacimiento")
	private String fecha_nacimiento;
	private String nacionalidad;
	private String mail;
	private String sobre_mi;
	private String ocupacion;
	private String imagen_fondo;
	private String imagen_perfil;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSobre_mi() {
		return sobre_mi;
	}
	public void setSobre_mi(String sobre_mi) {
		this.sobre_mi = sobre_mi;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getImagen_fondo() {
		return imagen_fondo;
	}
	public void setImagen_fondo(String imagen_fondo) {
		this.imagen_fondo = imagen_fondo;
	}
	public String getImagen_perfil() {
		return imagen_perfil;
	}
	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}
	
	
}
