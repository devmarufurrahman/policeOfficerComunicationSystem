package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UserInfo extends AppCompatActivity {
    FloatingActionButton logoutBtn;

    AppCompatImageView imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        // id define
        logoutBtn = findViewById(R.id.logOutBtn);

        imageBack = findViewById(R.id.imageBackUserInfo);



        // toolbar
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserInfo.super.onBackPressed();
            }
        });


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("SharedPreference",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.apply();
                Toast.makeText(UserInfo.this, "Logout Successfully", Toast.LENGTH_SHORT).show();

                Intent login = new Intent(UserInfo.this, loginOtp.class);

                startActivity(login);
                finish();
            }
        });
    }
}