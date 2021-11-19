package com.example.androidmatjar.aeleyn.com;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        TextView appNameTextView = findViewById(R.id.activity_splash_app_description_name);

        Animation animationBottom = AnimationUtils.loadAnimation(this, R.anim.animation_bottom);
        appNameTextView.setAnimation(animationBottom);

        int SPLASH_SCREEN = 2000;
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
}