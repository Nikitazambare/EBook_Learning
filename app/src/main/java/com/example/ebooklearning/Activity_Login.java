package com.example.ebooklearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.sql.DatabaseMetaData;

public class Activity_Login extends AppCompatActivity {
    TextInputEditText User, Pass;
    TextView loginRedirect;
    Button Login;
    DBHelper DB;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User = findViewById(R.id.userNameLogin);
        Pass = findViewById(R.id.passwordLogin);
        Login = findViewById(R.id.Loginbutton);
        DB = new DBHelper( this);
        auth = FirebaseAuth.getInstance();
        loginRedirect = findViewById(R.id.signup_text);

        loginRedirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Login.this, MainActivity.class);
                startActivity(intent);
            }
        });


//Turn On after testing
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String userEnteredUsername = User.getText().toString();
//                String userEnteredPassword = Pass.getText().toString();
//
//                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Students");
//                Query checkUser = reference.orderByChild("User").equalTo(userEnteredUsername);
//                checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        if(snapshot.exists()) {
//                            String passwordFromDb = snapshot.child(userEnteredUsername).child("Password").getValue(String.class);
//                            if(passwordFromDb.equals(userEnteredPassword)) {
//                                Intent intent = new Intent( Activity_Login.this , Activity_Medium.class);
//                                startActivity(intent);
//                            }
//                            else {
//                                User.setError("Wrong Password");
//                                User.requestFocus();
//                            }
//                        }
//                        else {
//                            User.setError("NO such User exist");
//                            User.requestFocus();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
//
//            }
//
//        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Login.this, Activity_Medium.class);
                startActivity(intent);

            }
        });


    }
}