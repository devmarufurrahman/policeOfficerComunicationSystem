package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MessagePage extends AppCompatActivity {

    AppCompatImageView imageBack, imageInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_page);
        //id define
        imageBack = findViewById(R.id.imageBack);
        imageInfo = findViewById(R.id.imageInfo);




        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MessagePage.super.onBackPressed();
            }
        });
    }
}