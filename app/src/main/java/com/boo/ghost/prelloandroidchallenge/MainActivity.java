package com.boo.ghost.prelloandroidchallenge;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.boo.ghost.prelloandroidchallenge.apihelper.BaseApiService;
import com.boo.ghost.prelloandroidchallenge.apihelper.UtilsApi;
import com.boo.ghost.prelloandroidchallenge.model.Data;
import com.boo.ghost.prelloandroidchallenge.model.User;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextInputEditText usernameEditText;
    TextInputEditText passwordEditText;
    Button loginButton;
    Context mContext;
    BaseApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
        mApiService = UtilsApi.getApiService();
        initComponents();
    }

    public void initComponents() {

        usernameEditText = (TextInputEditText) findViewById(R.id.et_username);
        passwordEditText = (TextInputEditText) findViewById(R.id.et_password);
        loginButton = (Button) findViewById(R.id.btn_login);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requestLogin();
            }
        });
    }

    public void requestLogin() {
        mApiService.loginRequest(usernameEditText.getText().toString(), passwordEditText.getText().toString())
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.isSuccessful()){
                            SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = preferences.edit();

                            User user = response.body();

                            editor.putString(getString(R.string.saved_token), user.getData().getToken());
                            editor.commit();

                            Intent intent = new Intent(mContext, LovelistActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });
    }
}
