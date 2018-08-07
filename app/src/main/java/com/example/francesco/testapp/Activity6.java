package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity6 extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Intent i = getIntent();
        String value = i.getStringExtra("First Value");
        Intent i2 = new Intent(this, Activity11.class);
        i2.putExtra("First Value", value);

        button1 = findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(i2);
            }
        });



    }
}
