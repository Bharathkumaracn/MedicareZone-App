package com.example.medicarezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class bfpActivity extends AppCompatActivity
{
     RadioGroup genderGroup;
     RadioButton btn_result;
     int i;


    public void gotobmi(View view)
    {
        Intent i = new Intent(getApplicationContext(),bmiActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_bmi);
    }

    public void onRadioButtonClicked(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.maleid:
                if (checked)
                {
                    i=1;
                }
                break;
            case R.id.femaleid:
                if (checked)
                {
                    i=2;
                }
                break;
        }
    }



    public void getbfp(View view)
    {
        EditText n1 = (EditText) findViewById(R.id.bmi);
        EditText n2 = (EditText) findViewById(R.id.age);
        String number1 = n1.getText().toString();
        String number2 = n2.getText().toString();
        Integer bmi = Integer.parseInt(number1);
        Integer age = Integer.parseInt(number2);
        TextView t = (TextView) findViewById(R.id.result);

        Double bfp;
        switch(i)
        {
            case 1:
                bfp = ((1.20*bmi)+(0.23*age)-(10.8*1)-5.4);
                t.setText(Double.toString(bfp));
                break;

            case 2:
                bfp = ((1.20*bmi)+(0.23*age)-(10.8*0)-5.4);
                t.setText(Double.toString(bfp));
                break;
        }

    }


    public void clear(View view)
    {
        TextView t1 = (TextView) findViewById(R.id.bmi);
        TextView t2 = (TextView) findViewById(R.id.age);
        TextView t = (TextView) findViewById(R.id.result);


        t1.setText("");
        t2.setText("");
        t.setText("");

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
        setContentView(R.layout.activity_bfp);

    }


}
