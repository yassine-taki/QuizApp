package com.example.quizapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.quizapp.R;

public class question2 extends AppCompatActivity {

    RadioGroup radiogbq2 , radiogroupq2ch2;
    Button buttonq2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        radiogbq2 = findViewById(R.id.RG_q2);
        buttonq2= findViewById(R.id.button_id_q2);
        radiogroupq2ch2 = findViewById(R.id.RG_q2_ch2);

        buttonq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radiogbq2.getCheckedRadioButtonId()==-1 && radiogroupq2ch2.getCheckedRadioButtonId()==-1){

                    Toast.makeText(question2.this,"choose the right answer",Toast.LENGTH_SHORT).show();

                }else {

                    int score= getIntent().getIntExtra("score",0);
                    if (radiogbq2.getCheckedRadioButtonId()==R.id.RB_q2_ch1 && radiogroupq2ch2.getCheckedRadioButtonId()==R.id.RB_q2_ch3){

                        score++;

                    }

                    Intent intent = new Intent(question2.this,question3.class);


                    intent.putExtra("score", score);
                    startActivity(intent);
                }




            }
        });




    }
}
