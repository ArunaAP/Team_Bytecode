package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDateTime;

public class caloire_result extends AppCompatActivity {

    private Button saveCalrecord;
    TextView resultTxt;
    TextView calAge;
    TextView calHeight;
    TextView calWeight;
    TextView CalDate;

    private DbhandlerCalorie dbhandlerCalorie;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caloire_result);

        saveCalrecord = (Button) findViewById(R.id.saveCalrecord);

        context = this;
        dbhandlerCalorie = new DbhandlerCalorie(context);

        resultTxt = findViewById(R.id.resultTxt);
        calAge = findViewById(R.id.calAge);
        calHeight = findViewById(R.id.calHeight);
        calWeight = findViewById(R.id.calWeight);
        CalDate = findViewById(R.id.CalDate);


        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String result = extras.getString("final");
        String age =extras.getString("AGE");
        String height = extras.getString("HEIGHT");
        String weight = extras.getString("WEIGHT");

        Calorie c1 = new Calorie();
        String date = c1.getDateTime();


        int AGE = Integer.parseInt(age);
        int HEIGHT = Integer.parseInt(height);
        int WEIGHT = Integer.parseInt(weight);


        //String hip = intent.getStringExtra("final");
        //String Age = intent.getStringExtra("AGE");
        //String Height = intent.getStringExtra("HEIGHT");
        //String Weight = intent.getStringExtra("WEIGHT");


        resultTxt.setText(result);
        calAge.setText(age);
        calHeight.setText(height);
        calWeight.setText(weight);
        CalDate.setText(date);

        saveCalrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CalorieModel calorieModel = new CalorieModel(result, AGE, HEIGHT, WEIGHT, date);

                dbhandlerCalorie.addCalorie(calorieModel);

                Toast.makeText(getApplicationContext(), "Record Successfully saved", Toast.LENGTH_LONG).show();
                openCalorieMenu();
            }
        });
    }
    public void openCalorieMenu(){
        Intent intent = new Intent(this, calorie_menu.class);
        startActivity(intent);
    }


}