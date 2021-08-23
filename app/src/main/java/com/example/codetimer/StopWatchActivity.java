package com.example.codetimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class StopWatchActivity extends AppCompatActivity {

    Button btnStart, btnStop;
    ImageView ianchor;
    Animation roundingalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        ianchor = findViewById(R.id.icanchor);

        btnStop.setAlpha(0);

        roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone );

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ianchor.startAnimation(roundingalone);
                btnStop.animate().alpha(1).setDuration(300).start();
                btnStart.animate().alpha(0).start();
            }
        });
    }
}