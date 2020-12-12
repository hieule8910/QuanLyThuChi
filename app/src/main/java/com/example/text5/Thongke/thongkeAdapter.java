package com.example.text5.Thongke;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.text5.Khoangthu.khoanthuFragment;
import com.example.text5.Khoangthu.loaithuFragment;

public class thongkeAdapter extends FragmentStatePagerAdapter {
    public thongkeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Thu oneFragment = new Thu();
                return oneFragment;
            case 1:
                Chi twoFragment = new Chi();
                return twoFragment;

        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
