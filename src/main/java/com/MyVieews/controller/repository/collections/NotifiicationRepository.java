package com.MyVieews.controller.repository.collections;

import com.MyVieews.model.collections.CanalNotificacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface NotifiicationRepository extends MongoRepository<CanalNotificacion, Serializable> {
    public abstract CanalNotificacion findByIdCanal(long idCanal);
    public abstract void deleteByIdCanal(long idCanal);
}
