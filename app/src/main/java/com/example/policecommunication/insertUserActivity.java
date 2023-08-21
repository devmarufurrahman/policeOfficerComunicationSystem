package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class insertUserActivity extends AppCompatActivity {
    EditText title, desc, location, log;
    Button actvAddBtn;
    AppCompatImageView imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_user);
        // id define
        title = findViewById(R.id.editActvTitle);
        desc = findViewById(R.id.editActvDesc);
        location = findViewById(R.id.editActvLocation);
        log = findViewById(R.id.editActvLog);
        actvAddBtn = findViewById(R.id.addActivityBtn);
        imageBack = findViewById(R.id.imageBackInsert);




        // toolbar
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertUserActivity.super.onBackPressed();
            }
        });


        actvAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!title.getText().toString().equals("") && !desc.getText().toString().equals("") && !location.getText().toString().equals("") && !log.getText().toString().equals("")){
                    Toast.makeText(insertUserActivity.this, "Save All Activity Successfully", Toast.LENGTH_SHORT).show();
                    title.setText("");
                    desc.setText("");
                    location.setText("");
                    log.setText("");
                } else {
                    Toast.makeText(insertUserActivity.this, "Input All Field", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}