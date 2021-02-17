package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Video;
import com.mongodb.lang.NonNullApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.List;

/*
 * Repositorio que se encargar de hacer las busquedas en la base de datos
 * */
//@Repository
public interface VideoRepository extends JpaRepository<Video, Serializable> {
    public abstract List<Video> findVideoByNombreContaining(String nombre);

    public abstract Video findVideoById(long id);

    @Query(value = "select * from video where  video.externalId= :id", nativeQuery = true)
    public abstract Video findVideoByExternal(@Param("id") String id);

    public abstract List<Video> findVideoByExternalId(String externalId);

    @Query(value = "select * from video where  video.external_id <> :externalId", nativeQuery = true)
    public abstract List<Video> findDistinctByExternalId(@Param("externalId") String externalId);

    public abstract void deleteByExternalId(String externalId);
}
