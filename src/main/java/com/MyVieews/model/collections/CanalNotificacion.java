package com.MyVieews.model.collections;

import com.MyVieews.model.collections.objectCollections.Notification;
import com.mongodb.client.model.Collation;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "CanalNotificacion")
public class CanalNotificacion implements Serializable {
    @Id
    private long idCanal;
    private List<Notification> listaNotificaciones;

    public long getIdCanal() {
        return idCanal;
    }

    public void setIdCanal( long idCanal) {
        this.idCanal = idCanal;
    }
    public void add(Notification notification) {
        if (listaNotificaciones==null) {
            listaNotificaciones = new ArrayList<>();
        }
        listaNotificaciones.add(notification);
    }

    public List<Notification> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(List<Notification> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }
}
