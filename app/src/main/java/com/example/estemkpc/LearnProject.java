package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class LearnProject extends AppCompatActivity {
    public CardView plan;
    VideoView mathvdoG9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_project);
        plan=findViewById(R.id.plan);
        mathvdoG9 = findViewById(R.id.mathvdoG9);
        MediaController mediaController = new MediaController(this);
        mathvdoG9.setMediaController(mediaController);
        mediaController.setAnchorView(mathvdoG9);

        plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Untitled%20Project.mp4?alt=media&token=8ef1ed83-922e-4046-a72e-c2321e4ccc8e"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });

    }
}