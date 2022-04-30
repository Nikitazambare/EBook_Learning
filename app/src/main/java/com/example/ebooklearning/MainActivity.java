package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.FirebaseDatabase;

import java.security.PublicKey;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
        TextInputEditText Name, Email,Username,Password,Repassword;
        TextView loginRedirect;
        Button Register;
        Button Login;
        DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Username = findViewById(R.id.userName);
        Password = findViewById(R.id.password);
        loginRedirect = findViewById(R.id.loginRedirect);
        Repassword = findViewById(R.id.repassword);
        Register = findViewById(R.id.Register);
        DB = new DBHelper( this);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String user = Username.getText().toString();
                String pass = Password.getText().toString();
                String Repass = Repassword.getText().toString();

                if (name.equals("") || email.equals("") || user.equals("") || pass.equals("") || Repass.equals(""))
                    Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    HashMap<String,Object> m = new HashMap<>();
                    m.put("Name",name);
                    m.put("Email",email);
                    m.put("Username",user);
                    m.put("Password",pass);
                    try {
                        FirebaseDatabase.getInstance().getReference().child("Students").child(user).push().setValue(m);
                        Intent intent = new Intent(MainActivity.this, Activity_Login.class);
                        startActivity(intent);
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, e.getStackTrace().toString(), Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(MainActivity.this, "Sucess", Toast.LENGTH_SHORT).show();
                }
            }
        });

        loginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Login.class);
                startActivity(intent);
            }
        });


    }
}