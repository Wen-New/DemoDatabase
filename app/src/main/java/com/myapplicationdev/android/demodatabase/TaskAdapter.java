package com.myapplicationdev.android.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task> {
    private Context context;
    private ArrayList<Task> tasks;
    private TextView tvID, tvDesc, tvDate;

    public TaskAdapter(Context context,int resource , ArrayList<Task> objects){
        super(context,resource,objects);
        tasks = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tvID = (TextView)rowView.findViewById(R.id.tvID);
        tvDesc = (TextView)rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView)rowView.findViewById(R.id.tvDate);
        Task currentTask = tasks.get(position);
        tvID.setText(currentTask.getId()+"");
        tvDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());

        return rowView;

    }
}
