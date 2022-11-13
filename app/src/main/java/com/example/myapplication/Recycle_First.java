package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recycle_First extends AppCompatActivity {

    ImageButton Burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_first);

        Burger = (ImageButton) findViewById(R.id.imageButton56);

        Burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Recycle_First.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}