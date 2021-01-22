package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;
import java.util.Date;

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
@Table(name="canal")
public class Canal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_canal")
    private long id;

    @Column(name ="foto_perfil", nullable=false, unique=true)
    private String fotoPerfil;

    @Column(name ="foto_portada", nullable=false, unique=true)
    private String fotoPortada;

    @Column(name ="nombreUsuario", nullable=false, unique=true)
    private String nombreCanal;

    @Column(name ="fec_creacion", nullable=false, unique=true)
    private Date fechaCreacion;

    @Column(name ="descripcion", nullable=false)
    private String descripcion;

    @Column(name ="strinke", nullable=false)
    private int strike;

    @Column(name ="reportes", nullable=false)
    private int reportes;
}
