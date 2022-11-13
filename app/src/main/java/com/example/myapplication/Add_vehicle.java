package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Add_vehicle extends AppCompatActivity {

    ImageButton Add_Vehicle;
    ImageButton Back_btn;
    ImageButton burger_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);

        Add_Vehicle = (ImageButton) findViewById(R.id.imageButton35);

        Add_Vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Add_vehicle.this, Vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Back_btn = (ImageButton) findViewById(R.id.imageButton36);

        Back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Add_vehicle.this, Vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });

        burger_btn = (ImageButton) findViewById(R.id.imageButton37);

        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Add_vehicle.this, Vehicle.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}