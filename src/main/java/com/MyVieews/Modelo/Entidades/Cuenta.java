package com.MyVieews.Modelo.Entidades;

import javax.persistence.*;

/*
- id : int
-correoElectronico: String
- nombreUsuario: String
-clave: String
-estado:boolean
-external_id: String
 */

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private long id;

    @Column(name ="correo_electronico", nullable=false, unique=true)
    private String correoElectronico;

    @Column(name ="nombre_usuario", nullable=false)
    private String nombreUsuario;

    @Column(name ="clave", nullable=false)
    private String clave;

    @Column(name ="estado", nullable=false)
    private boolean estado;

    @Column(name ="external_id", nullable=false)
    private String externalId;

    //relations
    //persona-cuenta
    @JoinColumn(name="fkid_persona", referencedColumnName = "id_persona")
    @OneToOne (fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Persona persona;

    public long getId() {
        return id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getExternalId() {
        return externalId;
    }
}
