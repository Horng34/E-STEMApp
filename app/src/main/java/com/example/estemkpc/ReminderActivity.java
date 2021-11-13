package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReminderActivity extends AppCompatActivity implements View.OnClickListener{
    CardView cardrehurse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        cardrehurse = findViewById(R.id.cardrehurse);
        cardrehurse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cardrehurse:
                i= new Intent(this,RehurseActivity.class);
                startActivity(i);
                break;
        }
    }
}