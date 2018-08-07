package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        final Button button = (Button) findViewById(R.id.form_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText edit_name = (EditText)findViewById(R.id.edit_name);
                final EditText edit_lastname = (EditText)findViewById(R.id.edit_lastname);
                Intent form_intent = new Intent(getApplicationContext(), Activity10.class);
                form_intent.putExtra("name", edit_name.getText().toString());
                form_intent.putExtra("lastname", edit_name.getText().toString());
                startActivity(form_intent);


            }
        });
    }

}