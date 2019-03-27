package com.example.tabnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class MyPageradapter extends FragmentStatePagerAdapter {
    int myTabCount;
    public MyPageradapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myTabCount=tabCount;

    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new BlankFragment();
            case 1:
                return new BlankFragment2();
            case 2:
                return new BlankFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return myTabCount;
    }
}
