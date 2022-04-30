package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Medium extends AppCompatActivity {

    Button English_Medium, Hindi_Medium, Marathi_Medium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        English_Medium = findViewById(R.id.English_Medium);
        Marathi_Medium = findViewById(R.id.Marathi_Medium);
        Hindi_Medium = findViewById(R.id.Hindi_Medium);

        English_Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Medium.this , Activity_Standard.class );
                startActivity(intent);

            }
        });

        Marathi_Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Medium.this , Activity_standard2.class);
                startActivity(intent);
            }
        });

        Hindi_Medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Medium.this , Activity_standard3.class);
                startActivity(intent);
            }
        });

    }
}