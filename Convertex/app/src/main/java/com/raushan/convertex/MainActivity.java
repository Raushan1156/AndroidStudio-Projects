package com.raushan.convertex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText dolloramount;
    private Button button;
//    public void btnClick(View view)
//        {
//            EditText dolloramount=(EditText)findViewById(R.id.dolloramount);
//            String doll=dolloramount.getText().toString();
//            Double doubledoller= Double.parseDouble(doll);
//            Double inr=75.21*doubledoller;
//            String toastText="= "+ inr.toString()+"INR";
//            Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
//
//        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        dolloramount=findViewById(R.id.dolloramount);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
                String s=dolloramount.getText().toString();
                int dollor=Integer.parseInt(s);
                double inr =Math.floor(75.21*dollor*100)/100;
//                String inrr=Double.toString(inr);
//                String temp= String.format("%.2f",inrr);
//                double output=Double.parseDouble(temp);
                textView.setText(inr+" INR");
            }
        });
    }

    public void btnClick(View view) {
    }
}