package com.MyVieews.controller.service.collections;

import com.MyVieews.controller.repository.collections.CommentRepository;
import com.MyVieews.model.collections.VideoComment;
import com.MyVieews.model.collections.objectCollections.Comentario;
import com.MyVieews.utils.Tools;
import com.MyVieews.utils.modelAux.CommentCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public VideoComment getComment(String externalId) throws Exception {
        return commentRepository.findByExternalIdVideo(externalId);
    }

    public VideoComment setComment(CommentCharger commentCharger) throws Exception {
        Comentario comentario = commentCharger.getComment();
        String externaId = commentCharger.getExternalIdVideo();
        VideoComment videoComment = commentRepository.findVideoCommentByExternalIdVideo(externaId);
        if (videoComment == null) {
            System.out.println("Ecuador es el mas bello del mundo==============================================");
            System.out.println(externaId);
            videoComment = new VideoComment();
            videoComment.setExternalIdVideo(externaId);
        }else{
            commentRepository.deleteByExternalIdVideo(externaId);
        }
        videoComment.add(comentario);
        commentRepository.save(videoComment);
        return videoComment;
    }

    public boolean updateComment(CommentCharger commentCharger) throws Exception{
        String externalVideo = commentCharger.getExternalIdVideo();
        Comentario comentario = commentCharger.getComment();
        VideoComment videoComment = commentRepository.findVideoCommentByExternalIdVideo(externalVideo);
        if (videoComment == null){
            return false;
        }
        List<Comentario> comentarioList = videoComment.getComentarioList();
        comentarioList = Tools.updateComentario(comentarioList,comentario);
        videoComment.setComentarioList(comentarioList);
        commentRepository.deleteByExternalIdVideo(externalVideo);
        commentRepository.save(videoComment);
        return true;
    }
    public boolean deleteComment(CommentCharger commentCharger) throws Exception{
        String externalVideo = commentCharger.getExternalIdVideo();
        Comentario comentario = commentCharger.getComment();
        VideoComment videoComment = commentRepository.findVideoCommentByExternalIdVideo(externalVideo);
        if (videoComment == null){
            return false;
        }
        List<Comentario> comentarioList = videoComment.getComentarioList();
        comentarioList = Tools.deleteComentario(comentarioList,comentario.getIdComentario());
        videoComment.setComentarioList(comentarioList);
        commentRepository.deleteByExternalIdVideo(externalVideo);
        commentRepository.save(videoComment);
        return true;
    }



}
