package com.MyVieews.model.Entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcuenta;
    private String correoElectronico;
    private String nombreUsuario;
    private String clave;
    private boolean estado;
    private String externalId;
  //atrubutos para generar las relaciones(fk)
  	@OneToOne//especificamos el tipo de relacion que extiste entre las tablas
  	@JoinColumn(name="id_persona")//le asignamos un nombre a la fk
    private Persona persona;

  	
  	//CREAMOS LOS CONSTRUCTORES
  	public Cuenta(String correoElectronico, String nombreUsuario, String clave, boolean estado, String externalId,
			Persona persona) {
		super();
		this.correoElectronico = correoElectronico;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
		this.estado = estado;
		this.externalId = externalId;
		this.persona = persona;
	}
  	public Cuenta() {
		
	}
  	
  	//GENERAMOS LOS GET Y SET
    public long getIdcuenta() {
		return idcuenta;
	}
	
	public void setIdcuenta(long idcuenta) {
		this.idcuenta = idcuenta;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}


}
