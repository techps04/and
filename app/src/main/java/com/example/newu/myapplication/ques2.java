package com.example.newu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ques2 extends AppCompatActivity {
RadioGroup g;
Button n;
int x;
RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        g=findViewById(R.id.radioGroup);
        n=findViewById(R.id.button2);
        r1=findViewById(R.id.radioButton10);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(ques2.this,"Please select an option !!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i2=getIntent();
                    String sc=i2.getStringExtra("score");
                    int sc2=Integer.parseInt(sc);
                    if(g.getCheckedRadioButtonId()==r1.getId())
                    {
                        sc2=sc2+1;
                    }
                    else sc2=sc2+0;

                     i2 = new Intent(ques2.this, ques3.class);
                     i2.putExtra("score2",String.valueOf(sc2));
                    startActivity(i2);
                    finish();
                }
            }
        });
    }
}
