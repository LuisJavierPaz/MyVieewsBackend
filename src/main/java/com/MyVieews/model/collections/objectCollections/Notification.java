package com.MyVieews.model.collections.objectCollections;

import java.util.UUID;

public class Notification {
    private String idNotificacion = UUID.randomUUID().toString();
    private String externalIdVIdeo;
    private boolean estadoNotificacion;
    private String notificacion;

    /*Getters and setters*/
    public String getIdNotificacion() {
        if (idNotificacion == null) {
            idNotificacion = UUID.randomUUID().toString();
        }
        return idNotificacion;
    }

    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getExternalIdVIdeo() {
        return externalIdVIdeo;
    }

    public void setExternalIdVIdeo(String externalIdVIdeo) {
        this.externalIdVIdeo = externalIdVIdeo;
    }

    public boolean isEstadoNotificacion() {
        return estadoNotificacion;
    }

    public void setEstadoNotificacion(boolean estadoNotificacion) {
        this.estadoNotificacion = estadoNotificacion;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }
}
