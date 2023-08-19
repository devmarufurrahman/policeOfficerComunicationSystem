package com.example.policecommunication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class registrationPage extends AppCompatActivity {

    ImageView userImage;
    EditText firstName, lastName, address, email, designation, nidNumber, policeId, age, userContact;
    Button signup;
    private final int CODE_REQ_GALLERY = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        // Id Define
        userImage = findViewById(R.id.userImage);
        firstName = findViewById(R.id.userFirstName);
        lastName = findViewById(R.id.userLastName);
        address = findViewById(R.id.regAddress);
        email = findViewById(R.id.regEmail);
        designation = findViewById(R.id.userDesignation);
        nidNumber = findViewById(R.id.userNid);
        policeId = findViewById(R.id.userPoliceId);
        age = findViewById(R.id.userAge);
        signup = findViewById(R.id.signupBtn);
        userContact = findViewById(R.id.userContact);


        // user image select from gallery
        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery,CODE_REQ_GALLERY);
            }
        });


        // User registration action
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!firstName.getText().toString().equals("") &&  !email.getText().toString().equals("") && !designation.getText().toString().equals("") && !nidNumber.getText().toString().equals("") && !policeId.getText().toString().equals("")){

                    Intent signupSuccessfully = new Intent(registrationPage.this, loginOtp.class);
                    startActivity(signupSuccessfully);
                    finish();
                    Toast.makeText(registrationPage.this, "User Account Create Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(registrationPage.this, "Please Input all field", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    // image select
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // gallery image pick

        if(resultCode == RESULT_OK && requestCode == CODE_REQ_GALLERY){
            userImage.setImageURI(data.getData());
        }
    }
}