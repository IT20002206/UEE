package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Vehicle extends AppCompatActivity {

    ImageButton Vehicle_btn;
    ImageButton Add_vehicle;
    ImageButton edit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Vehicle_btn = (ImageButton) findViewById(R.id.imageButton52);

        Vehicle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Vehicle.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Add_vehicle = (ImageButton) findViewById(R.id.imageButton33);

        Add_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Vehicle.this, Add_vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });

        edit_btn = (ImageButton) findViewById(R.id.imageButton12);

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Vehicle.this, Vehicle_edit.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}