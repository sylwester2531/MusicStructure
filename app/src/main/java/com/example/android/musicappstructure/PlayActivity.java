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

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        Button button = (Button) findViewById(R.id.menu);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(PlayActivity.this, StartActivity.class);
                startActivity(intentStart);
            }
        });
        Button button2 = (Button) findViewById(R.id.list);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(PlayActivity.this, ListActivity.class);
                startActivity(intentStart);
            }
        });
        Button button3 = (Button) findViewById(R.id.exit);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(PlayActivity.this, StartActivity.class);
                startActivity(intentStart);
            }
        });
        TextView button4 = (TextView) findViewById(R.id.listsong);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentStart = new Intent(PlayActivity.this, ListActivity.class);
                startActivity(intentStart);
            }
        });
    }

}
