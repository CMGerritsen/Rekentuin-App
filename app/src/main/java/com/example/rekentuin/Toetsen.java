package com.example.rekentuin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Toetsen extends AppCompatActivity {

    public static final int REQUEST_BUTTON_1 = 1;
    public static final int REQUEST_BUTTON_2 = 2;
    public static final int REQUEST_BUTTON_3 = 3;
    public static final int REQUEST_BUTTON_4 = 4;
    public static final int REQUEST_BUTTON_5 = 5;
    public static final int REQUEST_BUTTON_6 = 6;
    public static final int REQUEST_BUTTON_7 = 7;
    public static final int REQUEST_BUTTON_8 = 8;
    public static final int REQUEST_BUTTON_9 = 9;
    public static final int REQUEST_BUTTON_10 = 10;

    private static String MY_PREFS_NAME = "";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_toetsen);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
        if (prefs.contains("tafel")) {

            if (prefs.contains("tafel")) {
                String getTafel = prefs.getString("tafel", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 1) {
                    Button button1 = (Button) findViewById(R.id.buttont1);
                    button1.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel2")) {
                String getTafel = prefs.getString("tafel2", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 2) {
                    Button button2 = (Button) findViewById(R.id.buttont2);
                    button2.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel3")) {
                String getTafel = prefs.getString("tafel3", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 3) {
                    Button button3 = (Button) findViewById(R.id.buttont3);
                    button3.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel4")) {
                String getTafel = prefs.getString("tafel4", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 4) {
                    Button button4 = (Button) findViewById(R.id.buttont4);
                    button4.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel5")) {
                String getTafel = prefs.getString("tafel5", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 5) {
                    Button button5 = (Button) findViewById(R.id.buttont5);
                    button5.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel6")) {
                String getTafel = prefs.getString("tafel6", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 6) {
                    Button button6 = (Button) findViewById(R.id.buttont6);
                    button6.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel7")) {
                String getTafel = prefs.getString("tafel7", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 7) {
                    Button button7 = (Button) findViewById(R.id.buttont7);
                    button7.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel8")) {
                String getTafel = prefs.getString("tafel8", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 8) {
                    Button button8 = (Button) findViewById(R.id.buttont8);
                    button8.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel9")) {
                String getTafel = prefs.getString("tafel9", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 9) {
                    Button button9 = (Button) findViewById(R.id.buttont9);
                    button9.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }

            if (prefs.contains("tafel10")) {
                String getTafel = prefs.getString("tafel10", "");
                int getTafelInt = Integer.parseInt(getTafel);

                if (getTafelInt == 10) {
                    Button button10 = (Button) findViewById(R.id.buttont10);
                    button10.setBackgroundResource(R.drawable.buttoncorrect);
                }
            }
        }

        final Button b11tm20 = (Button) findViewById(R.id.b11tm20t);

        b11tm20.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);
                if (prefs.contains("tafel") && prefs.contains("tafel2") && prefs.contains("tafel3") && prefs.contains("tafel4") && prefs.contains("tafel5")
                        && prefs.contains("tafel6") && prefs.contains("tafel7") && prefs.contains("tafel8") && prefs.contains("tafel9")&& prefs.contains("tafel10")) {
                    b11tm20();
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Locked!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                return false;
            }
        });

        final ImageView bDash = (ImageView) findViewById(R.id.bDash2);
        bDash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bDash2();
            }
        });

        final Button button = (Button) findViewById(R.id.buttont1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttont1();
            }
        });

        // Click this button to pass data to target activity and
        // then wait for target activity to return result data back.
        Button passDataReturnResultSourceButton = (Button)findViewById(R.id.buttont1);
        passDataReturnResultSourceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "1");
                startActivityForResult(intent, REQUEST_BUTTON_1);
            }
        });

        Button button2 = (Button)findViewById(R.id.buttont2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "2");
                startActivityForResult(intent, REQUEST_BUTTON_2);
            }
        });

        Button button3 = (Button)findViewById(R.id.buttont3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "3");
                startActivityForResult(intent, REQUEST_BUTTON_3);
            }
        });

        Button button4 = (Button)findViewById(R.id.buttont4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "4");
                startActivityForResult(intent, REQUEST_BUTTON_4);
            }
        });

        Button button5 = (Button)findViewById(R.id.buttont5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "5");
                startActivityForResult(intent, REQUEST_BUTTON_5);
            }
        });

        Button button6 = (Button)findViewById(R.id.buttont6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "6");
                startActivityForResult(intent, REQUEST_BUTTON_6);
            }
        });

        Button button7 = (Button)findViewById(R.id.buttont7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "7");
                startActivityForResult(intent, REQUEST_BUTTON_7);
            }
        });

        Button button8 = (Button)findViewById(R.id.buttont8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "8");
                startActivityForResult(intent, REQUEST_BUTTON_8);
            }
        });

        Button button9 = (Button)findViewById(R.id.buttont9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "9");
                startActivityForResult(intent, REQUEST_BUTTON_9);
            }
        });

        Button button10 = (Button)findViewById(R.id.buttont10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toetsen.this, tafeltoetsen.class);
                intent.putExtra("message", "10");
                startActivityForResult(intent, REQUEST_BUTTON_10);
            }
        });
    }
    public void b11tm20() {
        Intent action = new Intent(this, toetsen11tm20.class);
        startActivity(action);
    }

    public void bDash2() {
        Intent action = new Intent(Toetsen.this, MainActivity.class);
        startActivity(action);
    }

    public void buttont1() {
        Intent action = new Intent(Toetsen.this, tafeltoetsen.class);
        startActivity(action);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_1:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult2(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_2:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult3(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_3:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult4(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_4:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult5(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_5:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult6(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_6:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult7(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_7:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult8(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_8:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult9(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_9:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }

    protected void onActivityResult10(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_10:
                TextView textView = (TextView)findViewById(R.id.textViewToetsen);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }
}
