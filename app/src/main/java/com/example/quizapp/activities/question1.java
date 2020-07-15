package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question1 extends AppCompatActivity {

    RadioGroup radiogbq1;
    Button buttonq1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        radiogbq1 = findViewById(R.id.RG_q1);
        buttonq1 = findViewById(R.id.button_id_q1);


        buttonq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radiogbq1.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question1.this, "choose the right answer", Toast.LENGTH_SHORT).show();

                } else {


                    int score = 0;
                    Intent intent = new Intent(question1.this, question2.class);

                    if (radiogbq1.getCheckedRadioButtonId() == R.id.RB_q1_ch1) {


                        score++;
                    }


                    intent.putExtra("score", score);

                    startActivity(intent);
                }


            }
        });


    }
}
