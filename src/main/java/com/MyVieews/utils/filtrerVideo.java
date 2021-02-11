package com.MyVieews.utils;

import javax.persistence.Column;
import java.util.Date;

public class filtrerVideo {
    private long id;
    private String externalId;
    private String nombre;
    private String directorio;
    private String descripcion;
    private long visualizaciones;
    private Date fechaPublicacion;
    private String nombreCanal;

    public filtrerVideo(long id, String externalId, String nombre, String directorio, String descripcion, long visualizaciones, Date fechaPublicacion, String nombreCanal) {
        this.id = id;
        this.externalId = externalId;
        this.nombre = nombre;
        this.directorio = directorio;
        this.descripcion = descripcion;
        this.visualizaciones = visualizaciones;
        this.fechaPublicacion = fechaPublicacion;
        this.nombreCanal = nombreCanal;
    }

    public long getId() {
        return id;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirectorio() {
        return directorio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getVisualizaciones() {
        return visualizaciones;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }
}
