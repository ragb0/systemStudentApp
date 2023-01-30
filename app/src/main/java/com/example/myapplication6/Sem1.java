package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem1 extends AppCompatActivity {
    Button btn_prog,btn_CS,btn_calc,btn_linear,btn_data_science;
    Intent intent;
    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester1);
        btn_prog=(Button)findViewById(R.id.prog);
        btn_CS=(Button)findViewById(R.id.CS);
        btn_calc=(Button)findViewById(R.id.calc1);
        btn_linear= (Button)findViewById(R.id.linear);
        btn_data_science =(Button)findViewById(R.id.d_s);
        btn_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem1.this, programming_lecture.class);
                startActivity(intent);
            }
        });
        btn_CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem1.this, computer_system_lec.class);
                startActivity(intent);
            }
        });
        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem1.this, calculus_lec.class);
                startActivity(intent);
            }
        });
        btn_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem1.this,linear_lec.class);
                startActivity(intent);
            }
        });
        btn_data_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(Sem1.this, data_science_lec.class);
                startActivity(intent);
            }
        });
    }
}