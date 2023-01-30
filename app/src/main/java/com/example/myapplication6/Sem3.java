package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem3 extends AppCompatActivity {
    Button btnAI,btn_numerical,btn_data_methodology,btn_probabilty2,btn_mobile;
    Intent intent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
        btnAI=(Button)findViewById(R.id.AI_btn);
        btn_numerical=(Button)findViewById(R.id.numerical_btn);
        btn_data_methodology=(Button)findViewById(R.id.d_s_method_btn);
        btn_probabilty2=(Button)findViewById(R.id.prog2_bt);
        btn_mobile=(Button)findViewById(R.id.mobile_btn);
        btnAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem3.this, AI_lec.class);
                startActivity(intent);
            }
        });
        btn_data_methodology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem3.this, data_methodology_lec.class);
                startActivity(intent);
            }
        });
        btn_probabilty2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem3.this, prob2_lec.class);
                startActivity(intent);
            }
        });
        btn_numerical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem3.this, numerical_lec.class);
                startActivity(intent);
            }
        });
        btn_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem3.this, mobile_lec.class);
                startActivity(intent);
            }
        });

    }
}