package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recycle_Group_Message extends AppCompatActivity {

    ImageButton group_message;

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
    }
}