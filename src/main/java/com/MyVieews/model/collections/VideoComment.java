package com.MyVieews.model.collections;

import com.MyVieews.model.collections.objectCollections.Comentario;
import com.mongodb.lang.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "VideoComment")
public class VideoComment implements Serializable {
    @Id
    private String externalIdVideo;
    private List<Comentario> comentarioList;


    public String getExternalIdVideo() {
        return externalIdVideo;
    }

    public void setExternalIdVideo( String externalIdVideo) {
        this.externalIdVideo = externalIdVideo;
    }

    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void add(Comentario comentario){
        if (comentarioList == null){
            comentarioList= new ArrayList<>();
        }
        comentarioList.add(comentario);
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }
}
