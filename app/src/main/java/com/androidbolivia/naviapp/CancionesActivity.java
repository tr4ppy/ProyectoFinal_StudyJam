package com.androidbolivia.naviapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CancionesActivity extends AppCompatActivity {

    private Button btnPlay1;
    private Button btnPause1;
    private Button btnStop1;
    private Button btnPlay2;
    private Button btnPause2;
    private Button btnStop2;
    private Button btnPlay3;
    private Button btnPause3;
    private Button btnStop3;
    private Button btnPlay4;
    private Button btnPause4;
    private Button btnStop4;
    private Button btnPlay5;
    private Button btnPause5;
    private Button btnStop5;
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    private MediaPlayer mediaPlayer4;
    private MediaPlayer mediaPlayer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canciones);

        btnPlay1=(Button)findViewById(R.id.btnPlay1);
        btnPause1=(Button)findViewById(R.id.btnPause1);
        btnStop1=(Button)findViewById(R.id.btnStop1);
        btnPlay2=(Button)findViewById(R.id.btnPlay2);
        btnPause2=(Button)findViewById(R.id.btnPause2);
        btnStop2=(Button)findViewById(R.id.btnStop2);
        btnPlay3=(Button)findViewById(R.id.btnPlay3);
        btnPause3=(Button)findViewById(R.id.btnPause3);
        btnStop3=(Button)findViewById(R.id.btnStop3);
        btnPlay4=(Button)findViewById(R.id.btnPlay4);
        btnPause4=(Button)findViewById(R.id.btnPause4);
        btnStop4=(Button)findViewById(R.id.btnStop4);
        btnPlay5=(Button)findViewById(R.id.btnPlay5);
        btnPause5=(Button)findViewById(R.id.btnPause5);
        btnStop5=(Button)findViewById(R.id.btnStop5);
        initUI();
        initMediaPlayer();
    }
    public void initMediaPlayer(){
        mediaPlayer1=MediaPlayer.create(getApplicationContext(),R.raw.campanas_de_belen);
        mediaPlayer2=MediaPlayer.create(getApplicationContext(),R.raw.feliz_navidad);
        mediaPlayer3=MediaPlayer.create(getApplicationContext(),R.raw.jingle_bells);
        mediaPlayer4=MediaPlayer.create(getApplicationContext(),R.raw.santa_claus_llega_a_la_ciudad);
        mediaPlayer5=MediaPlayer.create(getApplicationContext(),R.raw.mi_burrito_sabanero);
    }
    public void initUI(){
        btnPlay1.setEnabled(true);
        btnPause1.setEnabled(false);
        btnStop1.setEnabled(false);
        btnPlay2.setEnabled(true);
        btnPause2.setEnabled(false);
        btnStop2.setEnabled(false);
        btnPlay3.setEnabled(true);
        btnPause3.setEnabled(false);
        btnStop3.setEnabled(false);
        btnPlay4.setEnabled(true);
        btnPause4.setEnabled(false);
        btnStop4.setEnabled(false);
        btnPlay5.setEnabled(true);
        btnPause5.setEnabled(false);
        btnStop5.setEnabled(false);
    }
    public void play1(View view){
        stop2(view);
        stop3(view);
        stop4(view);
        stop5(view);
        try{
            mediaPlayer1.start();
            btnPause1.setEnabled(true);
            btnStop1.setEnabled(true);
            btnPlay1.setEnabled(false);
        }catch (IllegalStateException e){
            Log.i("MediaPlayer","Error: "+e.getMessage());
        }
    }
    public void pause1(View view){
        if (mediaPlayer1.isPlaying()){
            mediaPlayer1.pause();
            btnPlay1.setEnabled(true);
            btnPause1.setEnabled(false);
            btnStop1.setEnabled(false);
        }
    }
    public void stop1(View view){
        if(mediaPlayer1.isPlaying()){
            mediaPlayer1.stop();
            mediaPlayer1.release();
            initMediaPlayer();
            btnPlay1.setEnabled(true);
            btnStop1.setEnabled(false);
            btnPause1.setEnabled(false);
        }
    }
    public void play2(View view){
        stop1(view);
        stop3(view);
        stop4(view);
        stop5(view);
        try{
            mediaPlayer2.start();
            btnPause2.setEnabled(true);
            btnStop2.setEnabled(true);
            btnPlay2.setEnabled(false);
        }catch (IllegalStateException e){
            Log.i("MediaPlayer","Error: "+e.getMessage());
        }
    }
    public void pause2(View view){
        if (mediaPlayer2.isPlaying()){
            mediaPlayer2.pause();
            btnPlay2.setEnabled(true);
            btnPause2.setEnabled(false);
            btnStop2.setEnabled(false);
        }
    }
    public void stop2(View view){
        if(mediaPlayer2.isPlaying()){
            mediaPlayer2.stop();
            mediaPlayer2.release();
            initMediaPlayer();
            btnPlay2.setEnabled(true);
            btnStop2.setEnabled(false);
            btnPause2.setEnabled(false);
        }
    }
    public void play3(View view){
        stop1(view);
        stop2(view);
        stop4(view);
        stop5(view);
        try{
            mediaPlayer3.start();
            btnPause3.setEnabled(true);
            btnStop3.setEnabled(true);
            btnPlay3.setEnabled(false);
        }catch (IllegalStateException e){
            Log.i("MediaPlayer","Error: "+e.getMessage());
        }
    }
    public void pause3(View view){
        if (mediaPlayer3.isPlaying()){
            mediaPlayer3.pause();
            btnPlay3.setEnabled(true);
            btnPause3.setEnabled(false);
            btnStop3.setEnabled(false);
        }
    }
    public void stop3(View view){
        if(mediaPlayer3.isPlaying()){
            mediaPlayer3.stop();
            mediaPlayer3.release();
            initMediaPlayer();
            btnPlay3.setEnabled(true);
            btnStop3.setEnabled(false);
            btnPause3.setEnabled(false);
        }
    }
    public void play4(View view){
        stop1(view);
        stop2(view);
        stop3(view);
        stop5(view);
        try{
            mediaPlayer4.start();
            btnPause4.setEnabled(true);
            btnStop4.setEnabled(true);
            btnPlay4.setEnabled(false);
        }catch (IllegalStateException e){
            Log.i("MediaPlayer","Error: "+e.getMessage());
        }
    }
    public void pause4(View view){
        if (mediaPlayer4.isPlaying()){
            mediaPlayer4.pause();
            btnPlay4.setEnabled(true);
            btnPause4.setEnabled(false);
            btnStop4.setEnabled(false);
        }
    }
    public void stop4(View view){
        if(mediaPlayer4.isPlaying()){
            mediaPlayer4.stop();
            mediaPlayer4.release();
            initMediaPlayer();
            btnPlay4.setEnabled(true);
            btnStop4.setEnabled(false);
            btnPause4.setEnabled(false);
        }
    }
    public void play5(View view){
        stop1(view);
        stop2(view);
        stop3(view);
        stop4(view);
        try{
            mediaPlayer5.start();
            btnPause5.setEnabled(true);
            btnStop5.setEnabled(true);
            btnPlay5.setEnabled(false);
        }catch (IllegalStateException e){
            Log.i("MediaPlayer","Error: "+e.getMessage());
        }
    }
    public void pause5(View view){
        if (mediaPlayer5.isPlaying()){
            mediaPlayer5.pause();
            btnPlay5.setEnabled(true);
            btnPause5.setEnabled(false);
            btnStop5.setEnabled(false);
        }
    }
    public void stop5(View view){
        if(mediaPlayer5.isPlaying()){
            mediaPlayer5.stop();
            mediaPlayer5.release();
            initMediaPlayer();
            btnPlay5.setEnabled(true);
            btnStop5.setEnabled(false);
            btnPause5.setEnabled(false);
        }
    }
}
