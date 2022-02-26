package com.gb.base_1919_1_6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContentNote extends Fragment {

    public static final String ARG_NOTES = "notes";
    private Notes notes;

    public static ContentNote newInstance(Notes notes) {
        ContentNote fragment = new ContentNote();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NOTES,notes);
        fragment.setArguments(bundle);
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
       notes = getArguments().getParcelable(ARG_NOTES);
       view.findViewById()

    }
}