package com.example.sonicviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SonicAdapter extends FragmentPagerAdapter {

    public SonicAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SonicFragment();
            case 1:
                return new KnucklesFragment();
            case 2:
                return new TailsFragment();
            case 3:
                return new ShadowFragment();
            case 4:
                return new SettingsFragment();
        }

            return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
