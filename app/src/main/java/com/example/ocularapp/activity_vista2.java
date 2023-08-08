package com.example.ocularapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_vista2 extends AppCompatActivity {

    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista2);
        siguiente=(Button) findViewById(R.id.superficie_oc);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(activity_vista2.this, activity_vista3.class);
                startActivity(i);

            }
        });


    }
}
