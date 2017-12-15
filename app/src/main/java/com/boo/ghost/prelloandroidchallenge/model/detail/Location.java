
package com.boo.ghost.prelloandroidchallenge.model.detail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("coordinate")
    @Expose
    private List<Object> coordinate = null;

    public List<Object> getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(List<Object> coordinate) {
        this.coordinate = coordinate;
    }

}
