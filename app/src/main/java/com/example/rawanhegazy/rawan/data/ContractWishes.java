package com.example.rawanhegazy.rawan.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by rawanhegazy on 11/02/2018.
 */

public final class ContractWishes {
   public static final String AUTHORITY ="pro.nanosystem.whishes";
   public static final Uri BASE_URI =Uri.parse("content://"+AUTHORITY);


   public static class MyWishesData implements BaseColumns{
      public static final String TABLE_NAME="myWishes";
      public static final String TITLE="title";
      public static final String DESCRIPTION="description";


      public static final String CREATE_SQL = " create table "+ TABLE_NAME + "( " + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT , " +
              TITLE + " TEXT ," + DESCRIPTION + " TEXT ) ; ";

      public static final String  SQL_DELETE = " DROP TABLE IF EXISTS " + TABLE_NAME;

      public static final Uri CONTENT_URI=Uri.withAppendedPath(BASE_URI,TABLE_NAME);
    }
}
