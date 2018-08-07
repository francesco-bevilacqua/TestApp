package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity10 extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        Intent i =getIntent();
        String name=i.getStringExtra("name");
        String lastname =i.getStringExtra("lastname");
        Intent i2= new Intent(this,Activity12.class);
        i2.putExtra("name",name);
        i2.putExtra("lastname", lastname);

        button1 = findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(i2);
            }
        });

    }
}
