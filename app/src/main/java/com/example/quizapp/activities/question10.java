package com.example.quizapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.quizapp.R;

public class question10 extends AppCompatActivity {

    RadioGroup radigroup10;
    Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);

        radigroup10 = findViewById(R.id.RG_q10);

        button10 = findViewById(R.id.button_id_q10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radigroup10.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(question10.this, "choose the right answer", Toast.LENGTH_SHORT).show();
                }else {


                    int score = getIntent().getIntExtra("score", 0);
                    if (radigroup10.getCheckedRadioButtonId() == R.id.RB_q10_ch2) {

                        score++;

                    }

                    Intent intent = new Intent(question10.this, score_activity.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }
            }
        });
    }
}
