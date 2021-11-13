package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class STEMActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView cardmath,cardscience,cardit,cardenglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stemactivity);
        cardmath = findViewById(R.id.cardmath);
        cardenglish = findViewById(R.id.cardenglish);
        cardit = findViewById(R.id.cardit);
        cardscience = findViewById(R.id.cardscience);

        cardscience.setOnClickListener(this);
        cardit.setOnClickListener(this);
        cardmath.setOnClickListener(this);
        cardenglish.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.cardmath:
                i= new Intent(this,MathActivity.class);
                startActivity(i);
                break;
            case R.id.cardit:
                i= new Intent(this,ICTActivity.class);
                startActivity(i);
                break;
            case R.id.cardscience:
                i= new Intent(this,ScienceActivity.class);
                startActivity(i);
                break;
            case R.id.cardenglish:
                i= new Intent(this,EnglishActivity.class);
                startActivity(i);
                break;
    }
}}