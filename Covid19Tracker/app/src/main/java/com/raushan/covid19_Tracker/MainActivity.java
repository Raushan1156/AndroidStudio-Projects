package com.raushan.covid19_Tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView tvTotalCases,tvActive,tvRecovered,tvDeath,tvTodaysRecovery,tvTodaysCase,tvTodaysDeath,tvFullyVaccinated;
    SimpleArcLoader simpleArcLoader;
    ScrollView scrollView;
    PieChart piechart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTotalCases=findViewById(R.id.tvTotalCases);
        tvActive=findViewById(R.id.tvActive);
        tvRecovered=findViewById(R.id.tvRecovered);
        tvDeath=findViewById(R.id.tvDeath);

        tvTodaysRecovery=findViewById(R.id.tvTodaysRecovery);
        tvTodaysCase=findViewById(R.id.tvTodaysCase);
        tvTodaysDeath=findViewById(R.id.tvTodaysDeath);
        tvFullyVaccinated=findViewById(R.id.tvFullyVaccinated);

        simpleArcLoader=findViewById(R.id.simpleArcLoader);
        scrollView=findViewById(R.id.scrollView);
        piechart=findViewById(R.id.piechart);
        
        FetchData();

    }

    private void FetchData() {
    String url="https://corona.lmao.ninja/v2/all/";

    simpleArcLoader.start();
        StringRequest request=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject= new JSONObject(response.toString());
                            tvTotalCases.setText(jsonObject.getString("cases"));
                            tvActive.setText(jsonObject.getString("active"));
                            tvRecovered.setText(jsonObject.getString("recovered"));
                            tvDeath.setText(jsonObject.getString("deaths"));
                            tvTodaysRecovery.setText(jsonObject.getString("todaysRecovery"));
                            tvTodaysDeath.setText(jsonObject.getString("todaysDeath"));
                            tvTodaysCase.setText(jsonObject.getString("todaysCase"));


                            piechart.addPieSlice(new PieModel("active",Integer.parseInt(tvActive.getText().toString()), Color.parseColor("#29B6F6")));
                            piechart.addPieSlice(new PieModel("deaths",Integer.parseInt(tvDeath.getText().toString()), Color.parseColor("#EF5350")));
                            piechart.addPieSlice(new PieModel("recovered",Integer.parseInt(tvRecovered.getText().toString()), Color.parseColor("#66BB6A")));
                            piechart.startAnimation();


                            simpleArcLoader.stop();
                            simpleArcLoader.setVisibility(View.GONE);
                            scrollView.setVisibility(View.VISIBLE);
                        }

                        catch (JSONException e) {
                            e.printStackTrace();
                            simpleArcLoader.stop();
                            simpleArcLoader.setVisibility(View.GONE);
                            scrollView.setVisibility(View.VISIBLE);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                simpleArcLoader.stop();
                simpleArcLoader.setVisibility(View.GONE);
                scrollView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    public void goTrackStates(View view)
    {
        startActivity(new Intent(getApplicationContext(),AffectedStates.class));
    }
}