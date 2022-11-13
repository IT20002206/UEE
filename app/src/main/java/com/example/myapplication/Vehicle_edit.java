package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Vehicle_edit extends AppCompatActivity {

    ImageButton vehicle_edit_burger;
    ImageButton edit_vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_edit);

        vehicle_edit_burger = (ImageButton) findViewById(R.id.edit_vehicle_burger);

        vehicle_edit_burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Vehicle_edit.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        edit_vehicle = (ImageButton) findViewById(R.id.edit_vehicle_edit_btn);

        edit_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Vehicle_edit.this, Vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}