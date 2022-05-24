package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bodyshapecalculatorhome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyshapecalculatorhome);

    }

    public void addBody(View view) {
        Intent intent = new Intent(this, AddBodyMeasures.class);

        startActivity(intent);
    }


    public void myRecords(View view){
        Intent intent = new Intent(this,myRecords.class);

        startActivity(intent);
    }
}
