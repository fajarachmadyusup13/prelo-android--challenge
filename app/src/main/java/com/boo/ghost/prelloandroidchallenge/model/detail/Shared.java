
package com.boo.ghost.prelloandroidchallenge.model.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shared {

    @SerializedName("TWITTER")
    @Expose
    private Integer tWITTER;

    public Integer getTWITTER() {
        return tWITTER;
    }

    public void setTWITTER(Integer tWITTER) {
        this.tWITTER = tWITTER;
    }

}
