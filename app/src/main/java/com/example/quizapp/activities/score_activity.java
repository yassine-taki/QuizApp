package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class score_activity extends AppCompatActivity {

    TextView textscore;
    Button buttondone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_activity);

        textscore = findViewById(R.id.sa_score);
        buttondone = findViewById(R.id.sa_done);

        buttondone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = getIntent().getIntExtra("score", 0);

                textscore.setText("score" + score + "/" + "10");

            }
        });

    }
}
