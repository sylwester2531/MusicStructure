package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 2017-07-02.
 */

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);

    }
    public void menu(View view) {
        Intent intentStart = new Intent(PlayActivity.this, StartActivity.class );
        startActivity(intentStart);
    }
    public void playlist(View view) {
        Intent intentStart = new Intent(PlayActivity.this, ListActivity.class );
        startActivity(intentStart);
    }
    public void music(View view) {
        Intent intentStart = new Intent(PlayActivity.this, MusicActivity.class );
        startActivity(intentStart);
    }
    public void listsong(View view) {
        Intent intentStart = new Intent(PlayActivity.this, MusicActivity.class );
        startActivity(intentStart);
    }
}
