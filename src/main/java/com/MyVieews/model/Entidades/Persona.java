package com.MyVieews.model.Entidades;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
	private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String genero;
    private String telefono;
    private String externalId;
  //atrubutos para generar las relaciones(fk)
  	@ManyToOne//especificamos el tipo de relacion que extiste entre las tablas
  	@JoinColumn(name="id_rol")//le asignamos un nombre a la fk
  	private Rol rol;
    
    //CREAMOS LOS CONSTRUCTORES	
	public Persona() {
    	
    }   
    
    public Persona(String nombre, String apellido, Date fechaNacimiento, String genero, String telefono,
			String externalId, Rol rol) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.telefono = telefono;
		this.externalId = externalId;
		this.rol = rol;
	}

	//GENERAMOS LOS GET Y SET
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}


}
