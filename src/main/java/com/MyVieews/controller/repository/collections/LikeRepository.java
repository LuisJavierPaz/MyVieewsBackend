package com.MyVieews.controller.repository.collections;

import com.MyVieews.model.collections.CanalLike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

@Repository
public interface LikeRepository  extends MongoRepository<CanalLike, Serializable> {
    public abstract CanalLike findCanalLikeByIdCanal(long idCanal);
    public abstract void  deleteByIdCanal(long idCanal);
}
