package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SoftskillActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cardlearnproject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softskill);
        cardlearnproject = findViewById(R.id.cardlearnproject);

        cardlearnproject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardlearnproject:
                i = new Intent(this,Learnaboutproject.class);
                startActivity(i);
                break;

        }
    }}