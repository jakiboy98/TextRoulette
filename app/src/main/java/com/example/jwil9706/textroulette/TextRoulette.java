package com.example.jwil9706.textroulette;

//Jacob W, Jacob A, Gabe A, Garret S, Alan H

import android.app.Activity;
import android.content.Intent;
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
import java.util.ArrayList;


public class TextRoulette extends Activity {

    private Button shareIntent;
    private Button send;
    private EditText phoneNo;
    private EditText messageBody;
    private ArrayList<String> messageList;
    private Button messageGen;

    private void buildMessageList()
    {
        this.messageList.add("This is a message to you");
        this.messageList.add("I made this for you");
        this.messageList.add("How you dewin");
        this.messageList.add("So you want to talk about weather?");
        this.messageList.add("Spanish");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_roulette);

        phoneNo = (EditText) findViewById(R.id.mobileNumber);
        messageBody = (EditText) findViewById(R.id.smsBody);
        send = (Button) findViewById(R.id.send);
        shareIntent = (Button) findViewById(R.id.send);

        send.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                sendSms();
            }

        });

        shareIntent.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.putExtra("sms_body", messageBody.getText().toString());
                    sendIntent.setType("vnd.android-dir/mms-sms");
                    startActivity(sendIntent);
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again later!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }

    messageGen.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View)
            {
                    
            }
    });

    protected void sendSms()
    {
        String number = phoneNo.getText().toString();
        String message = messageBody.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS faild, please try again.",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


}
