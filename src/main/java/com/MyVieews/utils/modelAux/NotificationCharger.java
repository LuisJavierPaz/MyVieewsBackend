package com.MyVieews.utils.modelAux;

import com.MyVieews.model.collections.objectCollections.Notification;

public class NotificationCharger {
    private long idCanal;
    private Notification notification;

    public long getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(long idCanal) {
        this.idCanal = idCanal;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
