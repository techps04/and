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

public class ques3 extends AppCompatActivity {
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
        qs.setText("Q.3."+"   "+"Tata motors owns which foreign car company ?");
        qno.setText("Q.3.");
        b1=findViewById(R.id.radioButton5);
        b2=findViewById(R.id.radioButton6);
        b3=findViewById(R.id.radioButton7);
        b4=findViewById(R.id.radioButton8);
        b=findViewById(R.id.button3);
        iv=findViewById(R.id.imageView4);
b1.setText("SSANG Yang");
b2.setText("SAAB");
b3.setText("Fiat");
b4.setText("Jaguar");
iv.setImageResource(R.drawable.tata_bccl);
b.setText("NEXT");

   b.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           if(grp.getCheckedRadioButtonId()==-1)
           {
               Toast.makeText(ques3.this,"Please select an option !!",Toast.LENGTH_SHORT).show();
           }
           else {

                   Intent i3=getIntent();
                   String sc=i3.getStringExtra("score2");
                   int sc3=Integer.parseInt(sc);
               if(grp.getCheckedRadioButtonId()==b4.getId())
               {
                   sc3=sc3+1;
               }
               else sc3=sc3+0;

              // Toast.makeText(ques3.this,String.valueOf(sc3),Toast.LENGTH_SHORT).show();
                i3 = new Intent(ques3.this, ques4.class);
                i3.putExtra("score3",String.valueOf(sc3));
               startActivity(i3);
               finish();
           }
       }
   });
    }
}
