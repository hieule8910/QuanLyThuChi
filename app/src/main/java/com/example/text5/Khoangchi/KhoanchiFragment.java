package com.example.text5.Khoangchi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.text5.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class KhoanchiFragment extends Fragment {

    ViewPager mViewPager;
    TabLayout mTabLayout;

    public KhoanchiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item2, container, false);
        mViewPager = view.findViewById(R.id.viewpager2);
        mTabLayout = view.findViewById(R.id.tablayout2);

        item2Adapter item2Adapter = new item2Adapter(getActivity().getSupportFragmentManager());
        mViewPager.setAdapter(item2Adapter);

        mTabLayout.addTab(mTabLayout.newTab().setText("Khoản Chi"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Loại Chi"));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        return view;
    }

}