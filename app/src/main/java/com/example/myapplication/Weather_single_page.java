package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Weather_single_page extends AppCompatActivity {

    ImageButton Weather_back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_single_page);

        Weather_back_button = (ImageButton) findViewById(R.id.weather_back_btn);

        Weather_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Weather_single_page.this, Weather.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}