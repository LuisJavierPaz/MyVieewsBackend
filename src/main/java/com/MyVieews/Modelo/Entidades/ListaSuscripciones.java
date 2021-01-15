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

}
