package com.example.ebooklearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {

    PDFView pdfView;
    String subName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        pdfView = findViewById(R.id.pdfViewer);

        if (savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if (extras == null){
                subName = null;
            }else {
                subName = extras.getString("subName");
            }
        } else {
            subName = (String) savedInstanceState.getSerializable("subName");
        }

        String subject = subName + ".pdf";


        pdfView.fromAsset(subject)
                .pages(0, 2, 1, 3, 3, 3) // all pages are displayed by default
                .enableSwipe(true) // allows to block changing pages using swipe
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0)
                               .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)

                .load();
    }
}