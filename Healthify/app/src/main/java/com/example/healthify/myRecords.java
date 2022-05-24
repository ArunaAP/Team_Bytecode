package com.example.healthify;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class myRecords extends AppCompatActivity {


    /*Button deletebtn;
    private View listview;
    private myRecords context;
    private DbHandler db;
    private ArrayList<Object> shapemodel;
    private Object ShapeModel;


    @Override
    public <bodyShapeAdaptor> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_records);

        listview = findViewById(R.id.list_view_id);
        myRecords context = this;
        db = new DbHandler(context);

        shapemodel= new ArrayList<>();
        shapemodel = db.getAllBodyMeasures();
        bodyShapeAdaptor adaptor = new bodyShapeAdaptor(context, R.layout.single_row_shape, context);
        listview.setAdapter(adaptor);
    }
*/

    public void openDeleteToast(View view) {
        Intent intent = new Intent(this, myRecords.class);


        /*context = this;
        DbHandler db = new DbHandler(context);

        ArrayList<Object> ShapeModel = new ArrayList<>();
        ShapeModel = db.getAllBodyShapes();
        ShapeModel shape;
        shape = shapemodel.get(listview.getFirstVisiblePosition());

        db.deleteShapeModels(shape.getId());

        LayoutInflater li = getLayoutInflater();
        View layout = ((LayoutInflater) li).inflate(R.layout.delete_toast, findViewById(R.id.del_tost));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(layout);
        toast.show();*/

        startActivity(intent);
    }
}
















