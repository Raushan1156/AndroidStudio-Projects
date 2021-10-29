package com.raushan.interface1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class p2g extends AppCompatActivity {

    TextView textView;
    EditText percentvalue;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2g);
        textView=findViewById(R.id.textView);
        percentvalue=findViewById(R.id.percentvalue);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(p2g.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
                String s=percentvalue.getText().toString();
//                int val=Integer.parseInt(s);
                double val=Double.parseDouble(s);
                double sgpa;
                if(val<=92)
                    sgpa=(val/10)+.75;
                else
                     sgpa=10.0;
                String gradeval=Double.toString(sgpa);
                textView.setText(gradeval+"  Grade Point");
            }
        });
    }

    public void btnClick(View view) {
    }

}
