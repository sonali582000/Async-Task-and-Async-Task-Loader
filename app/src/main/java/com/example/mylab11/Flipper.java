package com.example.mylab11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;

public class Flipper extends AppCompatActivity {
Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

            timer=new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent intent=new Intent(Flipper.this,Login.class);
                    startActivity(intent);
                    finish();
                }
            },6000);

    }

}