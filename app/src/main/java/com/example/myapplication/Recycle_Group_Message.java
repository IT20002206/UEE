package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recycle_Group_Message extends AppCompatActivity {

    ImageButton group_message;
    ImageButton burger_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_group_message);

        group_message = (ImageButton) findViewById(R.id.group_message);

        group_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Recycle_Group_Message.this, Recycle_Single_Message.class);
                startActivity(intentLoadNewActivity);
            }
        });

        burger_btn = (ImageButton) findViewById(R.id.imageButton60);

        burger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Recycle_Group_Message.this, Burger_Menu.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}