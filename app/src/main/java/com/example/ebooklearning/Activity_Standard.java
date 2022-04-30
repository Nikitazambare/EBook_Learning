package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity_Standard extends AppCompatActivity {

   Button Eight, Nine, Ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);

        Eight = findViewById(R.id.Eight);
        Nine = findViewById(R.id.Nine);
        Ten = findViewById(R.id.Ten);

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Activity_Standard.this , Activity_Eightb.class );
                startActivity(intent);
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activity_Standard.this , Activity_nineb.class);
                startActivity(intent1);
            }
        });

        Ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Standard.this , Activity_tenb.class);
                startActivity(intent);
            }
        });

    }
}