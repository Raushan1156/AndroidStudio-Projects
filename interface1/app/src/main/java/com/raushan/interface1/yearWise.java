package com.raushan.interface1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class yearWise extends AppCompatActivity {
    public static final String totalPercent="package com.raushan.interface1.Name1";
    public static final String GradePoint="package com.raushan.interface1.Name1";
    public static final String FeedBack="package com.raushan.interface1.Name1";

    TextView year1,year2,year3,year4,calculate;
    EditText mark1,mark2,mark3,mark4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_wise);
    }
     public void clickButton(View v) {

                Toast.makeText(yearWise.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
         year1 = findViewById(R.id.year1);
         year2 = findViewById(R.id.year2);
         year3 = findViewById(R.id.year3);
         year4 = findViewById(R.id.year4);
         calculate = findViewById(R.id.calculate);

         mark1 = findViewById(R.id.mark1);
         mark2 = findViewById(R.id.mark2);
         mark3 = findViewById(R.id.mark3);
         mark4 = findViewById(R.id.mark4);

         Intent intent=new Intent(yearWise.this,yearWise2.class);
         String m1=mark1.getText().toString();
         double m11=Double.parseDouble(m1);
         String m2=mark1.getText().toString();
         double m22=Double.parseDouble(m2);
         String m3=mark1.getText().toString();
         double m33=Double.parseDouble(m3);
         String m4=mark1.getText().toString();
         double m44=Double.parseDouble(m4);

         double percentage=((m11+m22+m33+m44)/400)*100;
         String temp1=Integer.toString((int) percentage);
         double grade=(percentage/10)-0.75;
         String temp2=Integer.toString((int) grade);

         String feed;
         if(percentage>90&& percentage<=100)
             feed="OutStanding";
         else if(percentage<=90&&percentage>80)
             feed="Excellent";
         else if(percentage<=80&&percentage>=70)
             feed="Very Good";
         else if(percentage<=70&&percentage>60)
             feed="Good";
         else if(percentage<=60&& percentage>50)
             feed="Above Average";
         else if(percentage<=50&&percentage>45)
             feed="Average";
         else if(percentage<=45&&percentage>=40)
                feed="Poor";
         else
                feed="Fail";

         intent.putExtra(totalPercent,temp1);
         intent.putExtra(GradePoint,temp2);
         intent.putExtra(FeedBack,feed);
         startActivity(intent);

    }
}
