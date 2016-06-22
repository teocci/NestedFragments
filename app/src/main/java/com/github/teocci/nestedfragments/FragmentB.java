package com.github.teocci.nestedfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by teocci on 6/22/16.
 */
public class FragmentB extends Fragment
{
    private static final String TAG = "FragmentB";

    public FragmentB() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "FragmentContentB Created");
        FragmentC fragmentC = new FragmentC();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.FragmentContentC, fragmentC).commit();
        Log.e(TAG, "FragmentContentC Called");
    }
}
