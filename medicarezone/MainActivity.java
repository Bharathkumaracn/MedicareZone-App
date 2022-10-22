package com.example.medicarezone;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    public void gobmi(View view)
    {
        Intent i = new Intent(getApplicationContext(),bmiActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_bmi);
    }

    public void gobfp(View view)
    {
        Intent i = new Intent(getApplicationContext(),bfpActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_bfp);
    }

    public void gobp(View view)
    {
        Intent i = new Intent(getApplicationContext(),bpActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_bp);
    }

    public void gobg(View view)
    {
        Intent i = new Intent(getApplicationContext(),bgActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_bg);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
