package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;

/*
- id : int
- nombreCategoria: String
-external_id: String
 */
@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_categoria")
    private int id;

    @Column(name ="nombre_categoria", nullable=false, unique=true)
    private String nombreCategoria;

    @Column(name ="external_id", nullable=false, unique=true)
    private String externaId;

    @OneToOne(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Video video;

    public int getId() {
        return id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getExternaId() {
        return externaId;
    }
}
