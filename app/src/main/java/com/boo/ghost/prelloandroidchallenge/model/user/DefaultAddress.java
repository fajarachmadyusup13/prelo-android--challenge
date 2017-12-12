
package com.boo.ghost.prelloandroidchallenge.model.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DefaultAddress {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("is_default")
    @Expose
    private boolean isDefault;
    @SerializedName("create_time")
    @Expose
    private String createTime;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("subdistrict_name")
    @Expose
    private String subdistrictName;
    @SerializedName("subdistrict_id")
    @Expose
    private String subdistrictId;
    @SerializedName("region_name")
    @Expose
    private String regionName;
    @SerializedName("region_id")
    @Expose
    private String regionId;
    @SerializedName("province_name")
    @Expose
    private String provinceName;
    @SerializedName("province_id")
    @Expose
    private String provinceId;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("owner_name")
    @Expose
    private String ownerName;
    @SerializedName("address_name")
    @Expose
    private String addressName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubdistrictName() {
        return subdistrictName;
    }

    public void setSubdistrictName(String subdistrictName) {
        this.subdistrictName = subdistrictName;
    }

    public String getSubdistrictId() {
        return subdistrictId;
    }

    public void setSubdistrictId(String subdistrictId) {
        this.subdistrictId = subdistrictId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

}
