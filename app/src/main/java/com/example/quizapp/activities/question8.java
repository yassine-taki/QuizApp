package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question8 extends AppCompatActivity {

    RadioGroup radioGroup8;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);

        radioGroup8 = findViewById(R.id.RG_q8);
        button8 = findViewById(R.id.button_id_q8);


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup8.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question8.this, "choose the right answer", Toast.LENGTH_SHORT).show();

                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radioGroup8.getCheckedRadioButtonId() == R.id.RB_q8_ch2) {

                        score++;

                    }

                    Intent intent = new Intent(question8.this, question9.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }
            }
        });
    }
}
