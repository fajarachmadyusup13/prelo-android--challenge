
package com.boo.ghost.prelloandroidchallenge.model.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("shipping_preferences_ids")
    @Expose
    private List<String> shippingPreferencesIds = null;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("profile")
    @Expose
    private Profile profile;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("others")
    @Expose
    private Others others;
    @SerializedName("main_bank_account")
    @Expose
    private MainBankAccount mainBankAccount;
    @SerializedName("rent")
    @Expose
    private Rent rent;
    @SerializedName("shop")
    @Expose
    private Shop shop;
    @SerializedName("default_address")
    @Expose
    private DefaultAddress defaultAddress;
    @SerializedName("token")
    @Expose
    private String token;

    public List<String> getShippingPreferencesIds() {
        return shippingPreferencesIds;
    }

    public void setShippingPreferencesIds(List<String> shippingPreferencesIds) {
        this.shippingPreferencesIds = shippingPreferencesIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Others getOthers() {
        return others;
    }

    public void setOthers(Others others) {
        this.others = others;
    }

    public MainBankAccount getMainBankAccount() {
        return mainBankAccount;
    }

    public void setMainBankAccount(MainBankAccount mainBankAccount) {
        this.mainBankAccount = mainBankAccount;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
