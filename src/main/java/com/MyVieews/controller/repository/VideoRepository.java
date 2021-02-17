package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository <Video, Long>{
    public abstract Video findVideoByExternalId(String ExternalId);

    public abstract void deleteByExternalId(String externalId);
}
