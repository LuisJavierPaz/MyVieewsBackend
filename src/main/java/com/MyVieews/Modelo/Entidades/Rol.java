package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;

/*
-id : int
-tipo : String
 */
@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_rol")
    private int id;

    @Column(name ="tipo", nullable=false, unique=true)
    private String tipo;

}
