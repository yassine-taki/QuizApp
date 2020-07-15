package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question7 extends AppCompatActivity {
    RadioGroup radioGroup7;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        radioGroup7 = findViewById(R.id.RG_q7);
        button7 = findViewById(R.id.button_id_q7);


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioGroup7.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(question7.this, "choose the right answer", Toast.LENGTH_SHORT).show();
                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radioGroup7.getCheckedRadioButtonId() == R.id.RB_q7_ch2) {

                        score++;

                    }

                    Intent intent = new Intent(question7.this, question8.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }

            }
        });

    }
}
