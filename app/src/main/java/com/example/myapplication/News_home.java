package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class News_home extends AppCompatActivity {

    ImageButton ImageBurger;
    ImageButton ImageRead;
    ImageButton AddNews;
    ImageButton NewsAdmin;
    ImageButton Latest_btn;

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

        ImageRead = (ImageButton) findViewById(R.id.imageButton14);

        ImageRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(News_home.this, News_Single.class);
                startActivity(intentLoadNewActivity);
            }
        });

        AddNews = (ImageButton) findViewById(R.id.imageButton46);

        AddNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(News_home.this, Add_news.class);
                startActivity(intentLoadNewActivity);
            }
        });

        NewsAdmin = (ImageButton) findViewById(R.id.imageButton48);

        NewsAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(News_home.this, Admin_news.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Latest_btn = (ImageButton) findViewById(R.id.imageButton9);

        Latest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(News_home.this, Latest_News.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }
}