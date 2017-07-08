package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by admin on 2017-07-01.
 */

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button button = (Button) findViewById(R.id.play);
        button.setOnClickListener(new View.OnClickListener()
        {

            public void onClick (View v){
                Intent intentStart = new Intent(StartActivity.this, PlayActivity.class);
                startActivity(intentStart);
            }
        });


        Button button1 = (Button) findViewById(R.id.mymusic);
        button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intentStart = new Intent(StartActivity.this, MusicActivity.class);
                startActivity(intentStart);
            }
        });

        Button button2 = (Button) findViewById(R.id.playlist);
        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intentStart = new Intent(StartActivity.this, ListActivity.class);
                startActivity(intentStart);
            }
        });

        Button button3 = (Button) findViewById(R.id.info);
        button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intentStart = new Intent(StartActivity.this, InfoActivity.class);
                startActivity(intentStart);
            }
        });


    }







    public void settings(View view) {
        Intent intentStart = new Intent(StartActivity.this, InfoActivity.class);
        startActivity(intentStart);
    }
}
