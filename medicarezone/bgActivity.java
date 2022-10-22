package com.example.medicarezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bgActivity extends AppCompatActivity
{

    int i=0;
    public void getcheck(View view)
    {
        EditText t1 = (EditText)findViewById(R.id.age);
        EditText t2 = (EditText)findViewById(R.id.weight);
        EditText t3 = (EditText)findViewById(R.id.hbp);
        EditText t4 = (EditText)findViewById(R.id.lbp);
        EditText t5 = (EditText)findViewById(R.id.bg);
        EditText t6 = (EditText)findViewById(R.id.hb);
        TextView t7 = (TextView) findViewById(R.id.result);


        int age = Integer.parseInt(t1.getText().toString());
        int weight = Integer.parseInt(t2.getText().toString());
        int hbp = Integer.parseInt(t3.getText().toString());
        int lbp = Integer.parseInt(t4.getText().toString());
        float hb = Float.parseFloat(t6.getText().toString());
        String  bg = t5.getText().toString();



        if(age>15 && age<60 )
        {
            if(weight>49)
            {
                if(hbp<180 && hbp>90)
                {
                    if(lbp<100 && lbp>50)
                    {
                        if(hb>12.4 && hb<20.0)
                        {
                            if(i==1)
                            {
                                if(bg.equals("O+"))
                                {
                                    t7.setText("You are eligible to donate blood to O+,A+,B+ and AB+ ");
                                }
                                else if(bg.equals("A+"))
                                {
                                    t7.setText("You are eligible to donate blood to A+ and AB+");
                                }
                                else if(bg.equals("B+"))
                                {
                                    t7.setText("You are eligible to donate blood to B+ and AB+");
                                }
                                else if (bg.equals("AB+"))
                                {
                                    t7.setText("You are eligible to donate blood to AB+ only");
                                }
                                else if(bg.equals("O-"))
                                {
                                    t7.setText("You are eligible to donate blood to all");
                                }
                                else if(bg.equals("A-"))
                                {
                                    t7.setText("You are eligible to donate blood to A-,A+,AB+ and AB-");
                                }
                                else if(bg.equals("B-"))
                                {
                                    t7.setText("You are eligible to donate blood to B-,B+,AB- and AB+");
                                }
                                else if(bg.equals("AB-"))
                                {
                                    t7.setText("You are eligible to donate blood to AB- and AB+");
                                }

                            }
                            else
                            {
                                t7.setText("You are NOT eligible for blood donation.\nReason : You have donated blood recently.\n(Refer INFO page for more details) ");
                            }
                        }
                        else
                        {
                            t7.setText("You are NOT eligible for blood donation.\nReason : Your Hb count is low.\n(Refer INFO page for more details) ");
                        }
                    }
                    else
                    {
                        t7.setText("You are NOT eligible for blood donation.\nReason : Diastolic value doesn't meet the requirements.\n(Refer INFO page for more details) ");
                    }
                }
                else
                {
                    t7.setText("You are NOT eligible for blood donation.\nReason : Systolic value doesn't meet the requirements.\n(Refer INFO page for more details) ");
                }
            }
            else
            {
                t7.setText("You are NOT eligible for blood donation.\nReason : You are underweight.\n(Refer INFO page for more details) ");
            }
        }
        else
        {
            t7.setText("You are NOT eligible for blood donation.\nReason : Age doesn't meet the requirements.\n(Refer INFO page for more details) ");
        }


    }

    public void onRadioButtonClicked(View view)
    {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId())
        {

            case R.id.radioButton:
                if (checked)
                {
                    i=1;
                }
                break;

        }


    }

    public void clear(View view)
    {
        TextView t1 = (TextView) findViewById(R.id.age);
        TextView t2 = (TextView) findViewById(R.id.weight);
        TextView t3 = (TextView) findViewById(R.id.hbp);
        TextView t4 = (TextView) findViewById(R.id.lbp);
        TextView t5 = (TextView) findViewById(R.id.bg);
        TextView t6 = (TextView) findViewById(R.id.hb);
        TextView t7 = (TextView) findViewById(R.id.result);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
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
        setContentView(R.layout.activity_bg);
    }
}
