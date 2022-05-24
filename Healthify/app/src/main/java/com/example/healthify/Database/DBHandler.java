package com.example.healthify.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "userResults.db";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }


    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Userdata.shapeModels.TABLE_NAME + " (" +
                    Userdata.shapeModels._ID + " INTEGER PRIMARY KEY," +
                    Userdata.shapeModels.COLUMN_NAME_1 + " TEXT," +
                    Userdata.shapeModels.COLUMN_NAME_2 + " TEXT," +
                    Userdata.shapeModels.COLUMN_NAME_3 + " TEXT," +
                    Userdata.shapeModels.COLUMN_NAME_4 + " TEXT," +
                    Userdata.shapeModels.COLUMN_NAME_5 + " TEXT," +
                    Userdata.shapeModels.COLUMN_NAME_6 + " TEXT)";


    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Userdata.shapeModels.TABLE_NAME;


    //Add Function
    public long addInfo(String gender, String age, String bust, String waist, String hip, String highHip) {

        // Gets the data repository in write mode
        SQLiteDatabase db = getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Userdata.shapeModels.COLUMN_NAME_1, gender);
        values.put(Userdata.shapeModels.COLUMN_NAME_2, age);
        values.put(Userdata.shapeModels.COLUMN_NAME_3, bust);
        values.put(Userdata.shapeModels.COLUMN_NAME_4, waist);
        values.put(Userdata.shapeModels.COLUMN_NAME_5, hip);
        values.put(Userdata.shapeModels.COLUMN_NAME_6, highHip);


        values.put(Userdata.shapeModels.COLUMN_NAME_1, gender);

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(Userdata.shapeModels.TABLE_NAME, null, values);
        return newRowId;
    }


    public Boolean updateInfo(String gender, String age, String bust, String waist, String hip, String highHip) {
        SQLiteDatabase db = getWritableDatabase();

// New value for one column
        String title = "MyNewTitle";
        ContentValues values = new ContentValues();
        values.put(Userdata.shapeModels.COLUMN_NAME_1, gender);
        values.put(Userdata.shapeModels.COLUMN_NAME_2, age);
        values.put(Userdata.shapeModels.COLUMN_NAME_3, bust);
        values.put(Userdata.shapeModels.COLUMN_NAME_4, waist);
        values.put(Userdata.shapeModels.COLUMN_NAME_5, hip);
        values.put(Userdata.shapeModels.COLUMN_NAME_6, highHip);

// Which row to update, based on the title
        String selection = Userdata.shapeModels.COLUMN_NAME_1 + " LIKE ?";
        String[] selectionArgs = {"gender"};

        int count = db.update(
                Userdata.shapeModels.TABLE_NAME,
                values,
                selection,
                selectionArgs);

        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }


public void delInfo( String gender){

    SQLiteDatabase db = getWritableDatabase();

    // Define 'where' part of query.
    String selection =Userdata.shapeModels.COLUMN_NAME_1 + "  ?";
// Specify arguments in placeholder order.
    String[] selectionArgs = { "gender" };
// Issue SQL statement.
    int deletedRows = db.delete(Userdata.shapeModels.TABLE_NAME, selection, selectionArgs);
}

public  List readInfo(String gender){

    gender = "female";
    SQLiteDatabase db = getReadableDatabase();

// Define a projection that specifies which columns from the database
// you will actually use after this query.
    String[] projection = {
            BaseColumns._ID,
            Userdata.shapeModels.COLUMN_NAME_1,
            Userdata.shapeModels.COLUMN_NAME_2,
            Userdata.shapeModels.COLUMN_NAME_3,
            Userdata.shapeModels.COLUMN_NAME_4,
            Userdata.shapeModels.COLUMN_NAME_5,
            Userdata.shapeModels.COLUMN_NAME_6,
    };

// Filter results WHERE "title" = 'My Title'
    String selection = Userdata.shapeModels.COLUMN_NAME_1 + "LIKE = ?";
    String[] selectionArgs = { "gender" };

// How you want the results sorted in the resulting Cursor
    String sortOrder =
            Userdata.shapeModels.COLUMN_NAME_1 + " ASC";

    Cursor cursor = db.query(
           Userdata.shapeModels .TABLE_NAME,   // The table to query
            null,             // The array of columns to return (pass null to get all)
             null ,              // The columns for the WHERE clause
            null,          // The values for the WHERE clause
            null,                   // don't group the rows
            null,                   // don't filter by row groups
            sortOrder               // The sort order
    );

    List gender = new ArrayList<>();
    while(cursor.moveToNext()) {
        long shapes = cursor.getLong(
                cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_1));
        gender.add(shapes);
    }
    cursor.close();
    return gender;
}



    public  List readInfo(){

        String gender = "male";
        SQLiteDatabase db = getReadableDatabase();

// Define a projection that specifies which columns from the database
// you will actually use after this query.
        String[] projection = {
                BaseColumns._ID,
                Userdata.shapeModels.COLUMN_NAME_1,
                Userdata.shapeModels.COLUMN_NAME_2,
                Userdata.shapeModels.COLUMN_NAME_3,
                Userdata.shapeModels.COLUMN_NAME_4,
                Userdata.shapeModels.COLUMN_NAME_5,
                Userdata.shapeModels.COLUMN_NAME_6,
        };

// Filter results WHERE "title" = 'My Title'
        String selection = Userdata.shapeModels.COLUMN_NAME_1 + " = LIKE?";
        String[] selectionArgs = { "gender" };

// How you want the results sorted in the resulting Cursor
        String sortOrder =
                Userdata.shapeModels.COLUMN_NAME_1 + " ASC";

        Cursor cursor = db.query(
                Userdata.shapeModels .TABLE_NAME,   // The table to query
                null,             // The array of columns to return (pass null to get all)
                selection,              // The columns for the WHERE clause
                selectionArgs ,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                sortOrder               // The sort order
        );

        List userInfo = new ArrayList<>();
        while(cursor.moveToNext()) {
            gender = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_1));
            String age = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_2));
            String bust = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_3));
            String waist = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_4));
            String hip = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_5));
            String highHip = cursor.getString(cursor.getColumnIndexOrThrow(Userdata.shapeModels.COLUMN_NAME_6));
            userInfo.add(gender);
            userInfo.add(age);
            userInfo.add(bust);
            userInfo.add(waist);
            userInfo.add(hip);
            userInfo.add(highHip);
        }
        cursor.close();
        return userInfo;
    }


}
