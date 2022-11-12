package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class News_home extends AppCompatActivity {

    ImageButton ImageBurger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_home);

        ImageBurger = (ImageButton) findViewById(R.id.burger_btn);

        ImageBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(News_home.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}