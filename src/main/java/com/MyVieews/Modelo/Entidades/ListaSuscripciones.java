package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;

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

    @JoinColumn(name="fkid_canal", referencedColumnName = "id_canal")
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Canal canal;

    public long getId() {
        return id;
    }

    public long getIdCanalSuscrito() {
        return idCanalSuscrito;
    }

    public String getNotificacion() {
        return notificacion;
    }
}
