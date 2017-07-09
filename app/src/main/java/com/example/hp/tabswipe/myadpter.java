package com.example.hp.tabswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 3/30/2017.
 */

public class myadpter extends FragmentStatePagerAdapter {
    private int tabcount;

    public myadpter(FragmentManager fm,int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                frag1 f1=new frag1();
                return f1;
            case 1:
                frag1 f2=new frag1();
                return f2;
            case 2:
                frag1 f3=new frag1();
                return f3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
