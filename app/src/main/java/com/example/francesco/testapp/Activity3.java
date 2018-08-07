package com.example.francesco.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        GridView Gridview = (GridView) findViewById(R.id.gridview);
        final String[] colori=new String[]{"Red","White","Yellow","Green","Blue", "Black"};
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, R.layout.row, R.id.textViewList, colori);
        Gridview.setAdapter(arrayAdapter);
        Gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos, long id)
            {
                Intent i = new Intent(Activity3.this, Activity9.class);
                i.putExtra("color", colori[pos]);
                startActivity(i);
            }
        });


    }
}
