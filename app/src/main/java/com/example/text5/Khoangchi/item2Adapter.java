package com.example.text5.Khoangchi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class item2Adapter extends FragmentStatePagerAdapter {
    public item2Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                KhoangchiFragment thirdFragment = new KhoangchiFragment();
                Bundle bundle = new Bundle();
                bundle.putString("item2", "Khoản Chi");
                thirdFragment.setArguments(bundle);
                return thirdFragment;
            case 1:
                LoaichiFragment fordFragment = new LoaichiFragment();
                return fordFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
