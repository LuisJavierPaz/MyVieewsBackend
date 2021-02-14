package com.MyVieews.model.Entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

@Entity
@Table(name="video")
public class Video {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_video")
    private long id;
    private String externalId;
    private String nombre;
    private String descripcion;
    private Date fechaPublicacion;
    private String directorio;
    private long visualizaciones;
    private long gustar;
    private long noGustar;
    private  String estadoVideo;
    private String visibilidad;
  //atrubutos para generar las relaciones(fk)
  	@ManyToOne//especificamos el tipo de relacion que extiste entre las tablas
  	@JoinColumn(name="id_canal")//le asignamos un nombre a la fk
  	private Canal canal;
  	@ManyToOne//especificamos el tipo de relacion que extiste entre las tablas
  	@JoinColumn(name="id_cat")//le asignamos un nombre a la fk
  	private Categoria cat;

    public long getId() {
        return id;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getDirectorio() {
        return directorio;
    }

    public long getVisualizaciones() {
        return visualizaciones;
    }

    public long getGustar() {
        return gustar;
    }

    public long getNoGustar() {
        return noGustar;
    }

    public String getEstadoVideo() {
        return estadoVideo;
    }

    public String getVisibilidad() {
        return visibilidad;
    }

    public Canal getCanal() {
        return canal;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public void setVisualizaciones(long visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public void setGustar(long gustar) {
        this.gustar = gustar;
    }

    public void setNoGustar(long noGustar) {
        this.noGustar = noGustar;
    }

    public void setEstadoVideo(String estadoVideo) {
        this.estadoVideo = estadoVideo;
    }

    public void setVisibilidad(String visibilidad) {
        this.visibilidad = visibilidad;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
}
