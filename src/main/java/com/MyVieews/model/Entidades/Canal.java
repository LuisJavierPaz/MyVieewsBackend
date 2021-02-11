package com.MyVieews.model.Entidades;

/*
-id: int
-fotoPerfil: String
-fotoPortado: String
-nombreCanal: String
-fechaCreacion: Date
-Descripcion: String
-strike: int
-reportes: int */

//@Entity
//@Table(name="canal")
public class Canal {
    /*@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_canal")
    private long id;

    @Column(name ="foto_perfil", nullable=false, unique=true)
    private String fotoPerfil;

    @Column(name ="foto_portada", nullable=false, unique=true)
    private String fotoPortada;

    @Column(name ="nombre_usuario", nullable=false, unique=true)
    private String nombreCanal;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="fecha_creacion", nullable=false, unique=true)
    private Date fechaCreacion=new Date();


    @Column(name ="strike", nullable=false)
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


*/
}
