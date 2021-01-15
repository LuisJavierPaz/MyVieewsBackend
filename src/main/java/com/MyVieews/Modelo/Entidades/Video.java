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

@Entity
@Table(name="video")
public class Video {
    @Id
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

}
