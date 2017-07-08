package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.android.musicappstructure.R.id.back_menu;
import static com.example.android.musicappstructure.R.id.listining_music;
import static com.example.android.musicappstructure.R.id.listsong;
import static com.example.android.musicappstructure.R.id.play2_song;

/**
 * Created by admin on 2017-07-02.
 */

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        Button button_song = (Button) findViewById(listining_music);
        button_song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(InfoActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });
        Button button_menu = (Button) findViewById(back_menu);
        button_menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(InfoActivity.this, StartActivity.class);
                startActivity(intentStart);
            }
        });
    }
}
