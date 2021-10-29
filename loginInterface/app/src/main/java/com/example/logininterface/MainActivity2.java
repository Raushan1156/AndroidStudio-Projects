package com.example.logininterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textCarried;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textCarried=findViewById(R.id.textCarried);
        Intent intent=getIntent();
        String nameis=intent.getStringExtra(MainActivity.Extra_Name);
        textCarried.setText(nameis);
    }
}