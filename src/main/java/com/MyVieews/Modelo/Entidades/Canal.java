package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

<<<<<<< HEAD
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="fecha_creacion", nullable=false, unique=true)
    private Date fechaCreacion=new Date();
=======
    @Column(name ="fec_creacion", nullable=false, unique=true)
    private Date fechaCreacion;
>>>>>>> 8b5c575e91e55bf788e46fde39df7cfac0379cee

    @Column(name ="descripcion", nullable=false)
    private String descripcion;

    @Column(name ="strinke", nullable=false)
    private int strike;

    @Column(name ="reportes", nullable=false)
    private int reportes;

    //relations
    //persona-canal
    @JoinColumn(name="fkid_persona", referencedColumnName = "id_persona")
    @OneToOne (fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Persona persona;

    //canal - video
    @OneToMany (mappedBy = "canal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Video> video;

    @OneToMany (mappedBy = "canal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ListaSuscripciones> suscripcion;


}
