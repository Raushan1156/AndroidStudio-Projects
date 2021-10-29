package com.raushan.interface1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SemesterMark extends AppCompatActivity {

    public static final String TotalMarks="package com.raushan.interface1.extra.Name1";
    public static final String AverageMarks="package com.raushan.interface1.extra.Name2";
    public static final String GradePoint="package com.raushan.interface1.extra.Name3";
    public static final String studentname="package com.raushan.interface1.extra.Name4";


    TextView smc,sname,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;
    EditText sname1,sub11,sub22,sub33,sub44,sub55,sub66,sub77,sub88;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_mark);
    }
    public void clickbtn(View view)
    {

        smc=findViewById(R.id.smc);
        sname=findViewById(R.id.sname);
        sub1=findViewById(R.id.sub1);
        sub2=findViewById(R.id.sub2);
        sub3=findViewById(R.id.sub3);
        sub4=findViewById(R.id.sub4);
        sub5=findViewById(R.id.sub5);
        sub6=findViewById(R.id.sub6);
        sub7=findViewById(R.id.sub7);
        sub8=findViewById(R.id.sub8);


        sname1=findViewById(R.id.sname1);
        sub11=findViewById(R.id.sub11);
        sub22=findViewById(R.id.sub22);
        sub33=findViewById(R.id.sub33);
        sub44=findViewById(R.id.sub44);
        sub55=findViewById(R.id.sub55);
        sub66=findViewById(R.id.sub66);
        sub77=findViewById(R.id.sub77);
        sub88=findViewById(R.id.sub88);
        button=findViewById(R.id.button);

        Toast.makeText(SemesterMark.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SemesterMark.this, SemesterMark2.class);

        //Reading Student Name
        String studentName=sname1.getText().toString();

        String s1=sub11.getText().toString();
        int s11=Integer.parseInt(s1);
        String s2=sub22.getText().toString();
        int s22=Integer.parseInt(s2);
        String s3=sub33.getText().toString();
        int s33=Integer.parseInt(s3);
        String s4=sub44.getText().toString();
        int s44=Integer.parseInt(s4);
        String s5=sub55.getText().toString();
        int s55=Integer.parseInt(s5);
        String s6=sub66.getText().toString();
        int s66=Integer.parseInt(s6);
        String s7=sub77.getText().toString();
        int s77=Integer.parseInt(s7);
        String s8=sub88.getText().toString();
        int s88=Integer.parseInt(s8);

        //finding total marks
        int total=(s11+s22+s33+s44+s55+s66+s77+s88);
        String totalMarks=Integer.toString(total);

        //finding the percentage
        double val =Math.floor(((total*100)/800)*100)/100;
        String AverageVal=Double.toString(val);

        double sgpa=(val/10)+.75;
        String gradeval=Double.toString(sgpa);

        intent.putExtra(studentname,studentName);
        intent.putExtra(TotalMarks,totalMarks);
        intent.putExtra(AverageMarks,AverageVal);
        intent.putExtra(GradePoint,gradeval);
        startActivity(intent);


    }
}
