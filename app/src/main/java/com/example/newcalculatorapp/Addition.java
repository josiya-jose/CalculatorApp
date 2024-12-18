package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addition extends AppCompatActivity {
    EditText et1,et2;
    Button btn1,btn2;
    TextView tv1;
    String getNum1,getNum2,result;
    int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        et1=(EditText) findViewById(R.id.num1);
        et2=(EditText) findViewById(R.id.num2);
        btn1=(Button) findViewById(R.id.sum);
        btn2=(Button) findViewById(R.id.back);
        tv1=(TextView)findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 getNum1=et1.getText().toString();
                 getNum2=et2.getText().toString();
                 num1=Integer.parseInt(getNum1);
                 num2=Integer.parseInt(getNum2);
                 sum=num1+num2;
                 result=String.valueOf(sum);
                 tv1.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(obj1);
            }
        });


    }
}