package com.MyVieews.controller.rest.collections;

import com.MyVieews.controller.service.collections.NotificationService;
import com.MyVieews.model.collections.CanalNotificacion;
import com.MyVieews.utils.modelAux.NotificationCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/informacion")
public class NotificationRest {
    @Autowired
    NotificationService notificationService;

    /**
     * Metodo que define la extraccion de una notificacion
     * @param idCanal parametro de busqueda
     * @return CanalNotificacion objeto con las notificaciones
     */
    @GetMapping("/notification/{idCanal}")
    public CanalNotificacion getNotificacion(@PathVariable("idCanal") long idCanal){

        try {
            return notificationService.getNotificacion(idCanal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Metodo que define la ruta de insercion
     * @param notificationCharger parametro con los datos de insercion
     * @return CanalNotificacion objeto con los datos insertados
     */
    @PutMapping(value = "/notification/insert")
    public CanalNotificacion setNotificacion(@RequestBody NotificationCharger notificationCharger){
        try {
            return notificationService.setNotification(notificationCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Metodo que define la eliminacion de una notificacion
     * @param notificationCharger parametro con los datos de insercion
     * @return true si la operacion es satisfactoria
     */
    @DeleteMapping(value = "/notification/delete")
    public boolean deletNotification(@RequestBody NotificationCharger notificationCharger){
        try {
            return notificationService.deleteNotification(notificationCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return  false;
        }
    }

    /**
     * Metodo que define la ruta de actualizacion
     * @param notificationCharger parametro con los datos de insercion
     * @return true si la opeacion es exitosa;
     */

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
