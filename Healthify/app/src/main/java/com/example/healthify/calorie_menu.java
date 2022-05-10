package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calorie_menu extends AppCompatActivity {
    private Button calorie_menu_btn1;
    private Button calorie_menu_btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_menu);

        calorie_menu_btn1 = findViewById(R.id.calorie_menu_btn1);
        calorie_menu_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalorieCal();
            }
        });

        calorie_menu_btn2 = findViewById(R.id.calorie_menu_btn2);
        calorie_menu_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalorieRec();
            }
        });
    }
    public void openCalorieCal(){
        Intent intent = new Intent(this, calorie_calculator.class);
        startActivity(intent);
    }
    public void openCalorieRec(){
        Intent intent = new Intent(this, calorie_records.class);
        startActivity(intent);
    }

}