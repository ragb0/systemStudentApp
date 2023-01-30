package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class data_methodology_opener extends AppCompatActivity {


    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_methodology_opener);
        myPDFviewer=(PDFView) findViewById(R.id.data_methodology_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("ds_methodolgy_lec1.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("ds_methodolgy_lec2.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("ds_methodolgy_lec3.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("ds_methodolgy_lec4.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("ds_methodolgy_lec5.pdf").load();

        } }}