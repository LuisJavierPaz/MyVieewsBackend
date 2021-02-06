package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
	private String tiprol;
	
	//CREAMOS LOS CONSTRUCTORES
	public Rol(long id, String tiprol) {
		super();
		this.id = id;
		this.tiprol = tiprol;
	}
	
	public Rol() {
		
	}
	//GENERAMOS LOS GET Y SET
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTiprol() {
		return tiprol;
	}
	public void setTiprol(String tiprol) {
		this.tiprol = tiprol;
	}

    

}
