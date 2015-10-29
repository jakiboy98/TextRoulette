package com.example.jwil9706.textroulette;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import java.util.Random;
import android.telephony.SmsManager;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class TextRoulette extends Activity
{
    private EditText messageText;
    private TextView numberView;
    private Button sendButton;
    private Button randomNumberButton;
    private Random randy;
    private Random randy2;
    private Random randy3;
    private Random randy4;
    private Random randy5;
    private Random randy6;
    private Random randy7;
    private int finalNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_roulette);

        messageText = (EditText) findViewById(R.id.messageText);
        numberView = (EditText) findViewById(R.id.numberView);
        sendButton = (Button) findViewById(R.id.sendButton);
        randomNumberButton = (Button) findViewById(R.id.randomNumberButton);
        randy = (Random) findViewById(R.id.randy);
        randy = (Random) findViewById(R.id.randy2);
        randy = (Random) findViewById(R.id.randy3);
        randy = (Random) findViewById(R.id.randy4);
        randy = (Random) findViewById(R.id.randy5);
        randy = (Random) findViewById(R.id.randy6);
        randy = (Random) findViewById(R.id.randy7);
        finalNumber = (int) findViewById(R.id.finalNumber);

        setupListeners();

    }

    private void setupListeners()
    {
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View currentView) {
                try {
                    String contact = numberView.getText().toString();

                }
            }
        });

private void setupListeners()
{
    randomNumberButton.setOnClickListener(new View.OnClickListener)
    {
        randy =  (Math.random)*10);
        randy2 =  (Math.random)*10);
        randy3 =  (Math.random)*10);
        randy4 =  (Math.random)*10);
        randy5 =  (Math.random)*10);
        randy6 =  (Math.random)*10);
        randy7 =  (Math.random)*10);

        finalNumber String = new String(+ randy + randy2 + randy3 + randy4 + randy5 + randy6 + randy7);

    }
}

    public class SendSMSActivity extends Activity
    {
        Button sendButton;
        EditText messageText;
        TextView numberView;
        Button randomNumberButton;

        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            messageText = (EditText) findViewById(R.id.messageText);
            numberView = (EditText) findViewById(R.id.numberView);
            sendButton = (Button) findViewById(R.id.sendButton);
            randomNumberButton = (Button) findViewById(R.id.randomNumberButton);

            sendButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    String phoneNo = textPhoneNo.getText().toString();
                    String sms = textSMS.getText().toString();

                    try
                    {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phoneNo, null, sms, null, null);
                        Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e)
                    {
                        Toast.makeText(getApplicationContext(), "SMS failed, please try again later.", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }
                }
            });
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_text_roulette, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
