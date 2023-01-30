package com.example.myapplication6;

import static com.example.myapplication6.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import database.Databasesqlite;

public class login2 extends AppCompatActivity {
    EditText Idlogin,passwordlogin ;
    Button btnlogin;

    Databasesqlite databasesqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Idlogin= (EditText)findViewById(R.id.Idlogin);
        passwordlogin= (EditText)findViewById(R.id.passwordlogin);
       btnlogin = (Button) findViewById(R.id.btnlogin);

        databasesqlite=new Databasesqlite(this);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Id =Idlogin.getText().toString();
               String password =passwordlogin.getText().toString();
                if  (Idlogin.equals("")||passwordlogin.equals(""))
                {
                    Toast.makeText(login2.this,"Fill all the fields.",Toast.LENGTH_SHORT).show();

                }
                else{
                    Boolean result = databasesqlite.checkIDPassword(Id,password);
               if(result==true){
                   Intent intent = new Intent(getApplicationContext(),secondactivityy.class);
               startActivity(intent);
               }
               else {
                   Toast.makeText(login2.this,"Invalid Creadintials.",Toast.LENGTH_SHORT).show();

               }
                }
            }
        });
    }
}