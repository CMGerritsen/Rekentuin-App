package com.example.rekentuin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import java.lang.reflect.Array;
import java.util.Arrays;

public class tafeltoetsen extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

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
        int num = Integer.parseInt(message);

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

            String i1s = String.valueOf(i1);
            String i2s = String.valueOf(i2);
            String i3s = String.valueOf(i3);
            String i4s = String.valueOf(i4);
            String i5s = String.valueOf(i5);
            String i6s = String.valueOf(i6);
            String i7s = String.valueOf(i7);
            String i8s = String.valueOf(i8);
            String i9s = String.valueOf(i9);
            String i10s = String.valueOf(i10);

            final String[] cAA ={i1s, i2s, i3s, i4s, i5s, i6s, i7s, i8s, i9s, i10s};

            Button controleer = (Button) findViewById(R.id.controleer);

            controleer.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    EditText input1 = (EditText) findViewById(R.id.editText);
                    String inputT1 = input1.getText().toString();

                    EditText input2 = (EditText) findViewById(R.id.editText2);
                    String inputT2 = input2.getText().toString();

                    EditText input3 = (EditText) findViewById(R.id.editText3);
                    String inputT3 = input3.getText().toString();

                    EditText input4 = (EditText) findViewById(R.id.editText4);
                    String inputT4 = input4.getText().toString();

                    EditText input5 = (EditText) findViewById(R.id.editText5);
                    String inputT5 = input5.getText().toString();

                    EditText input6 = (EditText) findViewById(R.id.editText6);
                    String inputT6 = input6.getText().toString();

                    EditText input7 = (EditText) findViewById(R.id.editText7);
                    String inputT7 = input7.getText().toString();

                    EditText input8 = (EditText) findViewById(R.id.editText8);
                    String inputT8 = input8.getText().toString();

                    EditText input9 = (EditText) findViewById(R.id.editText9);
                    String inputT9 = input9.getText().toString();

                    EditText input10 = (EditText) findViewById(R.id.editText10);
                    String inputT10 = input10.getText().toString();

                    String[] a ={inputT1, inputT2, inputT3, inputT4, inputT5, inputT6, inputT7, inputT8, inputT9, inputT10};

                    if (Arrays.equals(a, cAA)) {
                        Context context = getApplicationContext();
                        CharSequence text = "Goed!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
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
