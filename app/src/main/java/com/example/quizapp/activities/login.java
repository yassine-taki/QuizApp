package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {


    EditText editTextmail;
    EditText PasswordMail;
    Button buttonSignIn;
    TextView registerText;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextmail = findViewById(R.id.email_id);
        PasswordMail = findViewById(R.id.password_id);
        buttonSignIn = findViewById(R.id.button_id);
        registerText = findViewById(R.id.regiter_id);
        firebaseAuth = FirebaseAuth.getInstance();


        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextmail.getText().toString();
                String Password = PasswordMail.getText().toString();

                if (TextUtils.isEmpty(email)) {

                    Toast.makeText(login.this, "Login Is Empty", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(Password)) {

                    Toast.makeText(login.this, "Password Is Empty", Toast.LENGTH_LONG).show();
                } else {

                    firebaseAuth.signInWithEmailAndPassword(email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {

                                Toast.makeText(getApplicationContext(), "logged in successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(), question1.class));

                            } else {

                                Toast.makeText(getApplicationContext(), "error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }

                        }
                    });


                }
            }
        });


        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(login.this, Register_activity.class);
                startActivity(intent);

            }
        });

    }
}
