package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_tenb extends AppCompatActivity {

    ListView listv;

    String[] boooks = { "English" , "Maths-1" , "Maths-2" , "Science-1" , "Science-2" , "History" , "Marathi" , "Hindi" , "History & Polotics"  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenb);

        listv = findViewById(R.id.listv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( Activity_tenb.this , android.R.layout.simple_dropdown_item_1line , boooks );
        listv.setAdapter(adapter);

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Activity_tenb.this, "Clicked" + boooks[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}