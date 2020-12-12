package com.example.text5.Khoangthu;


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
public class khoanthuFragment extends Fragment {

    TextView mTextView;


    public khoanthuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_khoanthu, container, false);
        mTextView = view.findViewById(R.id.tvonefragment);
        if (getArguments() != null) {
            mTextView.setText(getArguments().getString("chuoi"));
        }
        return view;
    }

}
