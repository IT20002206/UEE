package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Recycle_noti extends AppCompatActivity {

    ImageButton recycle_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_noti);

        recycle_Message = (ImageButton) findViewById(R.id.recycle_next);

        recycle_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Recycle_noti.this, Recycle_Group_Message.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}