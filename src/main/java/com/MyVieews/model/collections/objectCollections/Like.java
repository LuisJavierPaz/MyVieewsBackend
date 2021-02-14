package com.MyVieews.model.collections.objectCollections;

import java.util.UUID;

public class Like {
    private String idLike;
    private String externalIdVideo;
    private String estado;

    public String getExternalIdVideo() {
        return externalIdVideo;
    }

    public void setExternalIdVideo(String externalIdVideo) {
        this.externalIdVideo = externalIdVideo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdLike() {
        if (idLike==null){
            idLike = UUID.randomUUID().toString();
        }
        return idLike;
    }

    public void setIdLike(String idLike) {
        this.idLike = idLike;
    }
}
