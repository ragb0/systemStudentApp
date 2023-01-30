package com.example.myapplication6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class CS_opener extends AppCompatActivity {

    PDFView myPDFviewer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_opener);
        myPDFviewer=(PDFView) findViewById(R.id.cs_view);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("Lecture 1")){
            myPDFviewer.fromAsset("Chapter 1 cs.pdf").load();

        }
        if (getItem.equals("Lecture 2")){
            myPDFviewer.fromAsset("Chapter 2 CS.pdf").load();

        } if (getItem.equals("Lecture 3")){
            myPDFviewer.fromAsset("Chapter 4 CS.pdf").load();

        } if (getItem.equals("Lecture 4")){
            myPDFviewer.fromAsset("Chapter 5 CS.pdf").load();

        } if (getItem.equals("Lecture 5")){
            myPDFviewer.fromAsset("Chapter 2 CS.pdf").load();

        } }}