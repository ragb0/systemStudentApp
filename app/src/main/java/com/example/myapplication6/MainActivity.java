package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnNext;
    Intent outIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext=(Button) findViewById(R.id.startbutton);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outIntent=new Intent(MainActivity.this, login.class);
                startActivity(outIntent);
            }
        });
    }
}