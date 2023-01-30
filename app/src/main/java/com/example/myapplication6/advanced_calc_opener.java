package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class advanced_calc_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calc_opener);
        myPDFviewer=(PDFView) findViewById(R.id.advance_calc_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("lec01advanced_calc.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("lec02advanced_calc.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("lec03advanced_calc.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("lec04advanced_calc.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("lec05advanced_calc.pdf").load();

        } }}