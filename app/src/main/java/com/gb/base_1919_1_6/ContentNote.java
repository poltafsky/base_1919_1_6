package com.gb.base_1919_1_6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContentNote extends Fragment {

    public static final String ARG_NOTE = "note";

    private Note note;
    public static ContentNote newInstance(Note note) {
        ContentNote fragment = new ContentNote();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NOTE,note);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static ContentNote newInstance() {
        ContentNote fragment = new ContentNote();
        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        note = getArguments().getParcelable(ARG_NOTE);
       String [] notes = getResources().getStringArray(R.array.note);
        ((TextView) view.findViewById(R.id.description)).setText(notes[note.getIndex()]);



    }
}