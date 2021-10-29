package com.raushan.interface1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class g2p extends AppCompatActivity {

    TextView textView;
    EditText dolloramount;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2p);
        textView=findViewById(R.id.textView);
        dolloramount=findViewById(R.id.dolloramount);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(g2p.this, "Successfully Excuted.", Toast.LENGTH_SHORT).show();
                String s=dolloramount.getText().toString();
//                int val=Integer.parseInt(s);
                double val=Double.parseDouble(s);
                double sgpa=(val*10)-.75;
                String gradeval=Double.toString(sgpa);
                textView.setText(gradeval+" %");
            }
        });
    }

    public void btnClick(View view) {
    }

}
