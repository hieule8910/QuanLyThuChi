package com.example.text5.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.example.text5.Database.DatabaseHelper;
import com.example.text5.Model.Thuchi;

import java.util.ArrayList;

public class ThuchiDao {
    SQLiteDatabase db;
    DatabaseHelper mHelper;

    public ThuchiDao(Context context){
        mHelper = new DatabaseHelper(context);
        Log.d("Admin", "Context thuchiDao");
    }

    public void addthuchi(Thuchi thuchi){
        db = mHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ten", thuchi.getTenthuchi());
        contentValues.put("loai", thuchi.getLoai());
        db.insert("thuchi", null, contentValues);
        Log.d("Admin", "addthuchi");
    }

    public ArrayList<Thuchi> showthu(){
        ArrayList<Thuchi> thuchiArrayList = new ArrayList<>();
        db = mHelper.getWritableDatabase();
        Cursor data = db.rawQuery("select * from thuchi where loai='thu'", null);

        data.moveToFirst();
        while (data.moveToNext()) {
            String id = data.getString(0);
            String ten = data.getString(1);
            String  loai = data.getString(2);
            thuchiArrayList.add(new Thuchi(id, ten , loai));
        }
        Log.d("Admin", "show thuchi");
        return thuchiArrayList;
    }
    public ArrayList<Thuchi> showchi(){
        ArrayList<Thuchi> thuchiArrayList = new ArrayList<>();
        db = mHelper.getWritableDatabase();
        Cursor data = db.rawQuery("select * from thuchi where loai='chi'", null);

        data.moveToFirst();
        while (data.moveToNext()) {
            String id = data.getString(0);
            String ten = data.getString(1);
            String  loai = data.getString(2);
            thuchiArrayList.add(new Thuchi(id, ten , loai));
        }
        Log.d("Admin", "show thuchi");
        return thuchiArrayList;
    }

    public boolean updateData(Thuchi thuchi){
        db = mHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idthuchi", thuchi.getIdthuchi());
        contentValues.put("ten", thuchi.getTenthuchi());
        contentValues.put("loai", thuchi.getLoai());
        db.update("thuchi", contentValues, "ID = ?", new String[] {thuchi.getIdthuchi()});
        return true;
    }

    public Integer deleteData(String id){
        db = mHelper.getWritableDatabase();
        return db.delete("thuchi", "ID = ?", new String[] {id});
    }
}
