package com.example.nutracycle;

import java.util.ArrayList;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivityIE extends AppCompatActivity {

    Button button;
    Animation rotateAnimation;
    ImageView imageView;
    ArrayList <String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ie);
        imageView = (ImageView) findViewById(R.id.imageView3);

        final TextView txtview = (TextView) findViewById(R.id.textView2);
        txtview.setText("Sloppy Seconds");
        txtview.startAnimation(AnimationUtils.loadAnimation(MainActivityIE.this, android.R.anim.slide_in_left));
        txtview.startAnimation(AnimationUtils.loadAnimation(MainActivityIE.this, android.R.anim.slide_out_right));
        txtview.startAnimation(AnimationUtils.loadAnimation(MainActivityIE.this, android.R.anim.slide_out_right));
        txtview.startAnimation(AnimationUtils.loadAnimation(MainActivityIE.this, android.R.anim.slide_in_left));

        rotateAnimation();

    }

    private void rotateAnimation() {
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageView.startAnimation(rotateAnimation);

    }



    private void printEntireList(){


    }

}



