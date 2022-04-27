package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_Standard extends AppCompatActivity {

    ImageButton Eight;
    ImageButton Nine;
    ImageButton Ten;

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
                Intent intent = new Intent(Activity_Standard.this , Activity_nineb.class);
                startActivity(intent);
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