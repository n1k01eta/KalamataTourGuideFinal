package com.example.android.kalamatatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 29/4/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CityFragment();
            case 1:
                return new MustSeeFragment();
            case 2:
                return new MustDoFragment();
            case 3:
                return new MustEatFragment();
            case 4:
                return new EventsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.city);
            case 1:
                return context.getString(R.string.must_see);
            case 2:
                return context.getString(R.string.must_do);
            case 3:
                return context.getString(R.string.must_eat);
            case 4:
                return context.getString(R.string.events);
            default:
                return null;
        }
    }
}
