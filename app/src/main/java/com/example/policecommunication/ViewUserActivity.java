package com.example.policecommunication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ViewUserActivity extends AppCompatActivity {

    RecyclerView recyclerContact;
    EditText searchView;
    FloatingActionButton addContact;

    ArrayList<contactModal> arrContact = new ArrayList<>();

    private  RecyclerContactAdapter adapter;
    AppCompatImageView imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_user_activity);
        // id define
        recyclerContact = findViewById(R.id.recyclerContact);
        searchView = findViewById(R.id.searchView);
        addContact = findViewById(R.id.addContact);
        imageBack = findViewById(R.id.imageBackActivity);




        // toolbar
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewUserActivity.super.onBackPressed();
            }
        });


        // search option

        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                filterList(charSequence.toString().toLowerCase());
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });


        // ==================================

        // Add new contact
        addContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent addActivity = new Intent(ViewUserActivity.this,insertUserActivity.class);
                startActivity(addActivity);

            }
        });


        // =================================

        recyclerContact.setLayoutManager(new LinearLayoutManager(this));


        arrContact.add(new contactModal(R.drawable.user_image,"work 1","work description","location","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 2","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 3","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 4","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 5","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 6","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 7","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 9","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 10","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 11","work description","unknwon","empty log"));
        arrContact.add(new contactModal(R.drawable.user_image,"work 12","work description","unknwon","empty log"));

        adapter = new RecyclerContactAdapter(ViewUserActivity.this, arrContact);
        recyclerContact.setAdapter(adapter);

    }



    private void filterList(String text) {
        List<contactModal> filterList = new ArrayList<>();
        for(contactModal items: arrContact){
            if (items.getTitle().toLowerCase().contains(text.toLowerCase())){
                filterList.add(items);
            }
        }
        adapter.filterList(filterList);
    }
}