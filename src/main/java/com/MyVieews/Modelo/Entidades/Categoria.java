package com.MyVieews.Modelo.Entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
- id : int
- nombreCategoria: String
-external_id: String
 */
public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_categoria")
    private int id;
    @Column(name ="nombre_categoria", nullable=false, unique=true)
    private String nombreCategoria;
    @Column(name ="external_id", nullable=false, unique=true)
    private String externaId;
}
