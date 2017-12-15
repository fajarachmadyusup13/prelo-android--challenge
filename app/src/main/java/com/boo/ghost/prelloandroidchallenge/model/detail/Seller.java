
package com.boo.ghost.prelloandroidchallenge.model.detail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seller {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("achievements")
    @Expose
    private List<Achievement> achievements = null;
    @SerializedName("shipping_preferences")
    @Expose
    private List<String> shippingPreferences = null;
    @SerializedName("pict")
    @Expose
    private String pict;
    @SerializedName("region_id")
    @Expose
    private String regionId;
    @SerializedName("last_seen")
    @Expose
    private String lastSeen;
    @SerializedName("average_star")
    @Expose
    private Integer averageStar;
    @SerializedName("num_reviewer")
    @Expose
    private Integer numReviewer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public List<String> getShippingPreferences() {
        return shippingPreferences;
    }

    public void setShippingPreferences(List<String> shippingPreferences) {
        this.shippingPreferences = shippingPreferences;
    }

    public String getPict() {
        return pict;
    }

    public void setPict(String pict) {
        this.pict = pict;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Integer getAverageStar() {
        return averageStar;
    }

    public void setAverageStar(Integer averageStar) {
        this.averageStar = averageStar;
    }

    public Integer getNumReviewer() {
        return numReviewer;
    }

    public void setNumReviewer(Integer numReviewer) {
        this.numReviewer = numReviewer;
    }

}
