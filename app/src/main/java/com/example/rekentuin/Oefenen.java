package com.example.rekentuin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Oefenen extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_oefenen);

        final ImageView bDash = (ImageView) findViewById(R.id.bDash);
        bDash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bDash();
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button();
            }
        });

        // Click this button to pass data to target activity and
        // then wait for target activity to return result data back.
        Button passDataReturnResultSourceButton = (Button)findViewById(R.id.button);
        passDataReturnResultSourceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "1");
                startActivityForResult(intent, REQUEST_BUTTON_1);
            }
        });

       Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "2");
                startActivityForResult(intent, REQUEST_BUTTON_2);
            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "3");
                startActivityForResult(intent, REQUEST_BUTTON_3);
            }
        });

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "4");
                startActivityForResult(intent, REQUEST_BUTTON_4);
            }
        });

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "5");
                startActivityForResult(intent, REQUEST_BUTTON_5);
            }
        });

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "6");
                startActivityForResult(intent, REQUEST_BUTTON_6);
            }
        });

        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "7");
                startActivityForResult(intent, REQUEST_BUTTON_7);
            }
        });

        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "8");
                startActivityForResult(intent, REQUEST_BUTTON_8);
            }
        });

        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "9");
                startActivityForResult(intent, REQUEST_BUTTON_9);
            }
        });

        Button button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oefenen.this, tafelsoefenen.class);
                intent.putExtra("message", "10");
                startActivityForResult(intent, REQUEST_BUTTON_10);
            }
        });
    }
    public void bDash() {
        Intent action = new Intent(Oefenen.this, MainActivity.class);
        startActivity(action);
    }

    public void button() {
        Intent action = new Intent(Oefenen.this, tafelsoefenen.class);
        startActivity(action);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent dataIntent) {
        super.onActivityResult(requestCode, resultCode, dataIntent);
        switch (requestCode)
        {
            case REQUEST_BUTTON_1:
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
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
                TextView textView = (TextView)findViewById(R.id.tafelview);
                if (resultCode == RESULT_OK)
                {
                    String messageReturn = dataIntent.getStringExtra("message_return");
                    textView.setText(messageReturn);
                }
        }
    }
}