package com.MyVieews.model.Entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
- id : int
-idSuscrito: int
-idSuscriptor: int
-tipoPago: String
-notificacion: boolean
 */

@Entity
@Table(name="suscripcion")
public class ListaSuscripciones {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_suscripciones")
    private long id;

    @Column(name ="id_canal_suscripciones", nullable=false)
    private long idCanalSuscrito;

    @Column(name ="notificacion", nullable=false)
    private  String notificacion;

    @JoinColumn(name="fkid_canal", referencedColumnName = "idcan")
    @OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Canal canal;


}
