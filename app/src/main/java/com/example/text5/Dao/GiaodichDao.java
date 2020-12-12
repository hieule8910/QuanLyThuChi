package com.example.text5.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.example.text5.Database.DatabaseHelper;
import com.example.text5.Model.Giaodich;

import java.util.ArrayList;

public class GiaodichDao {
    SQLiteDatabase mdb;
    DatabaseHelper mHelper;

    public GiaodichDao(Context context){
        mHelper = new DatabaseHelper(context);
        Log.d("Admin", "Context GiaodichDao");
    }

    public void addGiaodich(Giaodich giaodich){
        mdb = mHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idthuchi", giaodich.getIdthuchi());
        contentValues.put("sotien", giaodich.getSotien());
        contentValues.put("ngay", giaodich.getSotien());
        contentValues.put("mota", giaodich.getMota());
        mdb.insert("giaodich", null, contentValues);
        Log.d("Admin", "addGiaodich");
    }

    public ArrayList<Giaodich> showGiaodich(){
        ArrayList<Giaodich> giaodiches = new ArrayList<>();
        mdb = mHelper.getWritableDatabase();
        Cursor data = mdb.rawQuery("select * from giaodich", null);

        data.moveToFirst();
        while (data.moveToNext()) {
            int id = data.getInt(0);
            int idthuchi = data.getInt(1);
            int sotien = data.getInt(2);
            String ngay = data.getString(3);
            String mota = data.getString(4);
            giaodiches.add(new Giaodich(id, idthuchi, sotien, ngay, mota));
        }
        Log.d("Admin", "showArrayList");
        return giaodiches;
    }

    public int updategiaodich(Giaodich giaodich){
        mdb = mHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idthuchi", giaodich.getIdthuchi());
        contentValues.put("sotien", giaodich.getSotien());
        contentValues.put("ngay", giaodich.getNgay());
        contentValues.put("mota", giaodich.getMota());
        return mdb.update("giaodich", contentValues, "ID = ?", new String[]{String.valueOf(giaodich.getIdgd())});
    }

    public int delegiaodich(int id){
        mdb = mHelper.getWritableDatabase();
        return mdb.delete("giaodich", "ID = ?", new String[]{String.valueOf(id)});
    }
}
