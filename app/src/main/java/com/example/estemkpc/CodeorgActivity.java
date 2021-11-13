package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class CodeorgActivity extends AppCompatActivity {
    public CardView AngryBirds,importantofcode;
    VideoView mathvdoG9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeorg);
        AngryBirds=findViewById(R.id.AngryBirds);
        MediaController mediaController = new MediaController(this);
        mathvdoG9 = findViewById(R.id.mathvdoG9);
        importantofcode = findViewById(R.id.importantofcode);
        mathvdoG9.setMediaController(mediaController);
        mediaController.setAnchorView(mathvdoG9);

        AngryBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Sequencing-Lesson1.mp4?alt=media&token=00ada842-6eae-444b-9d3d-8d62ebe397ba"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });

        importantofcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Intro-to-Code.org.mp4?alt=media&token=b0885958-9791-4caa-9cb6-0c8845052d15"); //put video
                mathvdoG9.setVideoURI(uri);
               mathvdoG9.start();

            }
        });
    }
}