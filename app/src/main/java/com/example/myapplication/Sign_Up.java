package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Sign_Up extends AppCompatActivity {

    ImageButton registerBTN;
    ImageButton clickRegister;
    ImageButton appRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        registerBTN = (ImageButton) findViewById(R.id.i_have);

        registerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Sign_Up.this, Login.class);
                startActivity(intentLoadNewActivity);
            }
        });
        clickRegister = (ImageButton) findViewById(R.id.i_have);

        clickRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Sign_Up.this, Login.class);
                startActivity(intentLoadNewActivity);
            }
        });

        appRegister = (ImageButton) findViewById(R.id.imageButton4);

        appRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Sign_Up.this, Login.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}