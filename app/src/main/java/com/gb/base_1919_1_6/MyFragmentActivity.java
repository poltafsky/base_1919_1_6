package com.gb.base_1919_1_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

public class MyFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null){
            ListNotes listNotes= new ListNotes();
            getSupportFragmentManager().beginTransaction().replace(R.id.list,listNotes).commit();
            if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
                ContentNote contentNote = new ContentNote();
                getSupportFragmentManager().beginTransaction().replace(R.id.content,contentNote);
        }
        }
    }
}