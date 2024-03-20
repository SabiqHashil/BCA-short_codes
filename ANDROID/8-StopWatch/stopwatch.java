// Write a Program to display Stop watch

package com.example;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button start, stop, reset;
    TextView tv;

    Handler ch = new Handler();

    long startTime = 0L;
    long timeInMillis = 0L;
    long updatedTime = 0L;
    long timeSwapBuff = 0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.button1);
        stop = (Button) findViewById(R.id.button3);
        reset = (Button) findViewById(R.id.button2);

        tv = (TextView) findViewById(R.id.textView1);

        start.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                startTime = SystemClock.uptimeMillis();
                ch.postDelayed(updateTimerThread, 0);
            }
        });

        reset.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tv.setText("00:00:00");
            }
        });

        stop.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                timeSwapBuff += timeInMillis;
                ch.removeCallbacks(updateTimerThread);
            }
        });
    }

    private Runnable updateTimerThread = new Runnable() {

        @Override
        public void run() {
            timeInMillis = SystemClock.uptimeMillis() - startTime;
            updatedTime = timeSwapBuff + timeInMillis;
            int seconds = (int) (updatedTime / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;
            int milliSeconds = (int) (updatedTime % 1000);
            tv.setText("" + minutes + ":" + String.format("%02d", seconds) + ":" + String.format("%03d", milliSeconds));
            ch.postDelayed(this, 0);
        }
    };

}