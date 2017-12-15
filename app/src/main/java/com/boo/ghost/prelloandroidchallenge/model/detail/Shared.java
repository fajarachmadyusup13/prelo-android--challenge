
package com.boo.ghost.prelloandroidchallenge.model.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shared {

    @SerializedName("INSTAGRAM")
    @Expose
    private Integer iNSTAGRAM;
    @SerializedName("PATH")
    @Expose
    private Integer pATH;
    @SerializedName("FACEBOOK")
    @Expose
    private Integer fACEBOOK;
    @SerializedName("TWITTER")
    @Expose
    private Integer tWITTER;
    @SerializedName("GOOGLE")
    @Expose
    private Integer gOOGLE;

    public Integer getINSTAGRAM() {
        return iNSTAGRAM;
    }

    public void setINSTAGRAM(Integer iNSTAGRAM) {
        this.iNSTAGRAM = iNSTAGRAM;
    }

    public Integer getPATH() {
        return pATH;
    }

    public void setPATH(Integer pATH) {
        this.pATH = pATH;
    }

    public Integer getFACEBOOK() {
        return fACEBOOK;
    }

    public void setFACEBOOK(Integer fACEBOOK) {
        this.fACEBOOK = fACEBOOK;
    }

    public Integer getTWITTER() {
        return tWITTER;
    }

    public void setTWITTER(Integer tWITTER) {
        this.tWITTER = tWITTER;
    }

    public Integer getGOOGLE() {
        return gOOGLE;
    }

    public void setGOOGLE(Integer gOOGLE) {
        this.gOOGLE = gOOGLE;
    }

}
