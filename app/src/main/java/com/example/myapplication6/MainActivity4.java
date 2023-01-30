package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Intent intent;
    Button you1,you2,you3,you4,you5,you6,you7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        you1=(Button) findViewById(R.id.gg1);
        you2=(Button) findViewById(R.id.gg2);
        you3=(Button) findViewById(R.id.gg3);
        you4=(Button) findViewById(R.id.gg4);
        you5=(Button) findViewById(R.id.gg5);
        you6=(Button) findViewById(R.id.gg6);
        you7=(Button) findViewById(R.id.gg7);
        you1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=tt9BgSrsqPg&list=PLfgCIULRQavx6TjOhr_7pkx7ne4kI1r2N");
            }
        });
        you2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=Khj94kaJjWo&list=PLg91P4KVeUZbg28jiPq_qTgTCf6xQya-e");
            }
        });
        you3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=8jH07r6135o&list=PL_pbwdIyffslgxMVyXhnHiSn_EWTvx1G-");
            }
        });
        you4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=oSQL4UjBFBg&list=PL7sWxFnBVJLUbrCHertPLEqqCyLVnG-tN");
            }
        });
        you5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=Vm3jvw3QorQ&list=PLAED6B1A8BFAD8B1E");
            }
        });
        you6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=NzyuxPtrRRM&list=PLxIvc-MGOs6ib0oK1z9C46DeKd9rRcSMY");
            }
        });
        you7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=v5MYtNDNnH0&list=PLQ5InjwnjHuVpoQmvaMVWjsUZ9I9IWuXH");
            }
        });

    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(intent.ACTION_VIEW,uri));
    }
}