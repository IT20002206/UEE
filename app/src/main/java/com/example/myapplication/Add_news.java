package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Add_news extends AppCompatActivity {

    ImageButton Back_btn;
    ImageButton Post_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_news);

        Back_btn = (ImageButton) findViewById(R.id.imageButton39);

        Back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Add_news.this, News_home.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Post_btn = (ImageButton) findViewById(R.id.imageButton41);

        Post_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Add_news.this, Admin_news.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}