package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question5 extends AppCompatActivity {
    RadioGroup radiogroup5;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        radiogroup5 = findViewById(R.id.RG_q5);
        button5 = findViewById(R.id.button_id_q5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radiogroup5.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question5.this, "choose the right answer", Toast.LENGTH_SHORT).show();


                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radiogroup5.getCheckedRadioButtonId() == R.id.RB_q5_ch2) {

                        score++;

                    }

                    Intent intent = new Intent(question5.this, question6.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }
            }
        });
    }
}
