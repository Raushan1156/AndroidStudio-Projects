package com.raushan.covid19_Tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<State_Model> {

    private Context context;
    private List<State_Model> State_Model_List;

    public CustomAdapter( Context context,List<State_Model> State_Model_List) {
        super(context, R.layout.list_custom_item);
        this.context=context;
        this.State_Model_List=State_Model_List;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_custom_item,null,true);
        TextView tvStateName=view.findViewById(R.id.tvStateName);
        tvStateName.setText(State_Model_List.get(position).getState());
        return view;
    }
}
