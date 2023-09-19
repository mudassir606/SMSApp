package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {

    EditText phonenumber,message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsactivity);

         phonenumber = findViewById(R.id.phone_number);
         message = findViewById(R.id.message);

        SMS();
    }

    public void SMS(){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ph = phonenumber.getText().toString();
                String sms = message.getText().toString();
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,sms,null,null);

                Toast.makeText(getApplicationContext(),"Message Send Hopefully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}