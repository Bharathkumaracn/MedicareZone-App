package com.example.medicarezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class bmiActivity extends AppCompatActivity
{

    public void calculate(View view)
    {
        EditText n1 = (EditText) findViewById(R.id.Win);
        EditText n2 = (EditText) findViewById(R.id.Hin);
        String number1 = n1.getText().toString();
        String number2 = n2.getText().toString();
        TextView t1 = (TextView) findViewById(R.id.BMIout);
        Double double1 = Double.parseDouble(number1);
        Double double2 = Double.parseDouble(number2);
        Double H = double2 / 100;
        Double bmi= double1/(H*H);
        int BMI = bmi.intValue();
        t1.setText(Integer.toString(BMI));

        TextView t2 = (TextView) findViewById(R.id.Rout);

        if(BMI<16)
        {
            t2.setText("Extremely Underweight");
        }
        else if(BMI<=18)
        {
            t2.setText("Underweight");
        }
        else if(BMI<25)
        {
            t2.setText("Healthy");
        }
        else if(BMI<=29)
        {
            t2.setText("Overweight");
        }
        else if(BMI<=39)
        {
            t2.setText("Obese");
        }
        else if(BMI>39)
        {
            t2.setText("Extremely Obese");
        }


    }
    public void clear(View view)
    {
        TextView t1 = (TextView) findViewById(R.id.Win);
        TextView t2 = (TextView) findViewById(R.id.Hin);
        TextView t3 = (TextView) findViewById(R.id.BMIout);
        TextView t4 = (TextView) findViewById(R.id.Rout);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }
    public void goback(View view)
    {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }
}
