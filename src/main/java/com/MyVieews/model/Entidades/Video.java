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

}
