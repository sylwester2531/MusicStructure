package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admin on 2017-07-02.
 */

public class MusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        TextView one = (TextView) findViewById(R.id.ones);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(MusicActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });


        Button button = (Button) findViewById(R.id.playlist_add);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(MusicActivity.this, ListActivity.class);
                startActivity(intentStart);
            }
        });
        TextView two = (TextView) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(MusicActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });


        Button button1 = (Button) findViewById(R.id.playlist_add2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(MusicActivity.this, ListActivity.class);
                startActivity(intentStart);
            }
        });
    }


}
