package com.MyVieews.model.collections;

import com.MyVieews.model.collections.objectCollections.Like;
import com.mongodb.lang.NonNull;
import com.sun.istack.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document(collection =  "CanalLike")
public class CanalLike implements Serializable {
    @Id
    private long idCanal;
    private List<Like> listaLikes;

    public long getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(long idCanal) {
        this.idCanal = idCanal;
    }

    public List<Like> getList() {
        return listaLikes;
    }

    public void add (Like like) {
        if (listaLikes==null){
            listaLikes= new ArrayList<>();
        }
        listaLikes.add(like);
    }

    public void setListaLikes(List<Like> listaLikes) {
        this.listaLikes = listaLikes;
    }
}
