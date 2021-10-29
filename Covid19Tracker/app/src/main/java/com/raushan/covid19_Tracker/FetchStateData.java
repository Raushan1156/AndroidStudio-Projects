package com.raushan.covid19_Tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import com.leo.simplearcloader.SimpleArcLoader;

public class FetchStateData extends AppCompatActivity {

        EditText editText;
        ListView listView;
        SimpleArcLoader simplearcloader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_state_data);
        editText=findViewById(R.id.editText);
        listView=findViewById(R.id.listView);
        simplearcloader=findViewById(R.id.simplearcloader);
    }
}