package com.example.rekentuin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class tafelsoefenen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tafelsoefenen);

        final ImageView bDash = (ImageView) findViewById(R.id.bDash4);
        bDash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bDash4();
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        int num = Integer.parseInt(message);

        String r = "";
        for (int i = 1;i < 11; i++) {
            int result = (num * i);
            r+= i + " x " + num + " = " + result + "\n";
            TextView textViewTafel = (TextView)findViewById(R.id.tafelview);
            textViewTafel.setText(r);
        }
    }
    public void bDash4() {
        Intent action = new Intent(tafelsoefenen.this, Oefenen.class);
        startActivity(action);
    }
}
