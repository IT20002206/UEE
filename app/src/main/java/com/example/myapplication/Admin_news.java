package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Admin_news extends AppCompatActivity {

    ImageButton burger_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_news);

        burger_btn = (ImageButton) findViewById(R.id.imageButton47);

        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Admin_news.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}