package com.example.text5.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String database_name="quanlythuchi";
    public static final String table_name1="giaodich";
    public static final String table_name2="thuchi";
    public static final String table_name3="thuchi_chi";

    public DatabaseHelper(Context context) {
        super(context, database_name, null, 1);
        Log.d("Admin", "create database");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String talbegiaodich = "create table " + table_name1 + " (id integer primary key autoincrement, " +
                " idthuchi integer, sotien integer, ngay text, mota text)";
        db.execSQL(talbegiaodich);

        String tablethuchi = "create table " + table_name2 + " (idthuchi integer primary key autoincrement, " +
                " ten text, loai boolean)";
        db.execSQL(tablethuchi);

        String tablethuchi1 = "create table " + table_name3 + " (idthuchi integer primary key autoincrement, " +
                " ten text, loai boolean)";
        db.execSQL(tablethuchi1);

        Log.d("Admin","oncreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + table_name1);
        db.execSQL("drop table if exists " + table_name2);
        db.execSQL("drop table if exists " + table_name3);
        onCreate(db);
        Log.d("Admin", "onUPgrade");
    }
}
