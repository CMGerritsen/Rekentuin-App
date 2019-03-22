package com.example.rekentuin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class tafelsoefenen11tm20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tafelsoefenen11tm20);

        final ImageView bDash = (ImageView) findViewById(R.id.bDash6);
        bDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bDash6();
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        int num = Integer.parseInt(message);

        String r = "";
        for (int i = 1;i < 11; i++) {
            int result = (num * i);
            r+= i + " x " + num + " = " + result + "\n";
            TextView textViewTafel = (TextView)findViewById(R.id.tafelview2);
            textViewTafel.setText(r);
        }
    }
    public void bDash6() {
        Intent action = new Intent(this, Oefenen11tm20.class);
        startActivity(action);
    }
}
