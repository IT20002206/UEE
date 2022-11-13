package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Edit_news extends AppCompatActivity {

    ImageButton edit_news_back_button;
    ImageButton edit_news_upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_news);

        edit_news_back_button = (ImageButton) findViewById(R.id.edit_news_back_btn);

        edit_news_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Edit_news.this, Admin_news.class);
                startActivity(intentLoadNewActivity);
            }
        });

        edit_news_upload = (ImageButton) findViewById(R.id.edit_news_post);

        edit_news_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Edit_news.this, Admin_news.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}