package com.mahmud.danriyalsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash_Screen extends AppCompatActivity {

    ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(){

            public void run(){
                doWork();
                startApp();
            }
        };
        thread.start();


    }

    public void doWork(){
        for (progress=20; progress<=100; progress=progress+20){
            try {
                Thread.sleep(200);
                progressBar.setProgress(progress);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }

    public void startApp(){

        startActivity(new Intent(Splash_Screen.this, MainActivity.class));
        finish();
    }

}