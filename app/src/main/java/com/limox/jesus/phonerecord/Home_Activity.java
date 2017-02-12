package com.limox.jesus.phonerecord;

import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.limox.jesus.phonerecord.Adapter.RecordAdapter;
import com.limox.jesus.phonerecord.Provider.RecordContrat;

public class Home_Activity extends AppCompatActivity {

    private FloatingActionButton mFab;
    private RecordAdapter mAdapter;
    private ListView mLvRecords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mLvRecords = (ListView) findViewById(R.id.listview);
        mAdapter = new RecordAdapter(this,null,0);
        mLvRecords.setAdapter(mAdapter);
        changeCursor();
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeCursor();
            }
        });
    }

    private void changeCursor(){

        Cursor cursor = getContentResolver().query(RecordContrat.Record.CONTENT_URI, RecordContrat.Record.PROJECTION,null,null,null,null);
        mAdapter.changeCursor(cursor);
//        mLvRecords.setAdapter(mAdapter);
        if (cursor != null) {
          //  cursor.close();
        }
    }


}
