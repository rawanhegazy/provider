package com.example.rawanhegazy.rawan;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rawanhegazy.rawan.data.ContractWishes;
import com.example.rawanhegazy.rawan.data.DbHelper;

public class Main2Activity extends AppCompatActivity {
     EditText title,description;
     Button save;
     SQLiteDatabase mydb;
     Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        title=findViewById(R.id.title);
        description=findViewById(R.id.description);
        save=findViewById(R.id.save);
        mydb=new DbHelper(this).getWritableDatabase();

        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final ContentValues contentValues=new ContentValues();
                contentValues.put(ContractWishes.MyWishesData.TITLE,title.getText().toString().trim());
                contentValues.put(ContractWishes.MyWishesData.DESCRIPTION,description.getText().toString().trim());
                getContentResolver().insert(ContractWishes.MyWishesData.CONTENT_URI,contentValues);

              //  mydb.insert(ContractWishes.MyWishesData.CREATE_SQL,null,contentValues);

               Toast.makeText(Main2Activity.this, "Done!!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
