package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScienceActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cardphysic ,cardchemistry,cardbiology,cardearth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        cardphysic = findViewById(R.id.cardphysic);
        cardbiology = findViewById(R.id.cardbiology);
        cardchemistry= findViewById(R.id.cardchemistry);
        cardearth = findViewById(R.id.cardearth);

        cardearth.setOnClickListener(this);
        cardchemistry.setOnClickListener(this);
        cardbiology.setOnClickListener(this);
        cardphysic.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardphysic:
                i= new Intent(this,MathActivity.class);
                startActivity(i);
                break;
            case R.id.cardchemistry:
                i= new Intent(this,Chemistry.class);
                startActivity(i);
                break;
            case R.id.cardbiology:
                i= new Intent(this,ScienceActivity.class);
                startActivity(i);
                break;
            case R.id.cardearth:
                i= new Intent(this,EnglishActivity.class);
                startActivity(i);
                break;
        }
    }
}