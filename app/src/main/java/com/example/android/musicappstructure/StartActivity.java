package com.example.android.musicappstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 2017-07-01.
 */

public class StartActivity extends AppCompatActivity {
     @Override
    protected void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_start);
     }
    public void play(View view) {
        Intent intentStart = new Intent(StartActivity.this, PlayActivity.class );
        startActivity(intentStart);
    }
    public void music(View view) {
        Intent intentStart = new Intent(StartActivity.this, MusicActivity.class );
        startActivity(intentStart);
    }
    public void list(View view) {
        Intent intentStart = new Intent(StartActivity.this, ListActivity.class );
        startActivity(intentStart);
    }
    public void settings(View view) {
        Intent intentStart = new Intent(StartActivity.this, PaymentActivity.class );
        startActivity(intentStart);
    }
}
