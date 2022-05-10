package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class calorie_records extends AppCompatActivity {

   // Button updateCalBtn;
   // Button DeleteCalBtn;

    private ListView listView;

    private Context context;
    private DbhandlerCalorie dbhandlerCalorie;
    private List<CalorieModel> Calories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_records);
        context = this;
        dbhandlerCalorie = new DbhandlerCalorie(context);
        listView = findViewById(R.id.calListview);

        Calories = new ArrayList<>();
        Calories = dbhandlerCalorie.getAllrecords();

        CalorieAdapter adapter = new CalorieAdapter(context, R.layout.single_calorie, Calories);

        listView.setAdapter(adapter);

        /*updateCalBtn = (Button) findViewById(R.id.UpdateCalBtn2);

        updateCalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Upd_cal.class);
                startActivity(intent);
            }
        });*/

/*
        DeleteCalBtn = (Button) findViewById(R.id.DeleteCalBtn);
        DeleteCalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CalorieModel calorieModel = Calories.get(listView.getFirstVisiblePosition());

                dbhandlerCalorie.deleteCalRecord(calorieModel.getId());
                startActivity(new Intent(context,calorie_records.class ));

                //Intent intent = new Intent(getApplicationContext(),calorie_records.class);
                Toast.makeText(getApplicationContext(), "Record Deleted!", Toast.LENGTH_LONG).show();
                //startActivity(intent);
            }
        });
*/




    }

    public void openDeleteToast(View view){
        Intent intent = new Intent(this,calorie_records.class);


        context=this;
        dbhandlerCalorie = new DbhandlerCalorie(context);

        Calories = new ArrayList<>();
        Calories = dbhandlerCalorie.getAllrecords();
        CalorieModel calorieModel;
        calorieModel = Calories.get(listView.getFirstVisiblePosition());

        dbhandlerCalorie.deleteCalRecord(calorieModel.getId());


        Toast.makeText(getApplicationContext(), "Record Deleted!", Toast.LENGTH_LONG).show();

        startActivity(intent);
    }

    public void openUpdateCalorie(View view){

        Intent intent = new Intent(this,uppdate_cal.class);
        CalorieModel calorieModel;
        calorieModel = Calories.get(listView.getFirstVisiblePosition());
        intent.putExtra("id", String.valueOf((calorieModel.getId())));

        startActivity(intent);
    }

}