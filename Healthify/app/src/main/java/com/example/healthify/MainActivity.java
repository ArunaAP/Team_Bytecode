package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button daily_calary_calculator_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daily_calary_calculator_btn = (Button) findViewById(R.id.daily_calary_calculator_btn);
        daily_calary_calculator_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalorieMenu();
            }
        });

    }
    public void openCalorieMenu(){
        Intent intent = new Intent(this, calorie_menu.class);
        startActivity(intent);
    }



}