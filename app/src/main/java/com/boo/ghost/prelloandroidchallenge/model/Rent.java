
package com.boo.ghost.prelloandroidchallenge.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rent {

    @SerializedName("docs")
    @Expose
    private List<Object> docs = null;

    public List<Object> getDocs() {
        return docs;
    }

    public void setDocs(List<Object> docs) {
        this.docs = docs;
    }

}
