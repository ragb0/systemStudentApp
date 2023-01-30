package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class data_science_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_science_opener);
        myPDFviewer=(PDFView) findViewById(R.id.datasc_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Lec.1.D. S. 2021-2022.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Lec.2.D. S. 2021-2022 (1).pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Lec.3.D. S. 2021-2022.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Lec.4.D. S. 2021-2022.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Lec.5.D. S. 2021-2022 (1).pdf").load();

        } }}