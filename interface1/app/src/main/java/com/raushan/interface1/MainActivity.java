package com.raushan.interface1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button semMarks,yrWise,g2p,p2g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        semMarks=findViewById(R.id.semMarks);
        yrWise=findViewById(R.id.yrWise);
        g2p=findViewById(R.id.g2p);
        p2g=findViewById(R.id.p2g);

        semMarks.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,SemesterMark.class);
                startActivity(in1);
            }
        });

        yrWise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,yearWise.class);
                startActivity(in2);
            }
        });

        g2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(MainActivity.this,g2p.class);
                startActivity(in3);
            }
        });

        p2g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(MainActivity.this,p2g.class);
                startActivity(in4);
            }
        });
    }
}