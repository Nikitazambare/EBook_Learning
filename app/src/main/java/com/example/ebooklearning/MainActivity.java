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

import com.google.firebase.database.FirebaseDatabase;

import java.security.PublicKey;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
        EditText Name;
        EditText Email;
        EditText Username;
        EditText Password;
        EditText Repassword;
        TextView textView;
        Button Register;
        Button Login;
        DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = findViewById(R.id.Name);
        Email = findViewById(R.id.Email);
        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Password);
        Repassword = findViewById(R.id.Repassword);
        textView = findViewById(R.id.textView);
        Register = findViewById(R.id.Register);
        Login = findViewById(R.id.Login);
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
                    FirebaseDatabase.getInstance().getReference().child("Students").child(user).push().setValue(m);
                }
            }
        });


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_Login.class) ;
                startActivity(intent);
            }
        });
    }
}