package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity {
    Button Play;
    YouTubePlayerView video;
    YouTubePlayer.OnInitializedListener iniciar;
    private static final String TAG="VideoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG,"onCreate: Starting.");
        Play= findViewById(R.id.btnPlay);
        video=findViewById(R.id.Video);

        iniciar=new  YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onClick: Done initializing.");
                youTubePlayer.loadVideo("-yDj2KE7c0U");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG,"onClick: Failed to initializing.");
            }
        };
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"OnClick: Initializing Youtube Player.");
                video.initialize("AIzaSyBTfJGBQxUp2hSwgpZHz9Mm6GK-weYYAo0", iniciar);

            }
        });

    }

    public void regresar(View view){
        finish( );
    }

}
