package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MathActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView cardvideomath,cardlessonmath,cardquizmath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        cardlessonmath = findViewById(R.id.cardlessonmath);
        cardquizmath = findViewById(R.id.quizmath);
        cardvideomath = findViewById(R.id.cardvideomath);


        cardvideomath.setOnClickListener(this);
        cardquizmath.setOnClickListener(this);
        cardlessonmath.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardvideomath:
                i= new Intent(this,VideoMath.class);
                startActivity(i);
                break;
            case R.id.cardlessonmath:
                i= new Intent(this,LessonMathActivity.class);
                startActivity(i);
                break;
            case R.id.quizmath:
                i= new Intent(this, QuizMathActivity.class);
                startActivity(i);
                break;
    }
}}