package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class CheExpirementVideo extends AppCompatActivity {
    public CardView oxygen;
    VideoView mathvdoG9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_che_expirement_vid);
        oxygen=findViewById(R.id.oxygen);
        MediaController mediaController = new MediaController(this);
        mathvdoG9 = findViewById(R.id.mathvdoG9);
        mathvdoG9.setMediaController(mediaController);
        mediaController.setAnchorView(mathvdoG9);

        oxygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/e-stem-5515d.appspot.com/o/O2expirement.mp4?alt=media&token=e14f4913-b08b-46a9-bc15-bd056937ad6b"); //put video
                mathvdoG9.setVideoURI(uri);
                mathvdoG9.start();

            }
        });
    }
}