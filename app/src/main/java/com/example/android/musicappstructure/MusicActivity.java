package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 2017-07-02.
 */

public class MusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }
    public void playlist(View view) {
        Intent intentStart = new Intent(MusicActivity.this, ListActivity.class );
        startActivity(intentStart);
    }
    public void playthis(View view) {
        Intent intentStart = new Intent(MusicActivity.this, PlayActivity.class );
        startActivity(intentStart);
    }
}
