package com.example.healthify;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

        import java.util.ArrayList;

/*class DbHandler extends SQLiteOpenHelper {
    public static final int VERSION = 1;
    public static final String DB_NAME = "results";
    public static final String TABLE_NAME = "BodyShape";


    public static final String ID = "id";
    public static final String RESULT = "result";
    public static final String AGE = "age";
    public static final String BUST = "bust";
    public static final String WAIST = "waist";
    public static final String HIP = "hip";
    public static final String HIGHHIP = "highhip";
    public static final String DATE = "date";


    public DbHandler(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String TABLE_CREATE_QUERY = "CREATE TABLE " + TABLE_NAME + " " +
                "("
                + ID + "INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + RESULT + "TEXT ,"
                + AGE + "INTEGER ,"
                + BUST + "INTEGER ,"
                + WAIST + "INTEGER ,"
                + HIP + "INTEGER ,"
                + HIGHHIP + "INTEGER ,"
                + DATE + "TEXT" +
                ");";


        sqLiteDatabase.execSQL(TABLE_CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String TABLE_CREATE_QUERY = "DROP TABLE IF EXISTS " + TABLE_NAME;
        sqLiteDatabase.execSQL(TABLE_CREATE_QUERY);
        onCreate(sqLiteDatabase);
    }

    public void AddBodyShape(ShapeModel ShapeModel) {
        SQLiteDatabase sql = getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(RESULT, ShapeModel.getResult());
        contentValues.put(AGE, ShapeModel.getAge());
        contentValues.put(BUST, ShapeModel.getBust());
        contentValues.put(WAIST, ShapeModel.getWaist());
        contentValues.put(HIP, com.example.healthify.ShapeModel.getHip());
        contentValues.put(HIGHHIP, ShapeModel.getHighhip());
        contentValues.put(DATE, ShapeModel.getDate());

        sql.insert(TABLE_NAME, null, contentValues);
        sql.close();

    }

    public ArrayList<Object> getAllBodyMeasures() {
        return null;
    }

    public Object getAllBodyShapes() {
        return null;
    }


    public <List> List<ShapeModel> getAllBodyShapes() {

        java.util.List<ShapeModel> fatModels = new ArrayList();
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;

        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            do {
                ShapeModel shapeModel = new ShapeModel();

                shapeModel.setId(cursor.getInt(0));
                shapeModel.setResult(cursor.getString(1));
                shapeModel.setAge(cursor.getInt(2));
                shapeModel.setBust(cursor.getInt(3));
                shapeModel.setWeist(cursor.getInt(4));
                shapeModel.setHip(cursor.getInt(5));
                shapeModel.setHighhip(cursor.getInt(6));
                shapeModel.setDate(cursor.getString(8));

                ((ArrayList<?>) shapeModel).add(shapeModel);
            } while (cursor.moveToNext());
        }
        return shapeModels();
    }

    private <List> void shapeModels() {
    }

    public void deleteShapeModels(int id) {
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_NAME, "id =?", new String[]{String.valueOf(id)});
        db.close();
    }

    public void getSingleShapeModel(int id) {
        SQLiteDatabase db = getWritableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[]{ID, RESULT, AGE, BUST, WAIST, HIP, HIGHHIP, DATE}, ID + "= ?",
                new String[]{String.valueOf(id)}, null, null, null);

        ShapeModel shape;
        if (cursor != null) {

            shape = new ShapeModel(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getInt(2),
                    cursor.getInt(3),
                    cursor.getInt(4),
                    cursor.getInt(5),
                    cursor.getInt(6),
                    cursor.getString(8)

            );

        }
    }*/


















