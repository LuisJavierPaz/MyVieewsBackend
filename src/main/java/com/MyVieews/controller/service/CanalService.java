package com.MyVieews.controller.service;

import com.MyVieews.controller.repository.CanalRepository;
import com.MyVieews.model.Entidades.Canal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanalService {
    @Autowired
    private CanalRepository canalRepository;

    public Canal findCanalByIdcan(Long Idcan) {
        return canalRepository.findCanalByIdcan(Idcan);
    }

    public Canal save(Canal canal) {
        try {
            canalRepository.save(canal);
            return canal;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Canal> findAll() {
        try {
            return canalRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }
}
