package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class youtube extends AppCompatActivity {
    Intent intent;
    Button level1,level2,level3,level4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        level1=(Button) findViewById(R.id.level1);
        level2=(Button) findViewById(R.id.level2);
        level3=(Button) findViewById(R.id.level3);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(youtube.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(youtube.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(youtube.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}