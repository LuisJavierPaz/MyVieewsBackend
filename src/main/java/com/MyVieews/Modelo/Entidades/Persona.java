package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;
import java.util.Date;

/*
- id : int
- nombre : String
- apellido : String
- fechaNacimiento : Date
- genero :  String
- telefono : String
-external_id: String
 */

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name ="id_persona")
    private long id;

    @Column(name ="nombre", nullable=false)
    private String nombre;

    @Column(name ="apellido", nullable=false)
    private String apellido;

    @Column(name ="fecha_nacimiento", nullable=false)
    private Date fechaNacimiento;

    @Column(name ="genero", nullable=false)
    private String genero;

    @Column(name ="telefono", nullable=false)
    private String telefono;

    @Column(name ="external_id", nullable=false, unique=true)
    private String externalId;
}
