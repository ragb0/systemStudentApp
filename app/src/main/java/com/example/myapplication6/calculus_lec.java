package com.example.myapplication6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication6.R;
import com.example.myapplication6.calc_opener;

public class calculus_lec extends AppCompatActivity {

    ListView pdfListview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculus_lec);
        pdfListview= (ListView) findViewById(R.id.calc);
        String [] calc={"Lecture 1","Lecture 2","Lecture 3","Lecture 4","Lecture 5"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,calc){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view  =super.getView(position,convertView,parent);
                TextView my_text=(TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        pdfListview.setAdapter(adapter);
        pdfListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                String item=pdfListview.getItemAtPosition(i).toString();
                Intent start=new Intent(getApplicationContext(), calc_opener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}