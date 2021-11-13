package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReviewlessonActivity extends AppCompatActivity implements View.OnClickListener{
    CardView cardqoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviewlesson);
        cardqoat = findViewById(R.id.cardqoat);
        cardqoat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardqoat:
                i= new Intent(this,QuoatActivity.class);
                startActivity(i);
                break;
    }
}}