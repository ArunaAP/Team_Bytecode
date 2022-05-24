package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.healthify.Database.DBHandler;

public class MainActivity extends AppCompatActivity {

    private Button body_shape_cal_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        body_shape_cal_btn = (Button) findViewById(R.id.body_shape_cal_btn);
        body_shape_cal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBodyMeasures();
            }
        });

    }

    public void openBodyMeasures() {
        Intent intent = new Intent(this, bodyshapecalculatorhome.class);
        startActivity(intent);
    }


    EditText gender,age,bust,waist,hip,highHip;
    Button Add;
    RadioButton male,female;



        gender=    (R.id.gender);
        age=findViewById(R.id.age);
        bust=findViewById(R.id.bustbtn);
        waist=findViewById(R.id.waistbtn);
        hip=findViewById(R.id.hipbtn);
        highHip=findViewById(R.id.highHipval);
        male=findViewById(R.id.malebtnn);
        female=findViewById(R.id.femalebtnn);

        //ADD Functionnn

        Add.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        if (male.isChecked()) {

            gender = "male";
        } else {

            Lisen = "No";
        }
        DBHandler dbHandler = new DBHandler(getApp licationContext());
        long newID = dbHandler.addInfo(gender.getText().toString(), age.getText().toString(), bust.getText().toString(), waist.getText().toString(), hip.getText().toString(), highHip.getText().toString());
        Toast.makeText(MainActivity.this, "Delivery Person Added. Delivery ID: " + newID, Toast.LENGTH_SHORT).show();

        Intent i = new Intent(getApplicationContext(), delInfo.class);
        startActivity(i);
    }
    }
}



