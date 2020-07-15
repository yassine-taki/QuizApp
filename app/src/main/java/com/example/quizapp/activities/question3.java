package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question3 extends AppCompatActivity {

    RadioGroup radioGroupq3;
    Button buttonq3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        radioGroupq3 = findViewById(R.id.RG_q3);
        buttonq3 = findViewById(R.id.button_id_q3);

        buttonq3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioGroupq3.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question3.this, "choose the right answer", Toast.LENGTH_SHORT).show();

                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radioGroupq3.getCheckedRadioButtonId() == R.id.RB_q3_ch4) {

                        score++;

                    }

                    Intent intent = new Intent(question3.this, question4.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }

            }
        });


    }
}
