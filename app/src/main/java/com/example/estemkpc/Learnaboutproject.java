package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Learnaboutproject extends AppCompatActivity {

    public CardView plan;
    VideoView mathvdoG9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnaboutproject);
        plan=findViewById(R.id.plan);
        mathvdoG9 = findViewById(R.id.mathvdoG9);
        MediaController mediaController = new MediaController(this);
        mathvdoG9.setMediaController(mediaController);
        mediaController.setAnchorView(mathvdoG9);

        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/%E1%9E%82%E1%9E%98%E1%9F%92%E1%9E%9A%E1%9F%84%E1%9E%84.mp4?alt=media&token=c1093e66-0983-4f86-ad7e-70a60bcbf36c"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });


    }
}