package com.ratnasrivastava.timersinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //first approach
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.i("unique7", "tick tick one second passed by");
            }
        };
        handler.postDelayed(runnable, 1000);

        //2nd approach
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                Log.i("unique7", "time left = " + l / 1000);
            }

            @Override
            public void onFinish() {
                Log.i("unique7", "No more countdown is finished");
            }

        }.start();
    }
}