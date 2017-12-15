
package com.boo.ghost.prelloandroidchallenge.model.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShareStatus {

    @SerializedName("TWITTER")
    @Expose
    private Boolean tWITTER;
    @SerializedName("shared")
    @Expose
    private Shared shared;

    public Boolean getTWITTER() {
        return tWITTER;
    }

    public void setTWITTER(Boolean tWITTER) {
        this.tWITTER = tWITTER;
    }

    public Shared getShared() {
        return shared;
    }

    public void setShared(Shared shared) {
        this.shared = shared;
    }

}
