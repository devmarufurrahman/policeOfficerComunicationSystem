package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    public static String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        // login authentication

        SharedPreferences preferences = getSharedPreferences("SharedPreference",MODE_PRIVATE);
        user = preferences.getString("user","");




        // splash screen delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                if (!user.equals("")) {
                    Intent home = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(home);
                } else {
                    Intent login = new Intent(SplashScreen.this, loginOtp.class);
                    startActivity(login);
                }

                finish();
            }
        },4000);
    }
}