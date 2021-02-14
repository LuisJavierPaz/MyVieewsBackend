package com.MyVieews.controller.repository.collections;

import com.MyVieews.model.collections.VideoComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<VideoComment, Serializable> {
    public abstract VideoComment findVideoCommentByExternalIdVideo(String externalId);
    public abstract List<VideoComment> findByExternalIdVideo(String externalId);
    public abstract  void deleteByExternalIdVideo(String externalId);

}
