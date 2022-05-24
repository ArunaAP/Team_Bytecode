package com.example.healthify.Bodyshape;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.healthify.R;
import com.example.healthify.ShapeModel;

import java.util.List;

    public class bodyFatAdaptor extends ArrayAdapter<ShapeModel> {


        Context context;
        private int resource;
        List<ShapeModel> shapeModels;

        bodyFatAdaptor(Context context , int resource , List<ShapeModel> fatModels ){
            super(context , resource , fatModels);

            this.context = context;
            this.resource = resource;
            this.shapeModels = shapeModels;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View row = inflater.inflate(resource,parent,false);



            TextView Age = row.findViewById(R.id.textView12);
            TextView Height = row.findViewById(R.id.textView13);
            TextView Neck = row.findViewById(R.id.textView14);
            TextView Waist = row.findViewById(R.id.textView15);
            TextView Hip = row.findViewById(R.id.textView16);
            TextView Weight = row.findViewById(R.id.textView17);
            TextView date = row.findViewById(R.id.result_txt2);
            TextView result = row.findViewById(R.id.result_txt);


            ShapeModel shapeModel = shapeModels.get(position);

            String age = Integer.toString(shapeModel.getAge());
            String bust = Integer.toString(shapeModel.getBust());
            String waist = Integer.toString(shapeModel.getWaist());
            String hip = Integer.toString(shapeModel.getHip());
            String highHip = Integer.toString(shapeModel.getHighhip());

            Age.setText(age);
            Bust.setText(bust);
            Waist.setText(waist);
            Hip.setText(hip);
            HighHip.setText(highHip);
            date.setText(shapeModel.getDate());
            result.setText(shapeModel.getResult());


            return row;

        }
    }


}
