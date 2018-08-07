package com.example.francesco.testapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.francesco.testapp.Network.OkHttpProvider;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Activity11 extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);
        Intent i1= getIntent();
        String value= i1.getStringExtra("First Value");
        Intent i2= new Intent(this, Activity13.class);
        i2.putExtra("First Value", value);


        button1 = findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(i2);
            }
        });

    }


}
