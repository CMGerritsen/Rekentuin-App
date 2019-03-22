package com.example.rekentuin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class tafeltoetsen11tm20 extends AppCompatActivity {

    private static String MY_PREFS_NAME = "";
    private static String MY_PREFS_NAME2 = "";
    private static String MY_PREFS_NAME3 = "";
    private static String MY_PREFS_NAME4 = "";
    private static String MY_PREFS_NAME5 = "";
    private static String MY_PREFS_NAME6 = "";
    private static String MY_PREFS_NAME7 = "";
    private static String MY_PREFS_NAME8 = "";
    private static String MY_PREFS_NAME9 = "";
    private static String MY_PREFS_NAME10 = "";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tafeltoetsen11tm20);

        final ImageView bDash = (ImageView) findViewById(R.id.bDash8);
        bDash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bDash8();
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        final int num = Integer.parseInt(message);
        final String numString = String.valueOf(num);

        final TextView tafelnaam = (TextView) findViewById(R.id.tafelNaam2);
        tafelnaam.setText(numString);

        String r = "";
        for (int i = 1; i < 11; i++) {
            r += i + " x " + num + " = " + "\n";
            TextView textViewTafel = (TextView) findViewById(R.id.textViewToetsen2);
            textViewTafel.setText(r);
        }

        for (int i = 1; i < 11; i++) {
            int i1 = (num * 1);
            int i2 = (num * 2);
            int i3 = (num * 3);
            int i4 = (num * 4);
            int i5 = (num * 5);
            int i6 = (num * 6);
            int i7 = (num * 7);
            int i8 = (num * 8);
            int i9 = (num * 9);
            int i10 = (num * 10);

            final String i11s = String.valueOf(i1);
            final String i12s = String.valueOf(i2);
            final String i13s = String.valueOf(i3);
            final String i14s = String.valueOf(i4);
            final String i15s = String.valueOf(i5);
            final String i16s = String.valueOf(i6);
            final String i17s = String.valueOf(i7);
            final String i18s = String.valueOf(i8);
            final String i19s = String.valueOf(i9);
            final String i20s = String.valueOf(i10);

            Button controleer = (Button) findViewById(R.id.controleer2);

            controleer.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    Integer correct = 0;

                    EditText input11 = (EditText) findViewById(R.id.editText11);
                    String inputT11 = input11.getText().toString();
                    if (inputT11.equals(i11s)) {
                        correct++;
                        input11.setBackgroundColor(Color.GREEN);
                    }else {
                        input11.setBackgroundColor(Color.RED);
                    }

                    EditText input12 = (EditText) findViewById(R.id.editText12);
                    String inputT12 = input12.getText().toString();
                    if (inputT12.equals(i12s)) {
                        correct++;
                        input12.setBackgroundColor(Color.GREEN);
                    }else {
                        input12.setBackgroundColor(Color.RED);
                    }

                    EditText input13 = (EditText) findViewById(R.id.editText13);
                    String inputT13 = input13.getText().toString();
                    if (inputT13.equals(i13s)) {
                        correct++;
                        input13.setBackgroundColor(Color.GREEN);
                    }else {
                        input13.setBackgroundColor(Color.RED);
                    }

                    EditText input14 = (EditText) findViewById(R.id.editText14);
                    String inputT14 = input14.getText().toString();
                    if (inputT14.equals(i14s)) {
                        correct++;
                        input14.setBackgroundColor(Color.GREEN);
                    }else {
                        input14.setBackgroundColor(Color.RED);
                    }

                    EditText input15 = (EditText) findViewById(R.id.editText15);
                    String inputT15 = input15.getText().toString();
                    if (inputT15.equals(i15s)) {
                        correct++;
                        input15.setBackgroundColor(Color.GREEN);
                    }else {
                        input15.setBackgroundColor(Color.RED);
                    }

                    EditText input16 = (EditText) findViewById(R.id.editText16);
                    String inputT16 = input16.getText().toString();
                    if (inputT16.equals(i16s)) {
                        correct++;
                        input16.setBackgroundColor(Color.GREEN);
                    }else {
                        input16.setBackgroundColor(Color.RED);
                    }

                    EditText input17 = (EditText) findViewById(R.id.editText17);
                    String inputT17 = input17.getText().toString();
                    if (inputT17.equals(i17s)) {
                        correct++;
                        input17.setBackgroundColor(Color.GREEN);
                    }else {
                        input17.setBackgroundColor(Color.RED);
                    }

                    EditText input18 = (EditText) findViewById(R.id.editText18);
                    String inputT18 = input18.getText().toString();
                    if (inputT18.equals(i18s)) {
                        correct++;
                        input18.setBackgroundColor(Color.GREEN);
                    }else {
                        input18.setBackgroundColor(Color.RED);
                    }

                    EditText input19 = (EditText) findViewById(R.id.editText19);
                    String inputT19 = input19.getText().toString();
                    if (inputT19.equals(i19s)) {
                        correct++;
                        input19.setBackgroundColor(Color.GREEN);
                    }else {
                        input19.setBackgroundColor(Color.RED);
                    }

                    EditText input20 = (EditText) findViewById(R.id.editText20);
                    String inputT20 = input20.getText().toString();
                    if (inputT20.equals(i20s)) {
                        correct++;
                        input20.setBackgroundColor(Color.GREEN);
                    }else {
                        input20.setBackgroundColor(Color.RED);
                    }

                    if(correct == 10) {
                        Context context = getApplicationContext();
                        CharSequence text = "Goed!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        if (num == 11) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                            editor.putString("tafel11", numString);
                            editor.apply();
                        }

                        if (num == 12) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME2, MODE_PRIVATE).edit();
                            editor.putString("tafel12", numString);
                            editor.apply();
                        }

                        if (num == 13) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME3, MODE_PRIVATE).edit();
                            editor.putString("tafel13", numString);
                            editor.apply();
                        }

                        if (num == 14) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME4, MODE_PRIVATE).edit();
                            editor.putString("tafel14", numString);
                            editor.apply();
                        }

                        if (num == 15) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME5, MODE_PRIVATE).edit();
                            editor.putString("tafel15", numString);
                            editor.apply();
                        }

                        if (num == 16) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME6, MODE_PRIVATE).edit();
                            editor.putString("tafel16", numString);
                            editor.apply();
                        }

                        if (num == 17) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME7, MODE_PRIVATE).edit();
                            editor.putString("tafel17", numString);
                            editor.apply();
                        }

                        if (num == 18) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME8, MODE_PRIVATE).edit();
                            editor.putString("tafel18", numString);
                            editor.apply();
                        }

                        if (num == 19) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME9, MODE_PRIVATE).edit();
                            editor.putString("tafel19", numString);
                            editor.apply();
                        }

                        if (num == 20) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("tafel20", numString);
                            editor.apply();
                        }
                    } else {
                        Context context = getApplicationContext();
                        CharSequence text = "Fout!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    return false;
                }
            });
        }
    }
    public void bDash8() {
        Intent action = new Intent(this, toetsen11tm20.class);
        startActivity(action);
    }
}
