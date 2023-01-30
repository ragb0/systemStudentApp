package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class numerical_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerical_opener);
        myPDFviewer=(PDFView) findViewById(R.id.numerical_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("numerical_lec1.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("dnumerical_lec2.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("numerical_lec3.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("numerical_lec4.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("numerical_lec5.pdf").load();

        } }}