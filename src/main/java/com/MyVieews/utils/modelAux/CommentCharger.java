package com.MyVieews.utils.modelAux;

import com.MyVieews.model.collections.VideoComment;
import com.MyVieews.model.collections.objectCollections.Comentario;

public class CommentCharger {
    private String externalIdVideo;
    private Comentario comment;

    public String getExternalIdVideo() {
        return externalIdVideo;
    }

    public void setExternalIdVideo(String externalIdVideo) {
        this.externalIdVideo = externalIdVideo;
    }

    public Comentario getComment() {
        return comment;
    }

    public void setComment(Comentario comment) {
        this.comment = comment;
    }
}
