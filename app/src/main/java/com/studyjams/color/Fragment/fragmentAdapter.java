package com.studyjams.color.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by lazyeo on 8/8/16.
 */
public class fragmentAdapter extends FragmentStatePagerAdapter {
    public fragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return 24;
    }
    @Override
    public Fragment getItem(int position) {
                return testImg.newInstance(position);
        }
}
