package com.MyVieews.model.Entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
-id: int
-fotoPerfil: String
-fotoPortado: String
-nombreCanal: String
-fechaCreacion: Date
-Descripcion: String
-strike: int
-reportes: int */

@Entity
@Table(name = "canal")
public class Canal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcan;

	@Column(name = "foto_perfil", nullable = false, unique = true)
	private String fotoPerfil;

	@Column(name = "foto_portada", nullable = false, unique = true)
	private String fotoPortada;

	@Column(name = "nombre_usuario", nullable = false, unique = true)
	private String nombreCanal;

	@Column(name = "fecha_creacion", nullable = false, unique = true)
	private Date fechaCreacion = new Date();

	@Column(name = "strike", nullable = false)
	private int strike;

	@Column(name = "reportes", nullable = false)
	private int reportes;

	// atrubutos para generar las relaciones(fk)
	@OneToOne // especificamos el tipo de relacion que extiste entre las tablas
	@JoinColumn(name="idperCanal", referencedColumnName = "id")// le asignamos un nombre a la fk private y le referenciamos con que atributo de la otra tabal se va a relacionar
	Persona perCanal;

	public Canal(long idcan, String fotoPerfil, String fotoPortada, String nombreCanal, Date fechaCreacion, int strike, int reportes, Persona perCanal) {
		this.idcan = idcan;
		this.fotoPerfil = fotoPerfil;
		this.fotoPortada = fotoPortada;
		this.nombreCanal = nombreCanal;
		this.fechaCreacion = fechaCreacion;
		this.strike = strike;
		this.reportes = reportes;
		this.perCanal = perCanal;
	}

	public Canal(){

	}

	public long getIdcan() {
		return idcan;
	}

	public void setIdcan(long idcan) {
		this.idcan = idcan;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public String getFotoPortada() {
		return fotoPortada;
	}

	public void setFotoPortada(String fotoPortada) {
		this.fotoPortada = fotoPortada;
	}

	public String getNombreCanal() {
		return nombreCanal;
	}

	public void setNombreCanal(String nombreCanal) {
		this.nombreCanal = nombreCanal;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getReportes() {
		return reportes;
	}

	public void setReportes(int reportes) {
		this.reportes = reportes;
	}

	public Persona getPerCanal() {
		return perCanal;
	}

	public void setPerCanal(Persona perCanal) {
		this.perCanal = perCanal;
	}
}
