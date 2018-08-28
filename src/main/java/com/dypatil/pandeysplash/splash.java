package com.dypatil.pandeysplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.imageView);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.transition);
        imageView.startAnimation(anim);
        final Intent intent = new Intent(this, MainActivity.class);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}
