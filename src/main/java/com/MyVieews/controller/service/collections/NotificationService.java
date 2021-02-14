package com.MyVieews.controller.service.collections;

import com.MyVieews.controller.repository.collections.NotifiicationRepository;
import com.MyVieews.model.collections.CanalNotificacion;
import com.MyVieews.model.collections.objectCollections.Notification;
import com.MyVieews.utils.Tools;
import com.MyVieews.utils.modelAux.NotificationCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotifiicationRepository notifiicationRepository;

    public CanalNotificacion getNotificacion(long id) throws Exception {
        return notifiicationRepository.findByIdCanal(id);
    }

    public CanalNotificacion setNotification(NotificationCharger notificationCharger) throws Exception {
        long idCanal = notificationCharger.getIdCanal();
        Notification notification = notificationCharger.getNotification();
        CanalNotificacion canalNotificacion = notifiicationRepository.findByIdCanal(idCanal);

        if (canalNotificacion == null) {
            canalNotificacion = new CanalNotificacion();
            canalNotificacion.setIdCanal(idCanal);
        } else {
            notifiicationRepository.deleteByIdCanal(idCanal);
        }
        canalNotificacion.add(notification);
        notifiicationRepository.save(canalNotificacion);
        return canalNotificacion;
    }

    public boolean deleteNotification(NotificationCharger notificationCharger) throws Exception {
        try {
            long idCanal = notificationCharger.getIdCanal();
            Notification notification = notificationCharger.getNotification();
            CanalNotificacion canalNotificacion = notifiicationRepository.findByIdCanal(idCanal);
            if (canalNotificacion == null){
                return false;
            }
            List<Notification> notifications = canalNotificacion.getListaNotificaciones();
            notifications = Tools.delete(notifications,notification.getIdNotificacion());
            canalNotificacion.setListaNotificaciones(notifications);
            notifiicationRepository.deleteByIdCanal(idCanal);
            notifiicationRepository.save(canalNotificacion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean updateNotification(NotificationCharger notificationCharger) throws Exception {
        try {
            long idCanal = notificationCharger.getIdCanal();
            Notification notification = notificationCharger.getNotification();
            CanalNotificacion canalNotificacion = notifiicationRepository.findByIdCanal(idCanal);
            if (canalNotificacion == null){
                return false;
            }
            List<Notification> notifications = canalNotificacion.getListaNotificaciones();
            notifications = Tools.update(notifications,notification);
            canalNotificacion.setListaNotificaciones(notifications);
            notifiicationRepository.deleteByIdCanal(idCanal);
            notifiicationRepository.save(canalNotificacion);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
