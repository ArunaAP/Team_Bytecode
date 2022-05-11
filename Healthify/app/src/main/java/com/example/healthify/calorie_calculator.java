package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calorie_calculator extends AppCompatActivity {

    private Button CalCalculateBtn;
    //RadioButton RadioGender;
    EditText et_age;
    EditText et_height;
    EditText et_weight;


    String GENDER;
    int AGE;
    int HEIGHT;
    int WEIGHT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);

        //RadioGender = findViewById(R.id.RadioGender);
        et_age = findViewById(R.id.et_age);
        et_height = findViewById(R.id.calheight);
        et_weight = findViewById(R.id.calweight);


        CalCalculateBtn = (Button) findViewById(R.id.UpdateCalBtn2);
        CalCalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalresult();

            }
        });

    }


    public void openCalresult(){
        Intent intent = new Intent(this, caloire_result.class);

        //String Gender = RadioGender.getText().toString();
        String age = et_age.getText().toString();
        String height = et_height.getText().toString();
        String weight = et_weight.getText().toString();


        AGE = Integer.parseInt(age);
        HEIGHT = Integer.parseInt(height);
        WEIGHT = Integer.parseInt(weight);

        Calorie c1 = new Calorie(GENDER,AGE,HEIGHT,WEIGHT);
        double finalResult =  c1.calculateCalorie();
        String f1 = Double.toString(finalResult);
        String Age = Integer.toString(AGE);
        String Height = Integer.toString(HEIGHT);
        String Weight = Integer.toString(WEIGHT);


        Bundle extras = new Bundle();

        extras.putString("final", f1);
        extras.putString("AGE", Age);
        extras.putString("HEIGHT", Height);
        extras.putString("WEIGHT", Weight);

        intent.putExtras(extras);


        //intent.putExtra("final" , f1);
        //intent.putExtra("AGE",age);
        //intent.putExtra("HEIGHT", height);
        //intent.putExtra("WEIGHT", weight);



        startActivity(intent);
    }


}