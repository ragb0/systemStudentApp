package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDF_opener1 extends AppCompatActivity {
    PDFView myPDFviewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener1);
        myPDFviewer=(PDFView) findViewById(R.id.pdfViewer);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Lecture 1.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Lecture 2.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Lecture 3.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Lecture 4.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Lecture 5.pdf").load();

        } if (getItem.equals("Lecture 6")){
            myPDFviewer.fromAsset("Lecture 6.pdf").load();

        } if (getItem.equals("Lecture 7")){
            myPDFviewer.fromAsset("Lecture 7.pdf").load();

        } if (getItem.equals("Lecture 8")){
            myPDFviewer.fromAsset("Lecture 8.pdf").load();

        } if (getItem.equals("Lecture 9")){
            myPDFviewer.fromAsset("Lecture 9.pdf").load();

        } if (getItem.equals("Lecture 10")){
            myPDFviewer.fromAsset("Lecture 10.pdf").load();

        } if (getItem.equals("Lecture 11")){
            myPDFviewer.fromAsset("Lecture 11.pdf").load();

        }


    }
}