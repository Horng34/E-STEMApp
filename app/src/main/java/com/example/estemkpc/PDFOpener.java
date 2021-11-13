package com.example.estemkpc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView PDFViewr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        PDFViewr = findViewById(R.id.pdfViewr);

        String getItem = getIntent().getStringExtra("pdfFileName");
        if (getItem.equals("គណិតវិទ្យាថ្នាក់ទី៩ មេរៀនទី៤")){
            PDFViewr.fromAsset("math9.pdf").load();
        }
        if (getItem.equals("ទង្វើរអុកស៊ីសែន")){
            PDFViewr.fromAsset("chemistryexpirement.pdf").load();
        }

    }
}