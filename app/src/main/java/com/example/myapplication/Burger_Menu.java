package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Burger_Menu extends AppCompatActivity {

    ImageButton Burger_Close;
    ImageButton Burger_Home;
    ImageButton Burger_Weather;
    ImageButton Burger_Vehicle;
    ImageButton Burger_News;
    ImageButton Burger_Recycle;
    ImageButton Burger_LogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_menu);

        Burger_Close = (ImageButton) findViewById(R.id.burger_close);

        Burger_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Weather.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_Home = (ImageButton) findViewById(R.id.imageButton13);

        Burger_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Weather.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_Weather = (ImageButton) findViewById(R.id.imageButton15);

        Burger_Weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Weather_loc.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_Vehicle = (ImageButton) findViewById(R.id.imageButton16);

        Burger_Vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_News = (ImageButton) findViewById(R.id.imageButton18);

        Burger_News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, News_home.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_Recycle = (ImageButton) findViewById(R.id.imageButton49);

        Burger_Recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Recycle_First.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Burger_LogOut = (ImageButton) findViewById(R.id.imageButton19);

        Burger_LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Burger_Menu.this, Login.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}