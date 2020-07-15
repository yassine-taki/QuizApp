package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {
    TextView appname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        appname = findViewById(R.id.app_name);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.myanim);
        appname.setAnimation(anim);

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(3000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(SplashActivity.this,start_Activity.class);
                startActivity(intent);
            }
        }).start();
    }
}
