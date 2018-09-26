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

public class ques4 extends AppCompatActivity {

    TextView qno,qs;
    RadioGroup grp;
    RadioButton b1,b2,b3,b4;
    Button b;
    ImageView iv;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        qs=findViewById(R.id.textView4);
        qno=findViewById(R.id.textView5);
        grp=findViewById(R.id.radioGroup2);
      //  qno.setText("Q.4.");
        qs.setText("Q.4."+" "+"Which company owns the following brands-Bentley,Bugatti,Lamborghini,Audi");
        b1=findViewById(R.id.radioButton5);
        b2=findViewById(R.id.radioButton6);
        b3=findViewById(R.id.radioButton7);
        b4=findViewById(R.id.radioButton8);
        b=findViewById(R.id.button3);
        iv=findViewById(R.id.imageView4);
        b1.setText("Mercedes-Benz");
        b2.setText("Volkswagen");
        b3.setText("Audi");
        b4.setText("BMW");
        iv.setImageResource(R.drawable.lamb);
        b.setText("NEXT");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grp.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(ques4.this,"Please select an option !!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i4=getIntent();
                    String sc=i4.getStringExtra("score3");
                   int sc4=Integer.parseInt(sc);
                    if (grp.getCheckedRadioButtonId()==b2.getId())
                    {
                        sc4=sc4+1;
                    }
                    else {
                        sc4=sc4+0;
                    }
                    //Toast.makeText(ques4.this,String.valueOf(sc4),Toast.LENGTH_SHORT).show();
                    i4 = new Intent(ques4.this, ques5.class);
                    i4.putExtra("score4",String.valueOf(sc4));
                    startActivity(i4);
                    finish();
                }
            }
        });
    }
}
