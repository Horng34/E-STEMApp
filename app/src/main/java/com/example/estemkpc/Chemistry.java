package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chemistry extends AppCompatActivity  implements View.OnClickListener{
    public CardView videch,chexpivideo,chexpirementfile,quizch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        videch = findViewById(R.id.videch);
        chexpivideo = findViewById(R.id.chexpivideo);
        chexpirementfile = findViewById(R.id.chexpirementfile);
        quizch = findViewById(R.id.quizch);


        videch.setOnClickListener(this);
        chexpirementfile.setOnClickListener(this);
        chexpivideo.setOnClickListener(this);
        quizch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.videch:
                i= new Intent(this,VideoLessonCh.class);
                startActivity(i);
                break;
            case R.id.chexpirementfile:
                i= new Intent(this,ChemistrylessonvideoG9.class);
                startActivity(i);
                break;
            case R.id.chexpivideo:
                i= new Intent(this,CheExpirementVideo.class);
                startActivity(i);
                break;
            case R.id.quizch:
                i= new Intent(this,ChemistryG9Quiz.class);
                startActivity(i);
                break;

    }}
}