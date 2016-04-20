package com.example.memo.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {

            public void onTick(long millesecondsuntildone) {

                // when the counting down counting ( every second )
                Log.i("Seconds Left" , String.valueOf(millesecondsuntildone / 1000));
            }

            public void onFinish() {

                // when the counter is finished
               Log.i("Done", " Count down is finished");
            }
        }.start();


    }

        /*final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // Insert code to be run every second

                Log.i("Runnable has run", "Running");

                handler.postDelayed(this , 1000);

            }
        };
              handler.post(run);



    }
    */



}
