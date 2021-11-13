package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoLessonCh extends AppCompatActivity {
    VideoView videoView;
    Button MG7Btn,MG9Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_lesson_ch);
        MediaController mediaController = new MediaController(this);
        videoView = findViewById(R.id.mathvdo);

        MG7Btn = findViewById(R.id.MG7);
        MG9Btn = findViewById(R.id.MG9);
        MG7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VideoLessonCh.this, MathG7Activity.class);
                startActivity(i);

            }
        });
        MG9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VideoLessonCh.this, ChemistrylessonvideoG9.class);
                startActivity(i);

            }
        });
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Importantofch.mp4?alt=media&token=f9a97afa-dc18-46e8-ba09-c132530ad5dd"); //put video
        videoView.setVideoURI(uri);
        videoView.start();



    }
}