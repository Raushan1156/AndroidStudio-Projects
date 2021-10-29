package com.raushan.covid19_Tracker;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.models.PieModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class AffectedStates extends AppCompatActivity {

        EditText editText;
        ListView listView;
        SimpleArcLoader simpleArcLoader;

        public static List<State_Model> state_modelList= new ArrayList<>();
        State_Model state_model;
        CustomAdapter custom_adapter;
   // private Object State_Model;

    @Override
        protected void onCreate (Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fetch_state_data);

            editText=findViewById(R.id.editText);
            listView=findViewById(R.id.listView);
            simpleArcLoader=findViewById(R.id.simpleArcLoader);
            getSupportActionBar().setTitle("Affected States");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            
            FetchData();

//            editText.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//                }
//
//                @Override
//                public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//                    custom_adapter.getFilter().filter(s);
//                    custom_adapter.notifyDataSetChanged();
//                }
//
//                @Override
//                public void afterTextChanged(Editable s) {
//
//                }
//            });
        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
                finish();
        return super.onOptionsItemSelected(item);
    }

    private void FetchData() {
        String url="https://corona.lmao.ninja/v2/States/";

        simpleArcLoader.start();
        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        JSONArray jsonArray= null;
                        try {
                            jsonArray = new JSONArray(response);
                            for(int i=0;i<jsonArray.length();i++)
                            {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                String StateName=jsonObject.getString("statecode");

                                String districtData=jsonObject.getString("districtData");

                                String cases=jsonObject.getString("confirmed");
                                String active=jsonObject.getString("active");
                                String death=jsonObject.getString("deceased");
                                String recovered=jsonObject.getString("recovered");

                                JSONObject object=jsonObject.getJSONObject("delta");

                                String todaysCases=jsonObject.getString("confirmed");
                                String todaysDeath=jsonObject.getString("deceased");
                                String todaysRecovery=jsonObject.getString("recovered");

                                state_model =new State_Model(cases,todaysCases,death,todaysDeath,active,recovered,todaysRecovery);
                                state_modelList.add(state_model);
                            }

                            custom_adapter=new CustomAdapter(AffectedStates.this,state_modelList);
                            simpleArcLoader.stop();
                            simpleArcLoader.setVisibility(View.GONE);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(AffectedStates.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }


}
