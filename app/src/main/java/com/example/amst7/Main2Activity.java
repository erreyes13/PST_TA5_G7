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
        simpleVideoView.setVideoURI(Uri.parse("rtsp://r3---sn-q4flrn7k.googlevideo.com/Cj0LENy73wIaNAlp_IXOmeuhUxMYDSANFC1pjDddMOCoAUIASARg-Lbz1qKco-daigELVUtBWVZFUzVKN28M/A74D2CD301A79B78DDDA1D26D132E25ABA7AE9B7.347F99BE3A0238A8655EE16CA83A3B4E329A6896/yt8/1/video.3gp"));
        //simpleVideoView.setVideoPath("https://youtu.be/S-JJkL6Y-8A");
        simpleVideoView.requestFocus();
        simpleVideoView.start();
    }

    public void regresar(View view){
        finish( );
    }
}
