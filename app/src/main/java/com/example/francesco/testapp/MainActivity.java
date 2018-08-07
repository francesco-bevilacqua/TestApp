package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button  bottone1;
    private Button  bottone2;
    private Button  bottone3;
    private Button  bottone4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottone1 = findViewById(R.id.button1);
        bottone2 = findViewById(R.id.button2);
        bottone3 = findViewById(R.id.button3);
        bottone4 = findViewById(R.id.button4);



        View.OnClickListener gestore = new View.OnClickListener() {
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.button1:
                        Intent i1=new Intent(MainActivity.this, Activity1.class);
                        startActivity(i1);
                        break;
                    case R.id.button2:
                        Intent i2=new Intent(MainActivity.this, Activity2.class);
                        startActivity(i2);
                        break;
                    case R.id.button3:
                        Intent i3=new Intent(MainActivity.this, Activity3.class);
                        startActivity(i3);
                        break;
                    case R.id.button4:
                        Intent i4=new Intent(MainActivity.this, Activity4.class);
                        startActivity(i4);
                        break;
                }
            }
        };

        bottone1.setOnClickListener(gestore);
        bottone2.setOnClickListener(gestore);
        bottone3.setOnClickListener(gestore);
        bottone4.setOnClickListener(gestore);

    }

}
