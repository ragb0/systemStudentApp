package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class linear_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_opener);
        myPDFviewer=(PDFView) findViewById(R.id.linear_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Chapter 01 linear.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Chapter 02 linear.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Chapter 03 linear.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Chapter 04 linear.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Chapter 05 linear.pdf").load();

        } }}