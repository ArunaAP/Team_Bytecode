package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class uppdate_cal extends AppCompatActivity {

    //EditText calGen;
    EditText calAge;
    EditText calHeight;
    EditText calWeight;

    Button updateCalBTN;

    //ListView listView;
    //List<CalorieModel> Calories;
    Context context;
    DbhandlerCalorie dbhandlerCalorie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uppdate_cal);

        //calGen = findViewById(R.id.calGen);
        calAge = findViewById(R.id.calAge);
        calHeight = findViewById(R.id.calHeight);
        calWeight = findViewById(R.id.calWeight);

        updateCalBTN = findViewById(R.id.updateCalBTN);

        context=this;
        dbhandlerCalorie = new DbhandlerCalorie(context);
        String id = getIntent().getStringExtra("id");

        CalorieModel calorieModel = dbhandlerCalorie.getSingleCalorie(Integer.parseInt(id));


        String age = Integer.toString(calorieModel.getAge());
        String height = Integer.toString(calorieModel.getHeight());
        String weight = Integer.toString(calorieModel.getWeight());

        //calAge.setText(age);
       // calHeight.setText(height);
        //calWeight.setText(weight);

        //update = findViewById(R.id.updateCalBTN);

    }
}