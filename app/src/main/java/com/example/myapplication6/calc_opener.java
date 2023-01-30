package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication6.R;
import com.github.barteksc.pdfviewer.PDFView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class calc_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_opener);
        myPDFviewer=(PDFView) findViewById(R.id.calc_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Lec (1) calc.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Lec (2) calc.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Lec (3) calc.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Lec (4) calc.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Lec (5) calc.pdf").load();

        } }}