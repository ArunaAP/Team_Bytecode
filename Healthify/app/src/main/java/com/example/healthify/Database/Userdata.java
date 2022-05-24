package com.example.healthify.Database;


import android.provider.BaseColumns;

public final class Userdata  {
        // To prevent someone from accidentally instantiating the contract class,
        // make the constructor private.
        private Userdata () {}

        /* Inner class that defines the table contents */
        public static class shapeModels implements BaseColumns {
            public static final String TABLE_NAME = "shapes";
            public static final String COLUMN_NAME_1 = "gender";
            public static final String COLUMN_NAME_2 = "age";
            public static final String COLUMN_NAME_3 = "bust";
            public static final String COLUMN_NAME_4 = "waist";
            public static final String COLUMN_NAME_5 = "hip";
            public static final String COLUMN_NAME_6 = "highHip";
        }
    }

