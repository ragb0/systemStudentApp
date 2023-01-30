package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class probabilty_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probabilty_opener);
        myPDFviewer=(PDFView) findViewById(R.id.probabilty_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("probabilty1_lec01.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("probabilty1_lec02.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("probabilty1_lec03.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("probabilty1_lec04.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("probabilty1_lec05.pdf").load();

        } }}