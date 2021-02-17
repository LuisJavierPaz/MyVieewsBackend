package com.MyVieews.controller.service;

import com.MyVieews.controller.repository.CanalRepository;
import com.MyVieews.controller.repository.SuscripcionesRepository;
import com.MyVieews.model.Entidades.Canal;
import com.MyVieews.model.Entidades.ListaSuscripciones;
import com.MyVieews.utils.modelAux.SuscripcionCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscripcionesService {
    @Autowired
    SuscripcionesRepository suscripcionesRepository;
    @Autowired
    CanalRepository canalRepository;

    /**
     * Servicio que realiza la extracion de las suscripciones
     * @param idCanal parametro de busqueda
     * @return List de suscripciones
     * @throws Exception
     */
    public List<ListaSuscripciones> getSuscripciones(long idCanal ) throws Exception{
        return suscripcionesRepository.findByIdCanalSuscrito(idCanal);
    }

    /**
     * Servicio que realiza la eliminacion de una suscripcion
     * @param idCanalSuscrito canal de la persona que se suscribio
     * @return true si la operacion se realiza con exito
     */
    public  boolean deleteSuscripciones(long idCanalSuscrito) throws Exception{
        try{
            suscripcionesRepository.deleteByIdCanalSuscrito(idCanalSuscrito);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * Metodo que realiza la insercion de una suscripcion
     * @param suscripcionCharger
     * @return true si la operacion se realizo con exito
     */
    public boolean setSuscripciones(SuscripcionCharger suscripcionCharger){
        try {
            long idCanalSuscrito = suscripcionCharger.getIdCanalSuscriptor();
            long idCanal = suscripcionCharger.getIdCanal();
            Canal canal = canalRepository.findCanalByIdcan(idCanal);
            ListaSuscripciones suscripciones = new ListaSuscripciones();
            suscripciones.setIdCanalSuscrito(idCanalSuscrito);
            suscripciones.setCanal(canal);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * Metodo que raliza la extraccion de todoas las suscripciones
     * @return List de suscripiones
     * @throws Exception
     */
    public List<ListaSuscripciones> getAllSuscripciones() throws Exception{
        return suscripcionesRepository.findAll();
    }




}
