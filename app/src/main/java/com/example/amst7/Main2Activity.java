package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView simpleVideoView = findViewById(R .id.videoView);
        MediaController controller=new MediaController(this);
        simpleVideoView.setMediaController(controller);
        controller.setAnchorView(simpleVideoView);
        simpleVideoView.setVideoURI(Uri.parse("http://techslides.com/demos/sample-videos/small.mp4"));
        //simpleVideoView.setVideoPath("https://youtu.be/S-JJkL6Y-8A");
        simpleVideoView.requestFocus();
        simpleVideoView.start();
    }

    public void regresar(View view){
        finish( );
    }
}
