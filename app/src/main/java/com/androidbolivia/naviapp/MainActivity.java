package com.androidbolivia.naviapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

    }
    public void listaRegalos(View view){
        Intent intent = new Intent(
                getApplicationContext(),
                RegalosActivity.class
        );
        startActivity(intent);
    }
    public void canciones(View view){
        Intent intent = new Intent(
                getApplicationContext(),
                CancionesActivity.class
        );
        startActivity(intent);
    }



}
