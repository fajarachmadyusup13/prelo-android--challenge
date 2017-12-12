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

import com.boo.ghost.prelloandroidchallenge.adapter.ListAdapter;
import com.boo.ghost.prelloandroidchallenge.apihelper.BaseApiService;
import com.boo.ghost.prelloandroidchallenge.apihelper.UtilsApi;
import com.boo.ghost.prelloandroidchallenge.model.product.Datum;
import com.boo.ghost.prelloandroidchallenge.model.product.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LovelistActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private BaseApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovelist);

        mApiService = UtilsApi.getApiService();


        recyclerView = (RecyclerView) findViewById(R.id.recyler);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        requestList();
    }

    public void requestList(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String token = preferences.getString(getString(R.string.saved_token), getString(R.string.saved_token_default));

        mApiService.getLoveList("Token "+token)
                .enqueue(new Callback<Product>() {
                    @Override
                    public void onResponse(Call<Product> call, Response<Product> response) {
                        if (response.isSuccessful()) {
//                            Log.d("XXX", (response.body().getData().get(0).getBrandId()).toString());
                            Product myProd = response.body();
                            adapter = new ListAdapter(myProd.getData());
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
