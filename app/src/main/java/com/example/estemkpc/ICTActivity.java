package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ICTActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView codeorg,websitecard,androidcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ictactivity);
        codeorg = findViewById(R.id.codeorg);
        websitecard = findViewById(R.id.websitecard);
        androidcard = findViewById(R.id.androidcard);
        codeorg.setOnClickListener(this);
        websitecard.setOnClickListener(this);
        androidcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.codeorg:
                i= new Intent(this,CodeorgActivity.class);
                startActivity(i);
                break;
            case R.id.websitecard:
                i= new Intent(this,CodeorgActivity.class);
                startActivity(i);
                break;
            case R.id.androidcard:
                i= new Intent(this,CodeorgActivity.class);
                startActivity(i);
                break;

        }
    }
}