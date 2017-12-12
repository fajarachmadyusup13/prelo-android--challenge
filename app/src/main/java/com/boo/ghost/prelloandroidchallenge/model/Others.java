
package com.boo.ghost.prelloandroidchallenge.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Others {

    @SerializedName("register_time")
    @Expose
    private String registerTime;
    @SerializedName("platform_register_from")
    @Expose
    private String platformRegisterFrom;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("register_by_fb")
    @Expose
    private boolean registerByFb;
    @SerializedName("register_by_path")
    @Expose
    private boolean registerByPath;
    @SerializedName("register_by_twitter")
    @Expose
    private boolean registerByTwitter;
    @SerializedName("register_by_google")
    @Expose
    private boolean registerByGoogle;
    @SerializedName("last_seen")
    @Expose
    private String lastSeen;
    @SerializedName("last_sent_sms")
    @Expose
    private String lastSentSms;
    @SerializedName("is_phone_verified")
    @Expose
    private boolean isPhoneVerified;
    @SerializedName("phone_code")
    @Expose
    private String phoneCode;
    @SerializedName("total_sent_sms")
    @Expose
    private int totalSentSms;
    @SerializedName("device_registration_id")
    @Expose
    private String deviceRegistrationId;
    @SerializedName("device_type")
    @Expose
    private String deviceType;
    @SerializedName("email_code")
    @Expose
    private String emailCode;
    @SerializedName("is_email_verified")
    @Expose
    private boolean isEmailVerified;
    @SerializedName("num_reviewer")
    @Expose
    private int numReviewer;
    @SerializedName("total_star")
    @Expose
    private int totalStar;
    @SerializedName("max_push_in_period")
    @Expose
    private int maxPushInPeriod;
    @SerializedName("push_product_period")
    @Expose
    private int pushProductPeriod;
    @SerializedName("category_preferences_ids")
    @Expose
    private List<Object> categoryPreferencesIds = null;
    @SerializedName("fa_id")
    @Expose
    private List<Object> faId = null;
    @SerializedName("ga_id")
    @Expose
    private List<Object> gaId = null;

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getPlatformRegisterFrom() {
        return platformRegisterFrom;
    }

    public void setPlatformRegisterFrom(String platformRegisterFrom) {
        this.platformRegisterFrom = platformRegisterFrom;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isRegisterByFb() {
        return registerByFb;
    }

    public void setRegisterByFb(boolean registerByFb) {
        this.registerByFb = registerByFb;
    }

    public boolean isRegisterByPath() {
        return registerByPath;
    }

    public void setRegisterByPath(boolean registerByPath) {
        this.registerByPath = registerByPath;
    }

    public boolean isRegisterByTwitter() {
        return registerByTwitter;
    }

    public void setRegisterByTwitter(boolean registerByTwitter) {
        this.registerByTwitter = registerByTwitter;
    }

    public boolean isRegisterByGoogle() {
        return registerByGoogle;
    }

    public void setRegisterByGoogle(boolean registerByGoogle) {
        this.registerByGoogle = registerByGoogle;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getLastSentSms() {
        return lastSentSms;
    }

    public void setLastSentSms(String lastSentSms) {
        this.lastSentSms = lastSentSms;
    }

    public boolean isIsPhoneVerified() {
        return isPhoneVerified;
    }

    public void setIsPhoneVerified(boolean isPhoneVerified) {
        this.isPhoneVerified = isPhoneVerified;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public int getTotalSentSms() {
        return totalSentSms;
    }

    public void setTotalSentSms(int totalSentSms) {
        this.totalSentSms = totalSentSms;
    }

    public String getDeviceRegistrationId() {
        return deviceRegistrationId;
    }

    public void setDeviceRegistrationId(String deviceRegistrationId) {
        this.deviceRegistrationId = deviceRegistrationId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public boolean isIsEmailVerified() {
        return isEmailVerified;
    }

    public void setIsEmailVerified(boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public int getNumReviewer() {
        return numReviewer;
    }

    public void setNumReviewer(int numReviewer) {
        this.numReviewer = numReviewer;
    }

    public int getTotalStar() {
        return totalStar;
    }

    public void setTotalStar(int totalStar) {
        this.totalStar = totalStar;
    }

    public int getMaxPushInPeriod() {
        return maxPushInPeriod;
    }

    public void setMaxPushInPeriod(int maxPushInPeriod) {
        this.maxPushInPeriod = maxPushInPeriod;
    }

    public int getPushProductPeriod() {
        return pushProductPeriod;
    }

    public void setPushProductPeriod(int pushProductPeriod) {
        this.pushProductPeriod = pushProductPeriod;
    }

    public List<Object> getCategoryPreferencesIds() {
        return categoryPreferencesIds;
    }

    public void setCategoryPreferencesIds(List<Object> categoryPreferencesIds) {
        this.categoryPreferencesIds = categoryPreferencesIds;
    }

    public List<Object> getFaId() {
        return faId;
    }

    public void setFaId(List<Object> faId) {
        this.faId = faId;
    }

    public List<Object> getGaId() {
        return gaId;
    }

    public void setGaId(List<Object> gaId) {
        this.gaId = gaId;
    }

}
