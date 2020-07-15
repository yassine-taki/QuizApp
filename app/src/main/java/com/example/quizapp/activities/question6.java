package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question6 extends AppCompatActivity {

    RadioGroup radiogroup6;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        radiogroup6 = findViewById(R.id.RG_q6);
        button6 = findViewById(R.id.button_id_q6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radiogroup6.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(question6.this, "choose the right answer", Toast.LENGTH_SHORT).show();
                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radiogroup6.getCheckedRadioButtonId() == R.id.RB_q6_ch2) {

                        score++;

                    }

                    Intent intent = new Intent(question6.this, question7.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }

            }
        });


    }
}
