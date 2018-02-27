package com.example.rawanhegazy.rawan.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by rawanhegazy on 11/02/2018.
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="mywishes.db";
    public static final int VERSION=1;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(ContractWishes.MyWishesData.CREATE_SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ContractWishes.MyWishesData.SQL_DELETE);

    }
}
