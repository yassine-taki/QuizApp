package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register_activity extends AppCompatActivity {

    EditText FirstName, LastName, Email, Password;
    Button RegisterButton;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activity);

        FirstName = findViewById(R.id.FirstName_id);
        LastName = findViewById(R.id.LastName_id);
        Email = findViewById(R.id.email_id_register);
        Password = findViewById(R.id.password_id_register);
        RegisterButton = findViewById(R.id.button_register_id);
        firebaseAuth = FirebaseAuth.getInstance();


        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(FirstName.getText().toString())
                        && TextUtils.isEmpty(LastName.getText().toString())
                        && TextUtils.isEmpty(Email.getText().toString())
                        && TextUtils.isEmpty(Password.getText().toString())) {

                    Toast.makeText(Register_activity.this
                            , "fill all the blanks", Toast.LENGTH_SHORT).show();

                } else {

                    String email = Email.getText().toString();
                    String password = Password.getText().toString();

                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {

                                Toast.makeText(Register_activity.this, "User Added", Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(Register_activity.this, login.class));
                            } else {


                                Toast.makeText(Register_activity.this, "Error !", Toast.LENGTH_SHORT).show();
                            }


                        }
                    });


                }
            }
        });


    }
}
