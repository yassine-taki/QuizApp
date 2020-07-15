package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class question4 extends AppCompatActivity {

    RadioGroup radioGroup4;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        radioGroup4 = findViewById(R.id.RG_q4);
        button4 = findViewById(R.id.button_id_q4);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioGroup4.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question4.this, "choose the right answer", Toast.LENGTH_SHORT).show();

                } else {

                    int score = getIntent().getIntExtra("score", 0);
                    if (radioGroup4.getCheckedRadioButtonId() == R.id.RB_q4_ch3) {

                        score++;

                    }

                    Intent intent = new Intent(question4.this, question5.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }


            }
        });
    }

}





