package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;


public class AddBodyMeasures<EditText, ListView, List> extends AppCompatActivity {


    /*EditText et_gender;
    EditText et_age;
    EditText et_bust;
    EditText et_waist;
    EditText et_hip;
    EditText et_highHip;


    int AGE;
    int BUST;
    int WAIST;
    int HIP;
    int  HIGHHIP;


    private ListView listview;
    private java.util.List<ShapeModel>ShapeModel ;
    Context context;
    private DbHandler db;
    private int highHip;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_body_measures);


       /* et_gender = findViewById(R.id.et_gender);
        et_age = findViewById(R.id.et_age);
        et_bust = findViewById(R.id.et_bust);
        et_waist = findViewById(R.id.et_waist);
        et_hip = findViewById(R.id.et_hip);
        et_highHip = findViewById(R.id.et_highHip);*/
    }



    /* context=this;
        db = new DbHandler(context);
        String id = getIntent().getStringExtra("id");
        ShapeModel ft = db.getSingleShapeModel(Integer.parseInt(id)); */

    /* String age = Integer.toString(shape.getAge());
        String bust = Integer.toString(shape.getBust());
        String waist = Integer.toString(shape.getWaist());
        String hip = Integer.toString(shape.getHip());
        String highHip = Integer.toString(shape.getHighHip()); */

    /*et_age.setText(shape.getAge());
      et_bust.setText(shape.getBust());
      et_waist.setText(shape.getWaist());
      et_hip.setText(shape.getHip());
      et_highHip.setText(shape.getHighHip());
      }*/

    public void calcBodyMeasures(View View) {

        Intent intent = new Intent(this, calcBodyMeasures.class);


        /*String gender = et_gender.getClass().toString();
        String age = et_age.getClass().toString();
        String bust = et_bust.getClass().toString();
        String waist = et_waist.getClass().toString();
        String hip = et_hip.getClass().toString();
        String highHip = et_highHip.getClass().toString();


        AGE = Integer.parseInt(age);
        BUST = Integer.parseInt(bust);
        WAIST = Integer.parseInt(waist);
        HIP = Integer.parseInt(hip);
        HIGHHIP = Integer.parseInt(highHip);


        Bodyshape b1 = new Bodyshape(gender, AGE ,BUST, WAIST, HIP, HIGHHIP,AGE);
        String finalResult = b1.calculate();
        String f1 = Double.toString(Double.parseDouble(finalResult));
        String Age = Integer.toString(AGE);
        String Bust = Integer.toString(BUST);
        String Waist = Integer.toString(WAIST);
        String Hip = Integer.toString(HIP);
        String HighHIp = Integer.toString(HIGHHIP);


        // intent.putExtra("final" , f1);


        String date = b1.getDateTime();


        Bundle bundle = null;
        bundle.putString("gender", gender);
        bundle.putString("final", f1);
        bundle.putString("age", Age);
        Bust = null;
        bundle.putString("bust", Bust);
        bundle.putString("waist", Waist);
        bundle.putString("hip", Hip);
        bundle.putString("highHip", HighHIp);

        intent.putExtras(bundle);*/

        startActivity(intent);

    }

}

