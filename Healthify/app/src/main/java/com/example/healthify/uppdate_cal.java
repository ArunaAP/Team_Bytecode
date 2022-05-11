package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class uppdate_cal extends AppCompatActivity {

    //EditText calGen;
    EditText calage;
    EditText calheight;
    EditText calweight;

    Button updateCalBTN;

    //ListView listView;
    //List<CalorieModel> Calories;
    Context context;
    DbhandlerCalorie dbhandlerCalorie;

    int AGE;
    int HEIGHT;
    int WEIGHT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uppdate_cal);

        //calGen = findViewById(R.id.calGen);
        calage = findViewById(R.id.calage);
        calheight = findViewById(R.id.calheight);
        calweight = findViewById(R.id.calweight);

        //updateCalBTN = findViewById(R.id.updtbtn);

        context=this;
        dbhandlerCalorie = new DbhandlerCalorie(context);
        String id = getIntent().getStringExtra("id");

         CalorieModel calorieModel = dbhandlerCalorie.getSingleCalorie(Integer.parseInt(id));


        String age = Integer.toString(calorieModel.getAge());
        String height = Integer.toString(calorieModel.getHeight());
        String weight = Integer.toString(calorieModel.getWeight());

        calage.setText(age);
        calheight.setText(height);
        calweight.setText(weight);

        //update = findViewById(R.id.updateCalBTN);

    }

    public void UpdatecalorieCal(View view){
        Intent intent = new Intent(this, calorie_records.class);

        String update_age = calage.getText().toString();
        String update_height = calheight.getText().toString();
        String update_weight = calweight.getText().toString();


        AGE = Integer.parseInt(update_age);
        HEIGHT = Integer.parseInt(update_height);
        WEIGHT = Integer.parseInt(update_weight);

        Calorie c1 = new Calorie(AGE, HEIGHT, WEIGHT);
        double finalResult = c1.calculateCalorie();
        String update_result = Double.toString(finalResult);

        String id = getIntent().getStringExtra("id");
        String date = c1.getDateTime();

        CalorieModel calorieModel = new CalorieModel(Integer.parseInt(id),update_result,AGE, HEIGHT, WEIGHT,date);
        context=this;
        dbhandlerCalorie = new DbhandlerCalorie(context);
        dbhandlerCalorie.updateSingleCalorie(calorieModel);

        Toast.makeText(getApplicationContext(), "Record Updated!", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}