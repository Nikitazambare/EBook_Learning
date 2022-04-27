package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_Eightb extends AppCompatActivity {

    ListView List;

    String[] Books = { "Civics" ,  "Geography" , "History" , "Maths" , "Science" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightb);

        List = findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( Activity_Eightb.this , android.R.layout.simple_dropdown_item_1line, Books );
        List.setAdapter(adapter);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Activity_Eightb.this, "Clicked" + Books[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}