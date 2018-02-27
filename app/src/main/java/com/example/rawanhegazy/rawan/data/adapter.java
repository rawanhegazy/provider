package com.example.rawanhegazy.rawan.data;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.rawanhegazy.rawan.R;


/**
 * Created by rawanhegazy on 25/02/2018.
 */

public class adapter extends CursorAdapter {
    TextView titview,descripview;
    public adapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        return LayoutInflater.from(context).inflate(R.layout.items,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        titview=view.findViewById(R.id.title2);
        descripview=view.findViewById(R.id.description2);
        titview.setText(cursor.getString(1));
        descripview.setText(cursor.getString(2));


    }
}
