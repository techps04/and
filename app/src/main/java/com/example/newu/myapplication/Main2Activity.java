package com.example.newu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
RadioGroup group;
RadioButton r1,r2,r3,r4;
Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        group = findViewById(R.id.radioGroup2);
        r1 = findViewById(R.id.radioButton5);
        r2 = findViewById(R.id.radioButton6);
        r3 = findViewById(R.id.radioButton7);
        r4 = findViewById(R.id.radioButton8);
        nxt = findViewById(R.id.button3);



               nxt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(group.getCheckedRadioButtonId()==-1)
                    {
                        Toast.makeText(Main2Activity.this,"Please select an option",Toast.LENGTH_SHORT).show();
                    }
                   else {
                        int score;
                        if (group.getCheckedRadioButtonId()==r2.getId())
                        {
                            score=1;
                        }
                        else score=0;

                        Intent i1 = new Intent(Main2Activity.this, ques2.class);
                        i1.putExtra("score",String.valueOf(score));
                        startActivity(i1);
                        finish();
                    }
                }
            });
        }



    }
