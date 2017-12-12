
package com.boo.ghost.prelloandroidchallenge.model.product;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("seller_id")
    @Expose
    private String sellerId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("special_story")
    @Expose
    private String specialStory;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("price_original")
    @Expose
    private int priceOriginal;
    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("free_ongkir")
    @Expose
    private int freeOngkir;
    @SerializedName("num_lovelist")
    @Expose
    private int numLovelist;
    @SerializedName("num_comment")
    @Expose
    private int numComment;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("display_picts")
    @Expose
    private List<String> displayPicts = null;
    @SerializedName("update_time_uuid")
    @Expose
    private String updateTimeUuid;
    @SerializedName("update_time")
    @Expose
    private String updateTime;
    @SerializedName("proposed_brand")
    @Expose
    private String proposedBrand;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getSpecialStory() {
        return specialStory;
    }

    public void setSpecialStory(String specialStory) {
        this.specialStory = specialStory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceOriginal() {
        return priceOriginal;
    }

    public void setPriceOriginal(int priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFreeOngkir() {
        return freeOngkir;
    }

    public void setFreeOngkir(int freeOngkir) {
        this.freeOngkir = freeOngkir;
    }

    public int getNumLovelist() {
        return numLovelist;
    }

    public void setNumLovelist(int numLovelist) {
        this.numLovelist = numLovelist;
    }

    public int getNumComment() {
        return numComment;
    }

    public void setNumComment(int numComment) {
        this.numComment = numComment;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public List<String> getDisplayPicts() {
        return displayPicts;
    }

    public void setDisplayPicts(List<String> displayPicts) {
        this.displayPicts = displayPicts;
    }

    public String getUpdateTimeUuid() {
        return updateTimeUuid;
    }

    public void setUpdateTimeUuid(String updateTimeUuid) {
        this.updateTimeUuid = updateTimeUuid;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getProposedBrand() {
        return proposedBrand;
    }

    public void setProposedBrand(String proposedBrand) {
        this.proposedBrand = proposedBrand;
    }

}
