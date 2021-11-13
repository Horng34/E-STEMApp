package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoMath extends AppCompatActivity {
    VideoView videoView,videoView2;
    Button MG7Btn,MG9Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_math);
        MediaController mediaController = new MediaController(this);
        videoView = findViewById(R.id.mathvdo);
        videoView2 = findViewById(R.id.mathvdo2);
        MG7Btn = findViewById(R.id.MG7);
        MG9Btn = findViewById(R.id.MG9);
        MG7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VideoMath.this, MathG7Activity.class);
                startActivity(i);

            }
        });
        MG9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VideoMath.this, MathG9Activty.class);
                startActivity(i);

            }
        });


        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/Impotant%20of%20math.mp4?alt=media&token=30457707-3f94-4277-96da-8ba464eba293"); //put video
        videoView.setVideoURI(uri);
        videoView.start();

        videoView2.setMediaController(mediaController);
        mediaController.setAnchorView(videoView2);
        Uri uri1 = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/videomathstragy.mp4?alt=media&token=10f0d829-c7ba-433e-9681-34f2eb9a664b"); //put video
        videoView2.setVideoURI(uri1);
        videoView2.start();


    }
}