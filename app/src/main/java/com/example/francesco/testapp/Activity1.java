package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {


    private Button  button5;
    private Button  button6;
    private Button  button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);



        View.OnClickListener gestore = new View.OnClickListener() {
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.button5:
                        Intent i1=new Intent(Activity1.this, Activity5.class);
                        startActivity(i1);
                        break;
                    case R.id.button6:
                        Intent i2=new Intent(Activity1.this, Activity6.class);
                        i2.putExtra("First Value", "Category");
                        startActivity(i2);
                        break;
                    case R.id.button7:
                        Intent i3=new Intent(Activity1.this, Activity7.class);
                        i3.putExtra("Second Value", "Product");
                        startActivity(i3);
                        break;
                }
            }
        };

        button5.setOnClickListener(gestore);
        button6.setOnClickListener(gestore);
        button7.setOnClickListener(gestore);





    }



}
