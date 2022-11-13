package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recycle_First extends AppCompatActivity {

    ImageButton Burger;
    ImageButton recycle_Learn_More;

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

        recycle_Learn_More = (ImageButton) findViewById(R.id.imageButton38);

        recycle_Learn_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Recycle_First.this, Recycle_noti.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}