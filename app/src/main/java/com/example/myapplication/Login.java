package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    ImageButton myImageButton;
    ImageButton loginImage;
    ImageButton idontImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myImageButton = (ImageButton) findViewById(R.id.forgot_btn);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Login.this, Reset_Password.class);
                startActivity(intentLoadNewActivity);
            }
        });

        loginImage = (ImageButton) findViewById(R.id.imageButton5);

        loginImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Login.this, News_home.class);
                startActivity(intentLoadNewActivity);
            }
        });

        idontImage = (ImageButton) findViewById(R.id.idont);

        idontImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(Login.this, Sign_Up.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}