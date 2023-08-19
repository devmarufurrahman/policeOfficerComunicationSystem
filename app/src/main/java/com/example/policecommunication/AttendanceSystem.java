package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class AttendanceSystem extends AppCompatActivity {

    Button inTimeBtn, outTimeBtn;
    TextView inTime, outTime, todayDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_system);

        // Id Define
        inTime = findViewById(R.id.inTimeShow);
        outTime = findViewById(R.id.outTimeShow);
        todayDate = findViewById(R.id.dateShow);
        outTimeBtn = findViewById(R.id.outTimeBtn);
        inTimeBtn = findViewById(R.id.inTimeBtn);
        
        
        // in time 
        inTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inTimeAndDateGet();
                Toast.makeText(AttendanceSystem.this, "Attendance In Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        // out time
        outTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outTimeAndDateGet();
                Toast.makeText(AttendanceSystem.this, "Attendance Out Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        
    }

    private void inTimeAndDateGet() {

        // date get
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = formatter.format(date);
        todayDate.setText(currentDate.toString());


        // time get
        SimpleDateFormat timeFormat = new SimpleDateFormat( "HH:mm:ss a");
        String currentTime = timeFormat.format(date);
        inTime.setText(currentTime.toString());


    }


    // out time function
    private void outTimeAndDateGet() {

        // date get
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = formatter.format(date);
        todayDate.setText(currentDate.toString());


        // time get
        SimpleDateFormat timeFormat = new SimpleDateFormat( "HH:mm:ss a");
        String currentTime = timeFormat.format(date);
        outTime.setText(currentTime.toString());


    }
}