package com.example.text5.Thongke;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.text5.Khoangthu.FragmentAdapter;
import com.example.text5.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThongkeFragment extends Fragment {

    ViewPager mViewPager;
    TabLayout mTabLayout;

    public ThongkeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item3, container, false);

        mViewPager = view.findViewById(R.id.viewpager3);
        mTabLayout = view.findViewById(R.id.tablayout3);

        thongkeAdapter fragmentAdapter = new thongkeAdapter(getActivity().getSupportFragmentManager());
        mViewPager.setAdapter(fragmentAdapter);

        mTabLayout.addTab(mTabLayout.newTab().setText("Thu"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Chi"));

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
