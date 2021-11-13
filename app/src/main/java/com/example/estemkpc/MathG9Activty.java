package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MathG9Activty extends AppCompatActivity {
    public CardView Munit1,Munit4;
    VideoView mathvdoG9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_g9_activty);
        //cardView
        Munit1 = findViewById(R.id.Munit1);
        Munit4=findViewById(R.id.Munit4);


        //videoview
        MediaController mediaController = new MediaController(this);
        mathvdoG9 = findViewById(R.id.mathvdoG9);
        mathvdoG9.setMediaController(mediaController);
        mediaController.setAnchorView(mathvdoG9);



        Munit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Unit4.mp4?alt=media&token=c8ae1207-7508-4cd6-9cdf-3ebaf955ee25"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });
        Munit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Unit4.mp4?alt=media&token=c8ae1207-7508-4cd6-9cdf-3ebaf955ee25"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });


    }
}