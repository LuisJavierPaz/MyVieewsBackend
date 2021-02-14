package com.MyVieews.model.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private int idcat;
    private String nomcat;

    private String externaId;

    public int getIdcat() {
        return idcat;
    }

    public String getNomcat() {
        return nomcat;
    }

    public String getExternaId() {
        return externaId;
    }
}
