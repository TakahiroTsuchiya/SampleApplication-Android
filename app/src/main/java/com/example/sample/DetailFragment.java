package com.example.sample;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sample.api.qiita.model.Users;
import com.example.sample.databinding.FragmentDetailBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailFragment extends Fragment {

    private String TAG = getClass().getSimpleName();

    public DetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        FragmentDetailBinding bind = FragmentDetailBinding.bind(rootView);

        Intent intent = getActivity().getIntent();

        if (intent != null) {

            String userId = intent.getStringExtra("userId");

            Users user = new Users();

            user.name = userId;
            user.description = "";

            bind.setUser(user);
        }

        return rootView;
    }
}
