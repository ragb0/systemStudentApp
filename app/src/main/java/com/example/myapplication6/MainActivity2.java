package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    Button youtube,yout2,yout3,yout4,yout5,yout6,yout7,yout8,yout9,yout10;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        youtube=(Button) findViewById(R.id.go1);
        yout2=(Button) findViewById(R.id.go2);
        yout3=(Button) findViewById(R.id.go3);
        yout4=(Button) findViewById(R.id.go4);
        yout5=(Button) findViewById(R.id.go5);
        yout6=(Button) findViewById(R.id.go6);
        yout7=(Button) findViewById(R.id.go7);
        yout8=(Button) findViewById(R.id.go8);
        yout9=(Button) findViewById(R.id.go9);
        yout10=(Button) findViewById(R.id.go10);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=pUAaasolcVk&list=PLxIvc-MGOs6hMiR2Xis-mJ1sXNwWsZ1Bh");
            }
        });
        yout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=nd8mxO-u0ec&list=PL7snZ0LSsq3gIc4bYM-OnvLZt2KpFvd2_");
            }
        });
        yout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=JL_grPUnXzY&list=PLeo1K3hjS3us_ELKYSj_Fth2tIEkdKXvV");
            }
        });
        yout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=mNvJipMTKSM&list=PLCInYL3l2AajYlZGzU_LVrHdoouf8W6ZN");
            }
        });
        yout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=3XipSI9ZzJA&list=PL9o9lNrP1luVQoR25mdOPP2yKyhNLLK0W");
            }
        });
        yout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=GmJJ2iZz08c&list=PLxIvc-MGOs6gW9SgkmoxE5w9vQkID1_r-");
            }
        });
        yout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=eFDzhn1Inc4&list=PLxIvc-MGOs6gZlMVYOOEtUHJmfUquCjwz");
            }
        });
        yout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=FaaM6uVbuJM&list=PLCInYL3l2AagY7fFlhCrjpLiIFybW3yQv");
            }
        });
        yout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=owCqVRbZlbg&list=PLCInYL3l2AajqOUW_2SwjWeMwf4vL4RSp");
            }
        });
        yout10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=gqRlInWygt0&list=PLBY4G2o7DhF1-QWcAdcof0Vs_B7iXJxf_");
            }
        });
    }
    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(intent.ACTION_VIEW,uri));
    }

}
