package com.example.text5.Khoangchi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.text5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KhoangchiFragment extends Fragment {

    TextView mTextView;

    public KhoangchiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.khoangchi, container, false);
        mTextView = view.findViewById(R.id.tvthirdfragment);
        if (getArguments() != null) {
            mTextView.setText(getArguments().getString("item2"));
        }
        return view;
    }

}
