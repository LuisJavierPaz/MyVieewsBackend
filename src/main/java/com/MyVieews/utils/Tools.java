package com.MyVieews.utils;

import com.MyVieews.model.collections.objectCollections.Comentario;
import com.MyVieews.model.collections.objectCollections.Like;
import com.MyVieews.model.collections.objectCollections.Notification;

import java.util.List;

public class Tools {
    public static List<Notification> delete(List<Notification> array, String idNotificacion) {
        for (int cont = 0; cont < array.size(); cont++) {
            if (array.get(cont).getIdNotificacion().equals(idNotificacion)) {
                array.remove(cont);
                break;
            }
        }
        return array;
    }
    public static List<Notification> update(List<Notification> array, Notification notificacion) {
        for (int cont = 0; cont < array.size(); cont++) {
            if (array.get(cont).getIdNotificacion().equals(notificacion.getIdNotificacion())) {
                array.set(cont,notificacion);
                break;
            }
        }
        return array;
    }


    public static List<Like> updateLike(List<Like> array, Like like) {
        for (int cont = 0; cont < array.size(); cont++) {
            if (array.get(cont).getExternalIdVideo().equals(like.getExternalIdVideo())) {
                array.set(cont,like);
                break;
            }
        }
        return array;
    }

    public static List<Comentario> deleteComentario(List<Comentario> array, String idComentario) {
        for (int cont = 0; cont < array.size(); cont++) {
            if (array.get(cont).getIdComentario().equals(idComentario)) {
                array.remove(cont);
                break;
            }
        }
        return array;
    }
    public static List<Comentario> updateComentario(List<Comentario> array, Comentario comentario) {
        for (int cont = 0; cont < array.size(); cont++) {
            if (array.get(cont).getIdComentario().equals(comentario.getIdComentario())) {
                array.set(cont,comentario);
                break;
            }
        }
        return array;
    }

}
