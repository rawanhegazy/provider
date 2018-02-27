package com.example.rawanhegazy.rawan;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.rawanhegazy.rawan.data.ContractWishes;
import com.example.rawanhegazy.rawan.data.DbHelper;
import com.example.rawanhegazy.rawan.data.adapter;

public class MainActivity extends AppCompatActivity {
    Button addnew;
    ListView list;
    adapter lisadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addnew=findViewById(R.id.addnew);
        addnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opennext=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(opennext);

             DbHelper db = new DbHelper(getApplication().getApplicationContext());
                 SQLiteDatabase qry=db.getReadableDatabase();
       Cursor c= qry.query(ContractWishes.MyWishesData.TABLE_NAME,null,null,
               null,null,null,null,null);
            c.moveToFirst();
            c.getString(1);
            lisadapter=new adapter(getApplication().getApplicationContext(),c);
                list=findViewById(R.id.list);
                list.setAdapter(lisadapter);


            }
        });
    }
}
