package com.example.healthify;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.lights.LightState;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DbhandlerCalorie extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DB_NAME = "colorizeDb";
    private static final String TABLE_NAME = "colorieDb";

    private static final String ID = "id";
    private static final String RESULT = "result";
    private static final String AGE = "age";
    private static final String HEIGHT = "height";
    private static final String WEIGHT = "weight";
    private static final String DATE = "date";


    public DbhandlerCalorie(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String TABLE_CREATE_QUERY = "CREATE TABLE "+TABLE_NAME+""+
                "("
                +ID+" INTEGER PRIMARY KEY  AUTOINCREMENT, "
                +RESULT+ " TEXT, "
                +AGE+ " INTEGER, "
                +HEIGHT+ " INTEGER, "
                +WEIGHT+ " INTEGER, "
                +DATE+ " TEXT" +
                ");";

        db.execSQL(TABLE_CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String DROP_TABLE_QUERY = "DROP TABLE IF EXISTS "+ TABLE_NAME;
        db.execSQL(DROP_TABLE_QUERY);
        onCreate(db);
    }

    public void addCalorie(CalorieModel calorieModel){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        ContentValues contentValues = new ContentValues();

        contentValues.put(RESULT, calorieModel.getResult());
        contentValues.put(AGE, calorieModel.getAge());
        contentValues.put(HEIGHT, calorieModel.getHeight());
        contentValues.put(WEIGHT, calorieModel.getWeight());
        contentValues.put(DATE, calorieModel.getDate());

        sqLiteDatabase.insert(TABLE_NAME,null,contentValues);

        sqLiteDatabase.close();
    }

    public List<CalorieModel> getAllrecords(){
        List<CalorieModel> Calories = new ArrayList();
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT * FROM "+TABLE_NAME;

        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do {
                CalorieModel calorieModel = new CalorieModel();

                calorieModel.setId(cursor.getInt(0));
                calorieModel.setResult(cursor.getString(1));
                calorieModel.setAge(cursor.getInt(2));
                calorieModel.setHeight(cursor.getInt(3));
                calorieModel.setWeight(cursor.getInt(4));
                calorieModel.setDate(cursor.getString(5));

                Calories.add(calorieModel);
            }while (cursor.moveToNext());
        }
        return Calories;
    }

    //delete record
    public void deleteCalRecord(int id){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, ID + " =?", new String[]{String.valueOf(id)});
        db.close();

    }

    //getSingle data
    public CalorieModel getSingleCalorie(int id){
        SQLiteDatabase db = getWritableDatabase();

        Cursor cursor = db.query(TABLE_NAME,new String[]{ID,RESULT,AGE,HEIGHT,WEIGHT,DATE},ID + "= ?",
                new String[]{String.valueOf(id)},null,null,null);

        CalorieModel calorieModel;
        if(cursor != null){
            cursor.moveToFirst();

            calorieModel = new CalorieModel(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getInt(2),
                    cursor.getInt(3),
                    cursor.getInt(4),
                    cursor.getString(5)
            );
            return calorieModel;
        }
        return null;
    }

    public int updateSingleCalorie(CalorieModel calorieModel){
        SQLiteDatabase sql = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(RESULT, calorieModel.getResult());
        contentValues.put(AGE, calorieModel.getAge());
        contentValues.put(HEIGHT, calorieModel.getHeight());
        contentValues.put(WEIGHT, calorieModel.getWeight());
        contentValues.put(DATE, calorieModel.getDate());

        int status = sql.update(TABLE_NAME,contentValues,ID +" =?",
                new String[]{String.valueOf(calorieModel.getId())});

        sql.close();
        return status;
    }

}
