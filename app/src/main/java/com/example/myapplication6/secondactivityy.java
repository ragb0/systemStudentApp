package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class secondactivityy extends AppCompatActivity {
    RadioButton sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    RadioGroup radioGroup;
    Button youtube;
    Intent outIntent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivityy);
        youtube=(Button) findViewById(R.id.youtube);
        sem1 = (RadioButton)findViewById(R.id.sem1);
        sem2 = (RadioButton)findViewById(R.id.sem2);
        sem3 = (RadioButton)findViewById(R.id.sem3);
        sem4 = (RadioButton)findViewById(R.id.sem4);
        sem5 = (RadioButton)findViewById(R.id.sem5);
        sem6 = (RadioButton)findViewById(R.id.sem6);
        sem7 = (RadioButton)findViewById(R.id.sem7);
        sem8 = (RadioButton)findViewById(R.id.sem8);
        radioGroup=(RadioGroup)findViewById(R.id.rdGroup) ;
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secondactivityy.this, youtube.class);
                startActivity(intent);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (sem1.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), Sem1.class);
                    startActivity(intent);

                } else if (sem2.isChecked()) {
                    Intent intent1 = new Intent(getApplicationContext(), Sem2.class);
                    startActivity(intent1);




                } else if (sem3.isChecked()) {
                    Intent intent3 = new Intent(getApplicationContext(), Sem3.class);
                    startActivity(intent3);




                }else if (sem4.isChecked()) {
                    Intent intent4 = new Intent(getApplicationContext(), Sem4.class);
                    startActivity(intent4);

                }


                else if (sem5.isChecked()) {
                    Intent intent5 = new Intent(getApplicationContext(), Sem5.class);
                    startActivity(intent5);

                }

                else if (sem6.isChecked()) {
                    Intent intent6 = new Intent(getApplicationContext(), Sem6.class);
                    startActivity(intent6);

                }


                else if (sem7.isChecked()) {
                    Intent intent7 = new Intent(getApplicationContext(), Sem7.class);
                    startActivity(intent7);

                }


                else  if (sem8.isChecked()) {
                    Intent intent8 = new Intent(getApplicationContext(), Sem8.class);
                    startActivity(intent8);

                }




            }

        });
    }
}