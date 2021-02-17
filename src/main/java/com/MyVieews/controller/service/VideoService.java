package com.MyVieews.controller.service;

import com.MyVieews.controller.repository.VideoRepository;
import com.MyVieews.model.Entidades.Cuenta;
import com.MyVieews.model.Entidades.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoRepository videoRepository;

    public Video findVideoByExternalId(String ExternalId) { return videoRepository.findVideoByExternal(ExternalId);}

    public Video save(Video video){
        try{
            videoRepository.save(video);
            return video;
        }catch (Exception e){
            return null;
        }
    }
    public List<Video> findAll(){
        try{
            return videoRepository.findAll();
        }catch (Exception e){
            return null;
        }
    }
    public void deleteByExternalId(String ExternalId){
        videoRepository.deleteByExternalId(ExternalId);
    }
}
