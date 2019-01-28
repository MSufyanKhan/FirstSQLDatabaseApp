package com.example.firstsqldatabaseapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databaselper extends SQLiteOpenHelper {
    public static final String Database_name = "Student.db";
    public static final String TABLE_NAME = "Student_table";
    public static final String col1 = "ID";
    public static final String col2 = "NAME";
    public static final String col3 = "SURNAME";
    public static final String col14 = "MARKS";





    public Databaselper(Context context) {
        super(context, Database_name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table  " +TABLE_NAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("Drop Table if exists " +TABLE_NAME);
        onCreate(db);
    }
}
