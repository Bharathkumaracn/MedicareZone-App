package com.example.medicarezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bpActivity extends AppCompatActivity
{

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
        setContentView(R.layout.activity_bp);
        TextView t1 = (TextView) findViewById(R.id.infoid);
        t1.setText("<<<<<<<<<<<<<<<<<<<BMI>>>>>>>>>>>>>>>>>>>\n\n     A key index for relating weight to height. Abbreviated BMI. BMI is a person's weight in kilograms (kg) divided by his or her height in meters squared. The National Institutes of Health (NIH) now defines normal weight, overweight, and obesity according to BMI rather than the traditional height/weight charts." +
                "\n\n*If BMI is less than 16,Individual is considered to be ETREMELY UNDERWEIGHT\n*If BMI is between 16-18,Individual is concidered to be UNDERWEIGHT\n*If BMI is between 18-25,Individual is concidered to be HEALTHY\n*If BMI is between 25-29,Individual is concidered to be OVERWEIGHT\n*If BMI is between 29-39,Individual is concidered to be OBESE\n*If BMI is greater than 39,Individual is concidered to be EXTREMELY OBESE\n" +
                "------------------------------------------------------------------------------\n\n\n<<<<<<<<<<<<<<<<<<<BFP>>>>>>>>>>>>>>>>>>>\n\n     The body fat percentage (BFP) of a human or other living being is the total mass of fat divided by total body mass, multiplied by 100; body fat includes essential body fat and storage body fat. Essential body fat is necessary to maintain life and reproductive functions. The percentage of essential body fat for women is greater than that for men, due to the demands of childbearing and other hormonal functions. Storage body fat consists of fat accumulation in adipose tissue, part of which protects internal organs in the chest and abdomen. A number of methods are available for determining body fat percentage, such as measurement with calipers or through the use of bioelectrical impedance analysis.\n" +
                "\n" +
                "    The body fat percentage is a measure of fitness level, since it is the only body measurement which directly calculates a person's relative body composition without regard to height or weight. The widely used body mass index (BMI) provides a measure that allows the comparison of the adiposity of individuals of different heights and weights. While BMI largely increases as adiposity increases, due to differences in body composition, other indicators of body fat give more accurate results; for example, individuals with greater muscle mass or larger bones will have higher BMIs. As such, BMI is a useful indicator of overall fitness for a large group of people, but a poor tool for determining the health of an individual.\n" +
                "\n\n\n" +
                "------------------------------------------------------------------------------\n\n\n<<<<<<<<<<<<<<BLOOD DONATION>>>>>>>>>>>>\n\n" +
                "A blood donation occurs when a person voluntarily has blood drawn and used for transfusions and/or made into biopharmaceutical medications by a process called fractionation (separation of whole-blood components). Donation may be of whole blood, or of specific components directly (the latter called apheresis). Blood banks often participate in the collection process as well as the procedures that follow it.\n" +
                "\nCriteria for blood donation :\n" +
                "* AGE : You must be at least 17 years old to donate to the general blood supply, or 16 years old with parental/guardian consent, if allowed by state law. There is no upper age limit for blood donation as long as you are well with no restrictions or limitations to your activities.\n" +
                "* WEIGHT : You must weigh at least 110 lbs to be eligible for blood donation for your own safety. Students who donate at high school drives and donors 18 years of age or younger must also meet additional height and weight requirements for whole blood donation\n" +
                "* BLOOD PRESSURE : Acceptable as long as your blood pressure is below 180 systolic (first number) and below 100 diastolic (second number) at the time of donation. Medications for high blood pressure do not disqualify you from donating.\nAcceptable as long as you feel well when you come to donate, and your blood pressure is at least 90/50 (systolic/diastolic).\n\n" +
                "* Hb COUNT : To help ensure that it is safe for you to donate, females must have a minimum hemoglobin level of 12.5g/dL and males must have a minimum level of 13.0g/dL. A donor's hemoglobin level cannot be higher than 20.0g/dL to donate\n" +
                "* You must wait at least eight weeks (56 days) between donations of whole blood and 16 weeks (112 days) between Power Red donations. Platelet apheresis donors may give every 7 days up to 24 times per year.\n" +
                "\n* NOTE : These aren't the only criterias to be considered while donating blood.These are only the BASIC criterias for blood donation.Seek experts advise if you have any medical conditions\n\n\n" +
                "------------------------------------------------------------------------------\n\n\n" +
                "CREATED BY : \n\n" +
                "        ANURAG JOSHI\n        BHARATHKUMARA C N \n        CHANDRACHOOD BHARADWAJ P\n        PRAJWAL T R\n\n\n" +
                "------------------------------------------------------------------------------\n\n" +
                "CONTACT US : \n bharathkumara2000@gmail.com\n\n\n\n\n\n\n");


    }
}
