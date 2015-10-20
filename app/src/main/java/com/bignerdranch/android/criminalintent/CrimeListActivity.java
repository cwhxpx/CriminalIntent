package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by cwh on 20/10/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
