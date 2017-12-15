package com.boo.ghost.prelloandroidchallenge.apihelper;

import com.boo.ghost.prelloandroidchallenge.model.detail.Data;
import com.boo.ghost.prelloandroidchallenge.model.product.Datum;
import com.boo.ghost.prelloandroidchallenge.model.product.Product;
import com.boo.ghost.prelloandroidchallenge.model.user.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by ghost on 12/12/17.
 */

public interface BaseApiService {

    @FormUrlEncoded
    @POST("auth/login")
    Call<User> loginRequest(@Field("username_or_email") String username,
                            @Field("password") String password);

    @GET("me/lovelist")
    Call<Product> getLoveList(@Header("Authorization") String token);


    @GET("product/{id_prod}")
    Call<Data> getProductDetail(@Header("Authorization") String token, @Path("id_prod") String id_prod);

}
