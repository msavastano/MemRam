package com.mikesavastano.memram;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by michael on 11/27/14.
 */
public class MemRamFragment extends Fragment{

    //private View memRamView;
    private static final String TAG = "MemRam";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.i(TAG, getClass().getSimpleName() + ":entered onCreateView");
        return inflater.inflate(R.layout.memram_fragment_layout, container, false);
       // memRamView = frag_view.findViewById(R.id.gameGrid);

    }
}
