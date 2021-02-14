package com.MyVieews.controller.service.collections;

import com.MyVieews.controller.repository.collections.LikeRepository;
import com.MyVieews.model.collections.CanalLike;
import com.MyVieews.model.collections.objectCollections.Like;
import com.MyVieews.utils.Tools;
import com.MyVieews.utils.modelAux.LikeCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;

    public CanalLike setLike(LikeCharger likeCharger) throws Exception {
        long idCanal = likeCharger.getIdCanal();
        Like like = likeCharger.getLike();
        CanalLike canalLike = likeRepository.findCanalLikeByIdCanal(idCanal);
        if (canalLike == null) {
            System.out.println(idCanal);
            canalLike = new CanalLike();
            canalLike.setIdCanal(idCanal);
        }else{
            likeRepository.deleteByIdCanal(idCanal);
        }
        canalLike.add(like);
        likeRepository.save(canalLike);
        return canalLike;
    }

    public CanalLike getLike(long idCanal) throws Exception {
        return likeRepository.findCanalLikeByIdCanal(idCanal);
    }

    public boolean updateLike(LikeCharger likeCharger) throws  Exception{
        long idCanal = likeCharger.getIdCanal();
        Like like = likeCharger.getLike();
        CanalLike canalLike = likeRepository.findCanalLikeByIdCanal(idCanal);
        if (canalLike == null) {
            return false;
        }
        List<Like> likes = canalLike.getList();
        likes = Tools.updateLike(likes,like);
        canalLike.setListaLikes(likes);
        likeRepository.deleteByIdCanal(idCanal);
        likeRepository.save(canalLike);
        return true;
    }
}
