package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMap = (Button) findViewById(R.id.btn_Map);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapActivity1.class);
                startActivity(intent);
            }
        });
    }

    public void goCalendar(View view){
        Intent i = new Intent(this, Calendar.class);
        startActivity(i);
    }

    public void goVideo(View view){
        Intent i = new Intent(this, VideoActivity.class);
        startActivity(i);
    }

}

