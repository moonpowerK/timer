package com.hanbit.timer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btStart, btStop, btReset;
    Chronometer Timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStart = (Button) findViewById(R.id.btStart);
        btStop = (Button) findViewById(R.id.btStop);
        btReset = (Button) findViewById(R.id.btReset);
        Timer = (Chronometer) findViewById(R.id.chronometer1);

        btStart.setOnClickListener(this);
        btStop.setOnClickListener(this);
        btReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btStart :
                Timer.start();

                break;
            case R.id.btStop :
                Timer.stop();
                break;
            case R.id.btReset :
                Timer.setBase(SystemClock.elapsedRealtime());
                Timer.stop();
                break;
        }

    }
}
