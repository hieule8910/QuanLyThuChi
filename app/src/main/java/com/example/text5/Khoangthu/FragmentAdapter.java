package com.example.text5.Khoangthu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentAdapter extends FragmentStatePagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                khoanthuFragment oneFragment = new khoanthuFragment();
                Bundle bundle = new Bundle();
                bundle.putString("chuoi", "Khoản thu");
                oneFragment.setArguments(bundle);
                return oneFragment;
            case 1:
                loaithuFragment twoFragment = new loaithuFragment();
                return twoFragment;

        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
