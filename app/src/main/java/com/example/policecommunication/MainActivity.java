package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout attendanceBtn, messagePage, viewUser, insertUser, liveLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id Define
        attendanceBtn = findViewById(R.id.attendenceBtn);
        messagePage = findViewById(R.id.messagePage);
        viewUser = findViewById(R.id.ViewUser);
        insertUser = findViewById(R.id.insertUser);
        liveLocation = findViewById(R.id.liveLocation);




        // attendance view
        attendanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent attendance = new Intent(MainActivity.this, AttendanceSystem.class);
               startActivity(attendance);
            }
        });



        // message view
        messagePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent attendance = new Intent(MainActivity.this, MessagePage.class);
               startActivity(attendance);
            }
        });



        // user list view
        viewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent attendance = new Intent(MainActivity.this, ViewUserActivity.class);
               startActivity(attendance);
            }
        });




        // user insert view
        insertUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent attendance = new Intent(MainActivity.this, insertUserActivity.class);
               startActivity(attendance);
            }
        });





        // Live location view
        liveLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent attendance = new Intent(MainActivity.this, LiveLocation.class);
               startActivity(attendance);
            }
        });




    }
}