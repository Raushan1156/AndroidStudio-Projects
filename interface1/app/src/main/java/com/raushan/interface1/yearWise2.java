package com.raushan.interface1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class yearWise2 extends AppCompatActivity {
    TextView result,totalPercentage,totalPercent,totalgpa,totalGradePoint,feeds,feedss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_wise2);

        totalPercentage=findViewById(R.id.totalPercentage);
        totalPercent=findViewById(R.id.totalPercent);
        totalgpa=findViewById(R.id.totalgpa);
        totalGradePoint=findViewById(R.id.totalGradePoint);
        feeds=findViewById(R.id.feeds);
        feedss=findViewById(R.id.feedss);

       Intent intent=getIntent();

        String Tpercent=intent.getStringExtra(yearWise.totalPercent);
        totalPercent.setText(Tpercent+"%");

        String Tgpa=intent.getStringExtra(SemesterMark.GradePoint);
        totalGradePoint.setText(Tgpa);

        String fb=intent.getStringExtra(yearWise.FeedBack);
        feedss.setText(fb);
    }
}