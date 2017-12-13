package com.boo.ghost.prelloandroidchallenge;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.boo.ghost.prelloandroidchallenge.apihelper.BaseApiService;
import com.boo.ghost.prelloandroidchallenge.apihelper.UtilsApi;
import com.boo.ghost.prelloandroidchallenge.model.user.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextInputEditText usernameEditText;
    TextInputEditText passwordEditText;
    Button loginButton;
    Context mContext;
    BaseApiService mApiService;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

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
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preferences.edit();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (usernameEditText.getText().toString().length() < 4) {
                    validate(1);
                }else if (passwordEditText.getText().toString().length() < 6) {
                    validate(2);
                }else {
                    requestLogin();
                }

            }
        });
    }

    public void validate(int i){
        switch (i){
            case 1:
                Toast.makeText(this, "username at least 4 characters", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "password at least 6 characters", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void requestLogin() {
        mApiService.loginRequest("applicant", "password")
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.isSuccessful()){


                            User user = response.body();

                            editor.putString(getString(R.string.saved_token), user.getData().getToken());
                            editor.putString(getString(R.string.saved_fullname), user.getData().getFullname());
                            editor.putString(getString(R.string.saved_username), user.getData().getUsername());
                            editor.putString(getString(R.string.saved_email), user.getData().getEmail());
                            editor.putString(getString(R.string.saved_pict), user.getData().getProfile().getPict());
                            editor.putBoolean(getString(R.string.saved_login), true);

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
