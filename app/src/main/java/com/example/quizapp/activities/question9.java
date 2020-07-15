package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question9 extends AppCompatActivity {

    RadioGroup radioGroup9;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);

        radioGroup9 = findViewById(R.id.RG_q9);
        button9 = findViewById(R.id.button_id_q9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup9.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question9.this, "choose the right answer", Toast.LENGTH_SHORT).show();
                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radioGroup9.getCheckedRadioButtonId() == R.id.RB_q9_ch3) {

                        score++;

                    }

                    Intent intent = new Intent(question9.this, question10.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }
            }
        });
    }
}
