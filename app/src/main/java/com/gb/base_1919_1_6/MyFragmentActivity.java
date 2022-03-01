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
            ListNotes listNotes=ListNotes.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.list,listNotes).commit();
            if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
                Note defaulNote = new Note("note #1",R.array.notes_description);
                ContentNote contentNote = ContentNote.newInstance(defaulNote);
                getSupportFragmentManager().beginTransaction().replace(R.id.content,contentNote).commit();
        }
        }
    }
}