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

    public Video(long id, String externalId, String nombre, String descripcion, Date fechaPublicacion, String directorio, long visualizaciones, long gustar, long noGustar, String estadoVideo, String visibilidad, Canal canal, Categoria cat) {
        this.id = id;
        this.externalId = externalId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.directorio = directorio;
        this.visualizaciones = visualizaciones;
        this.gustar = gustar;
        this.noGustar = noGustar;
        this.estadoVideo = estadoVideo;
        this.visibilidad = visibilidad;
        this.canal = canal;
        this.cat = cat;
    }

    public Video(){

    }

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

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
}
