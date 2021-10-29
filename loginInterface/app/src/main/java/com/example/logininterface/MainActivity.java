package com.example.logininterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText PersonName,TextPassword;
    CheckBox checkBox;
    public static final String Extra_Name="com.example.logininterface.extra.NAME"; // its an unique key.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void clickbtn(View view)
        {
            Log.i("this", "clickbtn: LOGIN button clicked ");
            Toast.makeText(this,"Successfully Logged in.",Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(this,MainActivity2.class);
            textView=findViewById(R.id.textView);
            PersonName=findViewById(R.id.PersonName);
            TextPassword=findViewById(R.id.TextPassword);
            checkBox=findViewById(R.id.checkBox);
            String nameText=PersonName.getText().toString();
            intent.putExtra(Extra_Name,nameText);
            startActivity(intent);

        }

}