package com.boo.ghost.prelloandroidchallenge;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.boo.ghost.prelloandroidchallenge.apihelper.BaseApiService;
import com.boo.ghost.prelloandroidchallenge.apihelper.UtilsApi;
import com.boo.ghost.prelloandroidchallenge.model.detail.Detail;
import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    Button btn_beli;
    ImageView img_product;
    TextView tv_name;
    TextView tv_price;
    CircleImageView img_seller;
    TextView tv_seller_name;
    TextView tv_seller_email;
    BaseApiService mApiService;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String token;
    String id_product;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initComponent();
        requestDetail();
    }


    private void initComponent(){
        context = this;
        btn_beli = findViewById(R.id.btn_beli);
        img_product = findViewById(R.id.img_product);
        tv_name = findViewById(R.id.tv_name);
        tv_price = findViewById(R.id.tv_price);
        img_seller = findViewById(R.id.img_seller);
        tv_seller_name = findViewById(R.id.tv_seller_name);
        tv_seller_email = findViewById(R.id.tv_seller_email);
        mApiService = UtilsApi.getApiService();
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        token  = preferences.getString(getString(R.string.saved_token), getString(R.string.saved_token_default));
        id_product  = preferences.getString(getString(R.string.id_product), getString(R.string.saved_token_default));
    }

    public void requestDetail(){
        mApiService.getProductDetail("Token "+token, id_product).enqueue(new Callback<Detail>() {
            @Override
            public void onResponse(Call<Detail> call, Response<Detail> response) {
                Glide.with(context).load(response.body().getData().getDisplayPicts().get(0)).into(img_product);
                Glide.with(context).load(response.body().getData().getSeller().getPict()).into(img_seller);
                tv_seller_name.setText(response.body().getData().getSeller().getFullname());
                tv_seller_email.setText(response.body().getData().getSeller().getEmail());
                tv_name.setText(response.body().getData().getName());
                tv_price.setText("Rp." + response.body().getData().getPrice().toString());
            }

            @Override
            public void onFailure(Call<Detail> call, Throwable t) {

            }
        });
    }


}
