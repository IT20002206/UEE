package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OTP_Verification extends AppCompatActivity {

    ImageButton Otp_verification;
    ImageButton Confirm_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        Otp_verification = (ImageButton) findViewById(R.id.imageButton55);

        Otp_verification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(OTP_Verification.this, Sign_Up.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Confirm_btn = (ImageButton) findViewById(R.id.imageButton2);

        Confirm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(OTP_Verification.this, OTP_new_password.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}