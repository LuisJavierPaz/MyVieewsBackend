package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;
import java.util.Date;

/*
- id : int
- nombre: String
- descripción: String
- fechaPublicacion: Date
- directorio: String
- visualizaciones: long
- Gustar: long
- noGustar: long
- estadoVideo: String
- Visibilidad: String
- external_id: String
 */
<<<<<<< HEAD

//@Entity
//@Table(name="video")
=======
@Entity
@Table(name="video")
>>>>>>> 1d88ac2 (Desarrollando commit:)
public class Video {
/*    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_video")
    private long id;
    //@NotEmpty(message)
    @Column(name ="external_id", nullable=false, unique=true)
    private String externalId;

    @Column(name ="nombre", nullable=false)
    private String nombre;

    @Column(name ="descripcion", nullable=false)
    private String descripcion;

    @Column(name ="fecha_publicacion", nullable=false)
    private Date fechaPublicacion;

    @Column(name ="directorio", nullable=false, unique=true)
    private String directorio;

    @Column(name ="visualizaciones", nullable=false)
    private long visualizaciones;

    @Column(name ="gustar", nullable=false)
    private long gustar;

    @Column(name ="no_gustar", nullable=false)
    private long noGustar;

    @Column(name ="estado_video", nullable=false)
    private  String estadoVideo;

    @Column(name ="visibilad", nullable=false)
    private String visibilidad;


    //relations
    //canal-video
    @JoinColumn(name="fkid_canal", referencedColumnName = "id_canal")
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Canal canal;


    //categoria-video
    @JoinColumn(name="fkid_categoria", referencedColumnName = "id_categoria")
    @OneToOne (fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Categoria categoria;
<<<<<<< HEAD
*/
=======

    /*getters a setters*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public long getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(long visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public long getGustar() {
        return gustar;
    }

    public void setGustar(long gustar) {
        this.gustar = gustar;
    }

    public long getNoGustar() {
        return noGustar;
    }

    public void setNoGustar(long noGustar) {
        this.noGustar = noGustar;
    }

    public String getEstadoVideo() {
        return estadoVideo;
    }

    public void setEstadoVideo(String estadoVideo) {
        this.estadoVideo = estadoVideo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
>>>>>>> 1d88ac2 (Desarrollando commit:)
}
