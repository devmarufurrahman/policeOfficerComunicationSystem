package com.example.policecommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginOtp extends AppCompatActivity {

    Button loginBtn, regBtn;
    EditText loginUserNo;
    public static String loginNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);

        // id Define
        loginBtn = findViewById(R.id.loginBtn);
        loginUserNo = findViewById(R.id.loginUser);
        regBtn = findViewById(R.id.regBtn);



        // login btn action
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // user number validation
                if (!loginUserNo.getText().toString().equals("")){
                    Dialog dialog = new Dialog(loginOtp.this);
                    dialog.setContentView(R.layout.otp_input);

                    EditText editOtp = dialog.findViewById(R.id.editOtp);
                    Button otpSubmit = dialog.findViewById(R.id.otpBtn);

                    // otp submit action
                    otpSubmit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (!editOtp.getText().toString().equals("")){
                                editOtp.getText().toString();
                                Intent dashboard = new Intent(loginOtp.this, MainActivity.class);
                                startActivity(dashboard);
                                finish();
                                dialog.dismiss();
                            } else {
                                Toast.makeText(loginOtp.this, "OTP Invalid", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });


                    dialog.show();



                    // Login number get
                    loginNumber = loginUserNo.getText().toString();
                } else {
                    Toast.makeText(loginOtp.this, "Please Input Number", Toast.LENGTH_SHORT).show();
                }

            }

        });


        // Registration page
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signup = new Intent(loginOtp.this,registrationPage.class);
                startActivity(signup);
                finish();
            }
        });

    }
}