package com.boo.ghost.prelloandroidchallenge;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.boo.ghost.prelloandroidchallenge.adapter.ListAdapter;
import com.boo.ghost.prelloandroidchallenge.apihelper.BaseApiService;
import com.boo.ghost.prelloandroidchallenge.apihelper.UtilsApi;
import com.boo.ghost.prelloandroidchallenge.model.product.Datum;
import com.boo.ghost.prelloandroidchallenge.model.product.Product;
import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LovelistActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView tv_fullname;
    private TextView tv_username;
    private TextView tv_email;
    private CircleImageView img_pict;


    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private BaseApiService mApiService;
    private Context context;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String token;
    String username;
    String fullname;
    String pict;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovelist);

        mApiService = UtilsApi.getApiService();
        context = this;

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();
        token = preferences.getString(getString(R.string.saved_token), getString(R.string.saved_token_default));
        fullname = preferences.getString(getString(R.string.saved_fullname), getString(R.string.saved_fullname_default));
        username = preferences.getString(getString(R.string.saved_username), getString(R.string.saved_username_default));
        email = preferences.getString(getString(R.string.saved_email), getString(R.string.saved_email_default));
        pict = preferences.getString(getString(R.string.saved_pict), getString(R.string.saved_pict_default));


        initComponents();

        requestList();
    }


    public void initComponents() {
        recyclerView = (RecyclerView) findViewById(R.id.recyler);
        tv_fullname = (TextView) findViewById(R.id.tv_fullname);
        tv_username = (TextView) findViewById(R.id.tv_username);
        tv_email = (TextView) findViewById(R.id.tv_email);
        img_pict = (CircleImageView) findViewById(R.id.img_pict);

        tv_fullname.setText(fullname);
        tv_username.setText(username);
        tv_email.setText(email);
        Glide.with(context).load(pict).into(img_pict);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    public void requestList(){

        mApiService.getLoveList("Token "+token)
                .enqueue(new Callback<Product>() {
                    @Override
                    public void onResponse(Call<Product> call, Response<Product> response) {
                        if (response.isSuccessful()) {
//                            Log.d("XXX", (response.body().getData().get(0).getBrandId()).toString());
                            Product myProd = response.body();
                            adapter = new ListAdapter(myProd.getData(), context);
                            recyclerView.setAdapter(adapter);
//                            Log.d("XXX", myProd.getData().get(0).);
                        }
                    }

                    @Override
                    public void onFailure(Call<Product> call, Throwable t) {

                    }
                });



    }
}
