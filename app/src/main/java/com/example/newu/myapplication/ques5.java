package com.example.newu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ques5 extends AppCompatActivity {
    int score;
    TextView qno,qs;
    RadioGroup grp;
    RadioButton b1,b2,b3,b4;
    Button b;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        qs=findViewById(R.id.textView4);
        qno=findViewById(R.id.textView5);
        grp=findViewById(R.id.radioGroup2);
        qs.setText("Q.5."+"   "+"Identify the car brand by logo.");
        qno.setText("");
        b1=findViewById(R.id.radioButton5);
        b2=findViewById(R.id.radioButton6);
        b3=findViewById(R.id.radioButton7);
        b4=findViewById(R.id.radioButton8);
        b=findViewById(R.id.button3);
        iv=findViewById(R.id.imageView4);
        b1.setText("DODGE");
        b2.setText("COUPLE");
        b3.setText("FERRARI");
        b4.setText("CADILLAC");
        iv.setImageResource(R.drawable.q5);
        b.setText("NEXT");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grp.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(ques5.this,"Please select an option !!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i5=getIntent();
                    String sc=i5.getStringExtra("score4");
                    int sc5=Integer.parseInt(sc);
                    if (grp.getCheckedRadioButtonId()==b1.getId())
                    {
                        sc5=sc5+1;
                    }
                    else sc5=sc5+0;

                    //Toast.makeText(ques5.this,String.valueOf(sc5),Toast.LENGTH_SHORT).show();
                    i5=new Intent(ques5.this,result.class);
                    i5.putExtra("score5",String.valueOf(sc5));
                    startActivity(i5);
                    finish();
                }
            }
        });
    }
}
