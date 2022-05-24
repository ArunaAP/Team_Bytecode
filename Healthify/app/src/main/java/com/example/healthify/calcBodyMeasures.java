package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class calcBodyMeasures extends AppCompatActivity {

   /* TextView result;
    Context context;
    DbHandler db;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_body_measures);

        /*result = findViewById(R.id.shapeStr);

        Intent intent = getIntent();


        Bundle bundle = intent.getExtras();

        String FinalResult = bundle.getString("final");
        String gender = bundle.getString("gender");
        String age = bundle.getString("age");
        String bust = bundle.getString("bust");
        String waist = bundle.getString("waist");
        String hip = bundle.getString("hip");
        String highHip = bundle.getString("highHip");

        Bodyshape b1 = new Bodyshape();
        String date = b1.getDateTime();
        result.setText(FinalResult);

        int AGE = Integer.parseInt(age);
        int BUST = Integer.parseInt(bust);
        int WAIST = Integer.parseInt(waist);
        int HIP = Integer.parseInt(hip);
        int HIGHHIP = Integer.parseInt(highHip);

        context = this;
        db = new DbHandler(context);

        BUST = 0;
        HIGHHIP = 0;
        ShapeModel shapeModel = new ShapeModel(FinalResult, AGE, BUST, WAIST, HIP, HIGHHIP, date);
        db.AddBodyShape(shapeModel);


    }*/

        public void results(View View ){
            Intent intent = new Intent(this, results.class);

            startActivity(intent);
        }
    }

}

