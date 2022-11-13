package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Reset_Password extends AppCompatActivity {

    ImageButton Reset_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Reset_pass = (ImageButton) findViewById(R.id.imageButton);

        Reset_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Reset_Password.this, OTP_Verification.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}