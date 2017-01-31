package com.example.android.tourmoreliaapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Paviliondm4 on 1/27/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

   private Context context;

    /*Public constructor of the FragmentPager adapter*
    @Fragment manager
    @nContext in order to access the string titles from resources file
     */
    public SimpleFragmentPagerAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
    }

    // Method that gets the position from the TabLayout index and returns the fragment to display
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new OverviewFragment();
        } else if (position == 1){
            return new OldTownFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else if (position == 3) {
            return new TravelFragment();
        } else {
            return new ShopFragment();
        }
        }

    //Method that sets the name of the categorys to show in the tabLayout depending on the position
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position){
            case 0 :
                return context.getString(R.string.overview) ;
            case 1 :
                return context.getString(R.string.sightseeing) ;
            case 2 :
                return context.getString(R.string.eat) ;
            case 3 :
                return context.getString(R.string.travel) ;
            case 4 :
                return context.getString(R.string.shop) ;
            default:
                return null;
        }

    }

    //getCount method defines the number of categorys of the tabLayout
    @Override
    public int getCount() {
        return 5;
    }
}
