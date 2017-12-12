package com.boo.ghost.prelloandroidchallenge.apihelper;

import com.boo.ghost.prelloandroidchallenge.model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ghost on 12/12/17.
 */

public interface BaseApiService {

    @FormUrlEncoded
    @POST("auth/login")
    Call<User> loginRequest(@Field("username_or_email") String username,
                            @Field("password") String password);

}
