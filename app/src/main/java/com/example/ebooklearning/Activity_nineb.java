package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_nineb extends AppCompatActivity {

    ListView list;

    String[] books = { "English" , "Maths-1" , "Maths-2" , "Science & Technology" , "History" , "Marathi", "Hindi" , "History & Polotics"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineb);

        list = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( Activity_nineb.this , android.R.layout.simple_dropdown_item_1line , books );
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Activity_nineb.this, "Clicked" +  books[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}