package com.example.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by other on 2017/10/05.
 */
public class MainFragment extends Fragment {

    protected String[] mDataset = {"data-01", "data-02", "data-03", "data-04", "data-05", "data-06", "data-07", "data-08", "data-09",
            "data-10", "data-11", "data-12", "data-13", "data-14", "data-15", "data-16", "data-17", "data-18", "data-19", "data-20"};

    private RecyclerView mRecyclerView;
    private MainAdapter mMainAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        mMainAdapter = new MainAdapter(mDataset);
        mRecyclerView.setAdapter(mMainAdapter);

        return rootView;
    }
}
