package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_standard2 extends AppCompatActivity {

    ImageButton nine;
    ImageButton ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard2);

        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Activity_standard2.this , Activity_ninebo.class);
                startActivity(intent);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Activity_standard2.this ,Activity_tenbo.class );
                startActivity(intent);
            }
        });

    }
}