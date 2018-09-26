package com.example.newu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class result extends AppCompatActivity {
TextView e;
Button tryagain,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        e=findViewById(R.id.textView11);
        tryagain=findViewById(R.id.button5);
        exit=findViewById(R.id.button6);
        Intent rs=getIntent();
        String sc=rs.getStringExtra("score5");
        e.setText(sc);
        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(result.this,Main2Activity.class);
                startActivity(t);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.exit(0);

            }
        });
    }
}
