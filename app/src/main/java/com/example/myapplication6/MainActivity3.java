package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Intent intent;
    Button youtb1,youtb2,youtb3,youtb4,youtb5,youtb6,youtb7,youtb8,youtb9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        youtb1=(Button) findViewById(R.id.g1);
        youtb2=(Button) findViewById(R.id.g2);
        youtb3=(Button) findViewById(R.id.g3);
        youtb4=(Button) findViewById(R.id.g4);
        youtb5=(Button) findViewById(R.id.g5);
        youtb6=(Button) findViewById(R.id.g6);
        youtb7=(Button) findViewById(R.id.g7);
        youtb8=(Button) findViewById(R.id.g8);
        youtb9=(Button) findViewById(R.id.g9);
        youtb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=VHDgRgb70hw&list=PLMm8EjqH1EFVR5O5wZCAy9x9mautNuxI6");
            }
        });
        youtb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=ZlSJwkFqa4Q&list=PL7snZ0LSsq3g6KzD6pdqwU3_Do8WPY4M8");
            }
        });
        youtb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=fdbU3tMvEjs&t=1905s");
            }
        });
        youtb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=cPENqVR8X98&list=PLApz4JCB0T8hJlvWzNDkY5HA9OaxZHqj4");
            }
        });
        youtb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=OB1-3nh16R8&list=PLfM2wZNebA2yoHQtWBUIEeSVUZWkYJwMY");
            }
        });
        youtb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=HRjdxozngys&list=PLPBnj6azlABbaGuOzR40nvlzPWAKMv_qA");
            }
        });
        youtb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=06cR85c55Oc&list=PL1DUmTEdeA6Lg6CXlnxEDhwpmWB0QaDh5");
            }
        });
        youtb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=OQV8WmUdeIo&list=PLbMVogVj5nJSpj5sl-8tdKARg1lw2wEa-");
            }
        });
        youtb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=t8FyQrs_nJQ&list=PLAZCf_VoDEsNLibPBaqkSYswfETbyyCnH");
            }
        });

    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(intent.ACTION_VIEW,uri));
    }
}