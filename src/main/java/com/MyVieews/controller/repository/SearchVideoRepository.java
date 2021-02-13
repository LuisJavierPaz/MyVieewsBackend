package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/*
 * Repositorio que se encargar de hacer las busquedas en la base de datos
 * */
//@Repository
public interface SearchVideoRepository /*extends JpaRepository<Video, Serializable>*/ {
  /*  @Query(
            value = "select  new com.MyVieews.utils.filtrerVideo(video.id, video.externalId, video.nombre,  video.directorio, video.descripcion, video.visualizaciones, video.fechaPublicacion, canal.nombreCanal)" +
                    " from Video video inner join Canal  canal on video.canal.id = canal.id where upper(video.nombre) like concat('%',upper(:nombre),'%')"
    )
    public List<com.MyVieews.utils.filtrerVideo> findByNombreLike(@Param("nombre") String nombre);

    @Query(value = "select new com.MyVieews.utils.filtrerVideo(video.id, video.externalId, video.nombre,  video.directorio, video.descripcion, video.visualizaciones, video.fechaPublicacion, canal.nombreCanal) from Video video inner join  Canal canal on canal.id=video.canal.id")
    public List<com.MyVieews.utils.filtrerVideo> findAllVideoLow();*/

}
