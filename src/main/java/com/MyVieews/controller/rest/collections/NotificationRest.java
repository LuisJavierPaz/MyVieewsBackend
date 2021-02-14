package com.MyVieews.controller.rest.collections;

import com.MyVieews.controller.service.collections.NotificationService;
import com.MyVieews.model.collections.CanalNotificacion;
import com.MyVieews.utils.modelAux.NotificationCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/informacion")
public class NotificationRest {
    @Autowired
    NotificationService notificationService;

    @GetMapping("/notification/{idCanal}")
    public CanalNotificacion getNotificacion(@PathVariable("idCanal") long idCanal){

        try {
            return notificationService.getNotificacion(idCanal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @PutMapping(value = "/notification/insert")
    public CanalNotificacion setNotificacion(@RequestBody NotificationCharger notificationCharger){
        try {
            return notificationService.setNotification(notificationCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @DeleteMapping(value = "/notification/delete")
    public boolean deletNotification(@RequestBody NotificationCharger notificationCharger){
        try {
            return notificationService.deleteNotification(notificationCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return  false;
        }
    }

    @PutMapping("/notification/update")
    public boolean updateNotification(@RequestBody NotificationCharger notificationCharger){
        try {
            return notificationService.updateNotification(notificationCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
