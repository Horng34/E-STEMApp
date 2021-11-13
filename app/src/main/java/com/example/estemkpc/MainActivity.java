package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cardstem,cardsoftskill,cardreview,cardreminder,cardattendence,cardshare;
    ImageView imgsetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardstem = findViewById(R.id.cardstem);
        cardsoftskill = findViewById(R.id.cardsoftskill);
        cardreview = findViewById(R.id.cardreview);
        cardreminder = findViewById(R.id.cardreminder);
        cardattendence = findViewById(R.id.cardattendence);
        cardshare = findViewById(R.id.cardshare);
        imgsetting = findViewById(R.id.imgsetting);


        cardstem.setOnClickListener(this);
        cardshare.setOnClickListener(this);
        cardattendence.setOnClickListener(this);
        cardreminder.setOnClickListener(this);
        cardreview.setOnClickListener(this);
        cardsoftskill.setOnClickListener(this);


        imgsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardstem:
                i= new Intent(this,STEMActivity.class);
                startActivity(i);
                break;
            case R.id.cardsoftskill:
                i= new Intent(this,LearnProject.class);
                startActivity(i);
                break;
            case R.id.cardreview:
                i= new Intent(this,ReminderActivity.class);
                startActivity(i);
                break;
            case R.id.cardreminder:
                i= new Intent(this,ReviewlessonActivity.class);
                startActivity(i);
                break;
            case R.id.cardattendence:
                i= new Intent(this,AttendenceActivity.class);
                startActivity(i);
                break;
            case R.id.cardshare:
                i= new Intent(this,ShareActivity.class);
                startActivity(i);
                break;


        }
    }

}