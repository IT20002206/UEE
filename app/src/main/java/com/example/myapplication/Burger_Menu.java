package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Burger_Menu extends AppCompatActivity {

    ImageButton Burger_Close;

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
    }
}