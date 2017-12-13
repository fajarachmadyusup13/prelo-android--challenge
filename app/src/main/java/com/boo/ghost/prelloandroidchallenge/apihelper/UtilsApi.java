package com.boo.ghost.prelloandroidchallenge.apihelper;

import android.content.Context;

/**
 * Created by ghost on 12/12/17.
 */

public class UtilsApi {
    public static final String BASE_URL_API = "https://dev.prelo.id/api/";

    public static BaseApiService getApiService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
