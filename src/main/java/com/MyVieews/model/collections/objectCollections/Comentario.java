package com.MyVieews.model.collections.objectCollections;

import java.util.UUID;

public class Comentario {
    private String IdComentario = UUID.randomUUID().toString();
    private long idCanal;
    private String comentario;
    private String respuesta = null;

    public String getIdComentario() {
        if (IdComentario == null){
            this.IdComentario = UUID.randomUUID().toString();
        }
        return IdComentario;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public long getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(long idCanal) {
        this.idCanal = idCanal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
