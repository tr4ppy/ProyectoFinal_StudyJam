package com.androidbolivia.naviapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity {

    private ImageView ivAndy;
    private ImageView ivFeliz;
    private ImageView ivNavidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splashscreen);

        ivAndy=(ImageView)findViewById(R.id.ivAndy);
        ivFeliz=(ImageView)findViewById(R.id.ivFeliz);
        ivNavidad=(ImageView)findViewById(R.id.ivNavidad);
        Animation der= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveder);
        Animation izq= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveizq);
        Animation fade= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        ivFeliz.startAnimation(der);
        ivNavidad.startAnimation(izq);
        ivAndy.startAnimation(fade);
        fade.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
