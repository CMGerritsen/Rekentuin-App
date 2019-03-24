package com.example.rekentuin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class toetsen11tm20 extends AppCompatActivity {

    public static final int REQUEST_BUTTON_11 = 11;
    public static final int REQUEST_BUTTON_12 = 12;
    public static final int REQUEST_BUTTON_13 = 13;
    public static final int REQUEST_BUTTON_14 = 14;
    public static final int REQUEST_BUTTON_15 = 15;
    public static final int REQUEST_BUTTON_16 = 16;
    public static final int REQUEST_BUTTON_17 = 17;
    public static final int REQUEST_BUTTON_18 = 18;
    public static final int REQUEST_BUTTON_19 = 19;
    public static final int REQUEST_BUTTON_20 = 20;

    private static String MY_PREFS_NAME2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_toetsen11tm20);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME2, MODE_PRIVATE);
        if (prefs.contains("tafel")) {

            if (prefs.contains("tafel11")) {
                String getTafel = prefs.getString("tafel11", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 11) {
                    Button button11 = (Button) findViewById(R.id.button11t);
                    button11.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel12")) {
                String getTafel = prefs.getString("tafel12", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 12) {
                    Button button12 = (Button) findViewById(R.id.button12t);
                    button12.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel13")) {
                String getTafel = prefs.getString("tafel13", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 13) {
                    Button button13 = (Button) findViewById(R.id.button13t);
                    button13.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel14")) {
                String getTafel = prefs.getString("tafel14", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 14) {
                    Button button14 = (Button) findViewById(R.id.buttont14t);
                    button14.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel15")) {
                String getTafel = prefs.getString("tafel15", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 15) {
                    Button button15 = (Button) findViewById(R.id.buttont15t);
                    button15.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel16")) {
                String getTafel = prefs.getString("tafel16", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 16) {
                    Button button11 = (Button) findViewById(R.id.buttont16t);
                    button11.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel17")) {
                String getTafel = prefs.getString("tafel17", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 17) {
                    Button button17 = (Button) findViewById(R.id.buttont17t);
                    button17.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel18")) {
                String getTafel = prefs.getString("tafel18", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 18) {
                    Button button18 = (Button) findViewById(R.id.buttont18t);
                    button18.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel19")) {
                String getTafel = prefs.getString("tafel19", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 19) {
                    Button button19 = (Button) findViewById(R.id.buttont19t);
                    button19.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel20")) {
                String getTafel = prefs.getString("tafel20", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 20) {
                    Button button20 = (Button) findViewById(R.id.buttont20t);
                    button20.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }
        }

        final ImageView bDash = (ImageView) findViewById(R.id.bDash7);
        bDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bDash7();
            }
        });

        Button button11 = (Button)findViewById(R.id.button11t);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "11");
                startActivityForResult(intent, REQUEST_BUTTON_11);
            }
        });

        Button button12 = (Button)findViewById(R.id.button12t);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "12");
                startActivityForResult(intent, REQUEST_BUTTON_12);
            }
        });

        Button button13 = (Button)findViewById(R.id.button13t);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "13");
                startActivityForResult(intent, REQUEST_BUTTON_13);
            }
        });

        Button button14 = (Button)findViewById(R.id.buttont14t);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "14");
                startActivityForResult(intent, REQUEST_BUTTON_14);
            }
        });

        Button button15 = (Button)findViewById(R.id.buttont15t);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "15");
                startActivityForResult(intent, REQUEST_BUTTON_15);
            }
        });

        Button button16 = (Button)findViewById(R.id.buttont16t);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "16");
                startActivityForResult(intent, REQUEST_BUTTON_16);
            }
        });

        Button button17 = (Button)findViewById(R.id.buttont17t);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "17");
                startActivityForResult(intent, REQUEST_BUTTON_17);
            }
        });

        Button button18 = (Button)findViewById(R.id.buttont18t);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "18");
                startActivityForResult(intent, REQUEST_BUTTON_18);
            }
        });

        Button button19 = (Button)findViewById(R.id.buttont19t);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "19");
                startActivityForResult(intent, REQUEST_BUTTON_19);
            }
        });

        Button button20 = (Button)findViewById(R.id.buttont20t);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toetsen11tm20.this, tafeltoetsen11tm20.class);
                intent.putExtra("message", "20");
                startActivityForResult(intent, REQUEST_BUTTON_20);
            }
        });
    }
    public void bDash7() {
        Intent action = new Intent(this, Toetsen.class);
        startActivity(action);
    }
}
