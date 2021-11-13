package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class LessonMathActivity extends AppCompatActivity {
    Button lessonMG9,btnimportantmath;
    PDFView pdfimportantmath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_math);
        lessonMG9 = findViewById(R.id.LsMG9);
        btnimportantmath = findViewById(R.id.btnimportantmath);
        pdfimportantmath = findViewById(R.id.pdfimportantmath);
        lessonMG9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LessonMathActivity.this, MathG9.class);
                startActivity(i);

            }
        });
        btnimportantmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfimportantmath.fromAsset("importantofmath.pdf").load();
            }
        });
    }
}