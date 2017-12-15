
package com.boo.ghost.prelloandroidchallenge.model.detail;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("special_story")
    @Expose
    private String specialStory;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("sell_reason")
    @Expose
    private String sellReason;
    @SerializedName("defect_description")
    @Expose
    private String defectDescription;
    @SerializedName("product_condition_id")
    @Expose
    private String productConditionId;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("brand_id")
    @Expose
    private String brandId;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("price_original")
    @Expose
    private Integer priceOriginal;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("free_ongkir")
    @Expose
    private Integer freeOngkir;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("total_views")
    @Expose
    private Integer totalViews;
    @SerializedName("display_priority")
    @Expose
    private Integer displayPriority;
    @SerializedName("num_lovelist")
    @Expose
    private Integer numLovelist;
    @SerializedName("num_comment")
    @Expose
    private Integer numComment;
    @SerializedName("commission")
    @Expose
    private Integer commission;
    @SerializedName("follow")
    @Expose
    private Integer follow;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("__v")
    @Expose
    private Integer v;
    @SerializedName("last_seen")
    @Expose
    private String lastSeen;
    @SerializedName("update_time_uuid")
    @Expose
    private String updateTimeUuid;
    @SerializedName("name_lowercase")
    @Expose
    private String nameLowercase;
    @SerializedName("history")
    @Expose
    private List<Object> history = null;
    @SerializedName("aggregate_review")
    @Expose
    private List<Object> aggregateReview = null;
    @SerializedName("random_data")
    @Expose
    private List<Double> randomData = null;
    @SerializedName("photo_quiz_watermark")
    @Expose
    private List<Object> photoQuizWatermark = null;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("related_link")
    @Expose
    private List<Object> relatedLink = null;
    @SerializedName("related_aggregate")
    @Expose
    private List<Object> relatedAggregate = null;
    @SerializedName("rejection_history")
    @Expose
    private List<Object> rejectionHistory = null;
    @SerializedName("jenis_barang")
    @Expose
    private String jenisBarang;
    @SerializedName("promo_categories")
    @Expose
    private List<Object> promoCategories = null;
    @SerializedName("segments")
    @Expose
    private List<Object> segments = null;
    @SerializedName("free_ongkir_area")
    @Expose
    private List<Object> freeOngkirArea = null;
    @SerializedName("display_pict_labels")
    @Expose
    private List<String> displayPictLabels = null;
    @SerializedName("display_picts")
    @Expose
    private List<String> displayPicts = null;
    @SerializedName("keywords")
    @Expose
    private List<String> keywords = null;
    @SerializedName("brand_under_review")
    @Expose
    private Boolean brandUnderReview;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("permalink_without_p")
    @Expose
    private String permalinkWithoutP;
    @SerializedName("status_text")
    @Expose
    private String statusText;
    @SerializedName("listing_type")
    @Expose
    private Integer listingType;
    @SerializedName("ab_test")
    @Expose
    private List<String> abTest = null;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("comments")
    @Expose
    private List<Object> comments = null;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("love")
    @Expose
    private Boolean love;
    @SerializedName("original_picts")
    @Expose
    private List<String> originalPicts = null;
    @SerializedName("share_status")
    @Expose
    private ShareStatus shareStatus;
    @SerializedName("category_breadcrumbs")
    @Expose
    private List<CategoryBreadcrumb> categoryBreadcrumbs = null;
    @SerializedName("bought_by_me")
    @Expose
    private Boolean boughtByMe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialStory() {
        return specialStory;
    }

    public void setSpecialStory(String specialStory) {
        this.specialStory = specialStory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSellReason() {
        return sellReason;
    }

    public void setSellReason(String sellReason) {
        this.sellReason = sellReason;
    }

    public String getDefectDescription() {
        return defectDescription;
    }

    public void setDefectDescription(String defectDescription) {
        this.defectDescription = defectDescription;
    }

    public String getProductConditionId() {
        return productConditionId;
    }

    public void setProductConditionId(String productConditionId) {
        this.productConditionId = productConditionId;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    public void setPriceOriginal(Integer priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFreeOngkir() {
        return freeOngkir;
    }

    public void setFreeOngkir(Integer freeOngkir) {
        this.freeOngkir = freeOngkir;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(Integer totalViews) {
        this.totalViews = totalViews;
    }

    public Integer getDisplayPriority() {
        return displayPriority;
    }

    public void setDisplayPriority(Integer displayPriority) {
        this.displayPriority = displayPriority;
    }

    public Integer getNumLovelist() {
        return numLovelist;
    }

    public void setNumLovelist(Integer numLovelist) {
        this.numLovelist = numLovelist;
    }

    public Integer getNumComment() {
        return numComment;
    }

    public void setNumComment(Integer numComment) {
        this.numComment = numComment;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getUpdateTimeUuid() {
        return updateTimeUuid;
    }

    public void setUpdateTimeUuid(String updateTimeUuid) {
        this.updateTimeUuid = updateTimeUuid;
    }

    public String getNameLowercase() {
        return nameLowercase;
    }

    public void setNameLowercase(String nameLowercase) {
        this.nameLowercase = nameLowercase;
    }

    public List<Object> getHistory() {
        return history;
    }

    public void setHistory(List<Object> history) {
        this.history = history;
    }

    public List<Object> getAggregateReview() {
        return aggregateReview;
    }

    public void setAggregateReview(List<Object> aggregateReview) {
        this.aggregateReview = aggregateReview;
    }

    public List<Double> getRandomData() {
        return randomData;
    }

    public void setRandomData(List<Double> randomData) {
        this.randomData = randomData;
    }

    public List<Object> getPhotoQuizWatermark() {
        return photoQuizWatermark;
    }

    public void setPhotoQuizWatermark(List<Object> photoQuizWatermark) {
        this.photoQuizWatermark = photoQuizWatermark;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Object> getRelatedLink() {
        return relatedLink;
    }

    public void setRelatedLink(List<Object> relatedLink) {
        this.relatedLink = relatedLink;
    }

    public List<Object> getRelatedAggregate() {
        return relatedAggregate;
    }

    public void setRelatedAggregate(List<Object> relatedAggregate) {
        this.relatedAggregate = relatedAggregate;
    }

    public List<Object> getRejectionHistory() {
        return rejectionHistory;
    }

    public void setRejectionHistory(List<Object> rejectionHistory) {
        this.rejectionHistory = rejectionHistory;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public List<Object> getPromoCategories() {
        return promoCategories;
    }

    public void setPromoCategories(List<Object> promoCategories) {
        this.promoCategories = promoCategories;
    }

    public List<Object> getSegments() {
        return segments;
    }

    public void setSegments(List<Object> segments) {
        this.segments = segments;
    }

    public List<Object> getFreeOngkirArea() {
        return freeOngkirArea;
    }

    public void setFreeOngkirArea(List<Object> freeOngkirArea) {
        this.freeOngkirArea = freeOngkirArea;
    }

    public List<String> getDisplayPictLabels() {
        return displayPictLabels;
    }

    public void setDisplayPictLabels(List<String> displayPictLabels) {
        this.displayPictLabels = displayPictLabels;
    }

    public List<String> getDisplayPicts() {
        return displayPicts;
    }

    public void setDisplayPicts(List<String> displayPicts) {
        this.displayPicts = displayPicts;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Boolean getBrandUnderReview() {
        return brandUnderReview;
    }

    public void setBrandUnderReview(Boolean brandUnderReview) {
        this.brandUnderReview = brandUnderReview;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPermalinkWithoutP() {
        return permalinkWithoutP;
    }

    public void setPermalinkWithoutP(String permalinkWithoutP) {
        this.permalinkWithoutP = permalinkWithoutP;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Integer getListingType() {
        return listingType;
    }

    public void setListingType(Integer listingType) {
        this.listingType = listingType;
    }

    public List<String> getAbTest() {
        return abTest;
    }

    public void setAbTest(List<String> abTest) {
        this.abTest = abTest;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getLove() {
        return love;
    }

    public void setLove(Boolean love) {
        this.love = love;
    }

    public List<String> getOriginalPicts() {
        return originalPicts;
    }

    public void setOriginalPicts(List<String> originalPicts) {
        this.originalPicts = originalPicts;
    }

    public ShareStatus getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus;
    }

    public List<CategoryBreadcrumb> getCategoryBreadcrumbs() {
        return categoryBreadcrumbs;
    }

    public void setCategoryBreadcrumbs(List<CategoryBreadcrumb> categoryBreadcrumbs) {
        this.categoryBreadcrumbs = categoryBreadcrumbs;
    }

    public Boolean getBoughtByMe() {
        return boughtByMe;
    }

    public void setBoughtByMe(Boolean boughtByMe) {
        this.boughtByMe = boughtByMe;
    }

}
