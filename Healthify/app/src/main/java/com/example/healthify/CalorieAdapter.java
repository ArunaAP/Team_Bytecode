package com.example.healthify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CalorieAdapter extends ArrayAdapter<CalorieModel> {

    private Context context;
    private int resource;
    List<CalorieModel> Calories;

    CalorieAdapter(Context context, int resource, List<CalorieModel> Calories){
        super(context, resource, Calories);
        this.context = context;
        this.resource = resource;
        this.Calories = Calories;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(resource, parent, false);

        TextView date = row.findViewById(R.id.date);
        TextView result = row.findViewById(R.id.result);
        TextView age = row.findViewById(R.id.age);
        TextView height = row.findViewById(R.id.height);
        TextView weight = row.findViewById(R.id.weight);



        //Calories [obj1,obj2,obj3]
        CalorieModel calorieModel = Calories.get(position);
        String AGE = Integer.toString(calorieModel.getAge());
        String HEIGHT = Integer.toString(calorieModel.getHeight());
        String WEIGHT = Integer.toString(calorieModel.getWeight());

        date.setText(calorieModel.getDate());
        result.setText(calorieModel.getResult());
        age.setText(AGE);
        height.setText(HEIGHT);
        weight.setText(WEIGHT);



        return row;
    }
}
