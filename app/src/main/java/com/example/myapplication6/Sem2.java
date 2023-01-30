package com.example.myapplication6;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem2 extends AppCompatActivity {
Button btn_advanced_calc,btn_data_structure,btn_discrete,btn_probabilty,btn_prog2;
Intent intent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
        btn_advanced_calc=(Button)findViewById(R.id.advanced_calc_bt);
        btn_data_structure=(Button)findViewById(R.id.data_structure_bt);
        btn_discrete=(Button)findViewById(R.id.discrete_bt);
        btn_probabilty=(Button)findViewById(R.id.probabilty_bt);
        btn_prog2=(Button)findViewById(R.id.prog2_bt);
        btn_advanced_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem2.this, advanced_calc_lec.class);
                startActivity(intent);
            }
        });
        btn_data_structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem2.this, data_structure_lec.class);
                startActivity(intent);
            }
        });
        btn_discrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem2.this, discrete_lec.class);
                startActivity(intent);
            }
        });
        btn_probabilty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem2.this, probabilty_lec.class);
                startActivity(intent);
            }
        });
        btn_prog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem2.this, prog_lec.class);
                startActivity(intent);
            }
        });

    }
}