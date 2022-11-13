package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Latest_News extends AppCompatActivity {

    ImageButton burger_btn;
    ImageButton all_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_news);

        burger_btn = (ImageButton) findViewById(R.id.imageButton45);

        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Latest_News.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        all_button = (ImageButton) findViewById(R.id.latest_all_btn);

        all_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Latest_News.this, News_home.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
}