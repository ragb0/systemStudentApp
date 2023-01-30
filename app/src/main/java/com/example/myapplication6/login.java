package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import database.Databasesqlite;
import database.Student;

public class login extends AppCompatActivity {
 EditText ID,password,repassword;
 Button btnSignuo,btnSignIn;
 Databasesqlite databasesqlite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ID= (EditText)findViewById(R.id.ID);
        password= (EditText)findViewById(R.id.password_toggle);
        repassword= (EditText)findViewById(R.id.repassword);
        btnSignIn=(Button) findViewById(R.id.btnSignIn);
        btnSignuo=(Button) findViewById(R.id.btnSignUp);
        databasesqlite=new Databasesqlite(this);

        btnSignuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        String id= ID.getText().toString();
                String pass= password.getText().toString();
                String repass= repassword.getText().toString();

                if (id.equals("")||pass.equals("")||repass.equals(""))
                {
                    Toast.makeText(login.this,"Fill all the fields.",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if(pass.equals(repass))
                    {
                        Boolean IDcheckResult = databasesqlite.checkID(id);
                        if (IDcheckResult==false)
                        {
                          Boolean regResult = databasesqlite.insert_data(id,pass);
                          if (regResult==true){
                              Toast.makeText(login.this,"Registration Successful.",Toast.LENGTH_SHORT).show();
                          Intent intent=new Intent(getApplicationContext(),login2.class);
                          startActivity(intent);
                          }

                          else
                          {
                              Toast.makeText(login.this,"Registration Failed.",Toast.LENGTH_SHORT).show();
                          }

                        }
                        else
                        {
                            Toast.makeText(login.this,"user already Exists.\nplease SignIn",Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(login.this,"password not Matching",Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
      btnSignIn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(getApplicationContext(),login2.class);
              startActivity(intent);
          }
      });
    }
}