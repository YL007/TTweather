package com.example.ttweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 磊 on 2017/1/3.
 */

public class TTweatherOpenHelper extends SQLiteOpenHelper{
    //Province(省)
    public static final String CREATE_PROVINCE = "create table Province("
        +"id integer primary key autoincrement,"
        +"province_name text,"
        +"province_code text)";
    //City（市）
    public static final String CREATE_CITY = "create table city("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";

    //County(县)
    public static final String CREATE_COUNTY = "create table county("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";

    public TTweatherOpenHelper(Context context, String name,
                               SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);    //创建Province表
        db.execSQL(CREATE_CITY);    //创建City表
        db.execSQL(CREATE_COUNTY);  //创建County表
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
