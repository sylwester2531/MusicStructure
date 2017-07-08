package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by admin on 2017-07-02.
 */

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        ImageButton play_song = (ImageButton) findViewById(R.id.play_song);
        play_song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(ListActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });
        ImageButton play2_song = (ImageButton) findViewById(R.id.play2_song);
        play2_song.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(ListActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });
    }


}
