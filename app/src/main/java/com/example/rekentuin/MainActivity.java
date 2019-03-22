package com.example.rekentuin;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ImageView letter1 = (ImageView) findViewById(R.id.letter1);
        letter1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                oefenen();
            }
        });

        ImageView x = (ImageView) findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toetsen();
            }
        });

    }

    public void oefenen() {
        Intent action = new Intent(MainActivity.this, Oefenen.class);
        startActivity(action);
    }

    public void toetsen() {
        Intent action = new Intent(MainActivity.this, Toetsen.class);
        startActivity(action);
    }
}
