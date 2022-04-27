package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_standard3 extends AppCompatActivity {

    ImageButton ninee;
    ImageButton tenn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard3);

        ninee = findViewById(R.id.ninee);
        tenn = findViewById(R.id.tenn);

        ninee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Activity_standard3.this , Activity_nineeboo.class );
                startActivity(intent);

            }
        });

        tenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Activity_standard3.this , Activity_tennboo.class);
                startActivity(intent);

            }
        });
    }
}