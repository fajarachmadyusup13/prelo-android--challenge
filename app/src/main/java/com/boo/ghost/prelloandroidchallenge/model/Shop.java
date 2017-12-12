
package com.boo.ghost.prelloandroidchallenge.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shop {

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("start_date")
    @Expose
    private Object startDate;
    @SerializedName("end_date")
    @Expose
    private Object endDate;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

}
