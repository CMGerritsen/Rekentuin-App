package com.example.rekentuin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
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

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tafeltoetsen extends AppCompatActivity {

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
        setContentView(R.layout.activity_tafeltoetsen);

        final ImageView bDash = (ImageView) findViewById(R.id.bDash5);
        bDash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bDash5();
            }
        });

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        final int num = Integer.parseInt(message);
        final String numString = String.valueOf(num);

        final TextView tafelnaam = (TextView) findViewById(R.id.tafelNaam);
        tafelnaam.setText(numString);

        String r = "";
        for (int i = 1; i < 11; i++) {
            r += i + " x " + num + " = " + "\n";
            TextView textViewTafel = (TextView) findViewById(R.id.textViewToetsen);
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

            final String i1s = String.valueOf(i1);
            final String i2s = String.valueOf(i2);
            final String i3s = String.valueOf(i3);
            final String i4s = String.valueOf(i4);
            final String i5s = String.valueOf(i5);
            final String i6s = String.valueOf(i6);
            final String i7s = String.valueOf(i7);
            final String i8s = String.valueOf(i8);
            final String i9s = String.valueOf(i9);
            final String i10s = String.valueOf(i10);

            Button controleer = (Button) findViewById(R.id.controleer);

            controleer.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    Integer correct = 0;

                    EditText input1 = (EditText) findViewById(R.id.editText);
                    String inputT1 = input1.getText().toString();
                    if (inputT1.equals(i1s)) {
                        correct++;
                        input1.setBackgroundColor(Color.GREEN);
                    }else {
                        input1.setBackgroundColor(Color.RED);
                    }

                    EditText input2 = (EditText) findViewById(R.id.editText2);
                    String inputT2 = input2.getText().toString();
                    if (inputT2.equals(i2s)) {
                        correct++;
                        input2.setBackgroundColor(Color.GREEN);
                    }else {
                        input2.setBackgroundColor(Color.RED);
                    }

                    EditText input3 = (EditText) findViewById(R.id.editText3);
                    String inputT3 = input3.getText().toString();
                    if (inputT3.equals(i3s)) {
                        correct++;
                        input3.setBackgroundColor(Color.GREEN);
                    }else {
                        input3.setBackgroundColor(Color.RED);
                    }

                    EditText input4 = (EditText) findViewById(R.id.editText4);
                    String inputT4 = input4.getText().toString();
                    if (inputT4.equals(i4s)) {
                        correct++;
                        input4.setBackgroundColor(Color.GREEN);
                    }else {
                        input4.setBackgroundColor(Color.RED);
                    }

                    EditText input5 = (EditText) findViewById(R.id.editText5);
                    String inputT5 = input5.getText().toString();
                    if (inputT5.equals(i5s)) {
                        correct++;
                        input5.setBackgroundColor(Color.GREEN);
                    }else {
                        input5.setBackgroundColor(Color.RED);
                    }

                    EditText input6 = (EditText) findViewById(R.id.editText6);
                    String inputT6 = input6.getText().toString();
                    if (inputT6.equals(i6s)) {
                        correct++;
                        input6.setBackgroundColor(Color.GREEN);
                    }else {
                        input6.setBackgroundColor(Color.RED);
                    }

                    EditText input7 = (EditText) findViewById(R.id.editText7);
                    String inputT7 = input7.getText().toString();
                    if (inputT7.equals(i7s)) {
                        correct++;
                        input7.setBackgroundColor(Color.GREEN);
                    }else {
                        input7.setBackgroundColor(Color.RED);
                    }

                    EditText input8 = (EditText) findViewById(R.id.editText8);
                    String inputT8 = input8.getText().toString();
                    if (inputT8.equals(i8s)) {
                        correct++;
                        input8.setBackgroundColor(Color.GREEN);
                    }else {
                        input8.setBackgroundColor(Color.RED);
                    }

                    EditText input9 = (EditText) findViewById(R.id.editText9);
                    String inputT9 = input9.getText().toString();
                    if (inputT9.equals(i9s)) {
                        correct++;
                        input9.setBackgroundColor(Color.GREEN);
                    }else {
                        input9.setBackgroundColor(Color.RED);
                    }

                    EditText input10 = (EditText) findViewById(R.id.editText10);
                    String inputT10 = input10.getText().toString();
                    if (inputT10.equals(i10s)) {
                        correct++;
                        input10.setBackgroundColor(Color.GREEN);
                    }else {
                        input10.setBackgroundColor(Color.RED);
                    }

                    if(correct == 10){
                        Context context = getApplicationContext();
                        CharSequence text = "Goed!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        if (num == 1) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
                            editor.putString("tafel", numString);
                            editor.apply();
                        }

                        if (num == 2) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME2, MODE_PRIVATE).edit();
                            editor.putString("tafel2", numString);
                            editor.apply();
                        }

                        if (num == 3) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME3, MODE_PRIVATE).edit();
                            editor.putString("tafel3", numString);
                            editor.apply();
                        }

                        if (num == 4) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME4, MODE_PRIVATE).edit();
                            editor.putString("tafel4", numString);
                            editor.apply();
                        }

                        if (num == 5) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME5, MODE_PRIVATE).edit();
                            editor.putString("tafel5", numString);
                            editor.apply();
                        }

                        if (num == 6) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME6, MODE_PRIVATE).edit();
                            editor.putString("tafel6", numString);
                            editor.apply();
                        }

                        if (num == 7) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME7, MODE_PRIVATE).edit();
                            editor.putString("tafel7", numString);
                            editor.apply();
                        }

                        if (num == 8) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME8, MODE_PRIVATE).edit();
                            editor.putString("tafel8", numString);
                            editor.apply();
                        }

                        if (num == 9) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME9, MODE_PRIVATE).edit();
                            editor.putString("tafel9", numString);
                            editor.apply();
                        }

                        if (num == 10) {
                            SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME10, MODE_PRIVATE).edit();
                            editor.putString("tafel10", numString);
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

    public void bDash5() {
        Intent action = new Intent(tafeltoetsen.this, Toetsen.class);
        startActivity(action);
    }
}
