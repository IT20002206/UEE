package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Weather_loc extends AppCompatActivity {

    ImageButton weather_loc_burger;
    ImageButton Weather_loc_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_loc);

        weather_loc_burger = (ImageButton) findViewById(R.id.weather_loc_burger);

        weather_loc_burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Weather_loc.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Weather_loc_first = (ImageButton) findViewById(R.id.weather_loc_tok);

        Weather_loc_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Weather_loc.this, Weather.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}