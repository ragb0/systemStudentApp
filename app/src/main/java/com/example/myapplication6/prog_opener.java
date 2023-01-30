package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class prog_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog_opener);
        myPDFviewer=(PDFView) findViewById(R.id.prog_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("oop_Lecture 1.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("oop_Lecture 2.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("oop_Lecture 3.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("oop_Lecture 4.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("oop_Lecture 5.pdf").load();

        } }}