package com.gursimran.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn8,btn9,btnmin,btndivide,btnmul,btn7,btndot,btnplus,btnequals,Acbtn,btn0;
    boolean add,sub,mul,divide,make;
    Float result, result1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textview);
        btndot=findViewById(R.id.btndot);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btndivide=findViewById(R.id.btndivide);
        btnmin=findViewById(R.id.btnmin);
        btnmul=findViewById(R.id.btnmul);
        btnplus=findViewById(R.id.btnplus);
        btnequals=findViewById(R.id.btnequals);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if(textView.getText().toString().equals("0")){
                   textView.setText("1");
               }
               else
               {
                   textView.setText(textView.getText()+"1");
               }

           }
       });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"7");
            }
        });btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"8");
            }
        });btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"0");
            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+".");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+"");
                    add=true;
                    textView.setText(null);
                }
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+"");
                    sub=true;
                    textView.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+"");
                    mul=true;
                    textView.setText(null);
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView==null){
                    textView.setText("");
                }
                else{
                    result=Float.parseFloat(textView.getText()+"");
                    divide=true;
                    textView.setText(null);
                }
            }
        });

        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Float.parseFloat(textView.getText()+"");
                if(add){

                    textView.setText(result+result1+"");
                    add=false;
                }

             if(sub){

                    textView.setText(result-result1+"");
                    sub=false;
                }


                    if(mul){
                        System.out.println("------------------------");

                    textView.setText(result*result1+"");
                    mul=false;
                }
                if(divide){

                    textView.setText(result/result1+"");
                    divide=false;
                }
                else
                {
                    System.out.println("------------------------");
                }
            }
        });


        Acbtn=findViewById(R.id.Acbtn);
        Acbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });




    }


}