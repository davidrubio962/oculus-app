package com.example.ocularapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_vista9 extends AppCompatActivity {

    Button juan;
    String url ="https://oftalmologovigo.com/wp-content/uploads/test-osdi-f.pdf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_9);

        WebView webView =findViewById(R.id.meniscoocular);
        String video ="<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Om8d7mJSQLI\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(video, "text/html","utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        juan=findViewById(R.id.BOTON_1);
        juan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri pp =Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW,pp);
                startActivity(i);
            }
        });



    }
}