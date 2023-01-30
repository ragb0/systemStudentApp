package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class data_structure_opener extends AppCompatActivity {


    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structure_opener);
        myPDFviewer=(PDFView) findViewById(R.id.data_structure_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Lecture_01Introduction_to_Data_Structures_and_Algorithms.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Lecture_02Introduction_to_Data_Structures_and_Algorithms.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Lecture_03Introduction_to_Data_Structures_and_Algorithms.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Lecture_04Introduction_to_Data_Structures_and_Algorithms.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Lecture_05Introduction_to_Data_Structures_and_Algorithms.pdf").load();

        } }}