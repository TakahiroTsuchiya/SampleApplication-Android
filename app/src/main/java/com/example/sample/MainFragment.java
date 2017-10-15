package com.example.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sample.api.qiita.QiitaService;
import com.example.sample.api.qiita.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by other on 2017/10/05.
 */

public class MainFragment extends Fragment {

    private String TAG = getClass().getSimpleName();

    protected List<Users> usersList;

    private RecyclerView mRecyclerView;
    private MainAdapter mMainAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mRecyclerView = rootView.findViewById(R.id.recyclerView);
        RecyclerListCellDecoration decoration = new RecyclerListCellDecoration(ContextCompat.getDrawable(mRecyclerView.getContext(), R.drawable.divider));
        mRecyclerView.addItemDecoration(decoration);

        // TODO: out resource. need AsyncTask ?
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(QiitaService.END_POINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        QiitaService service = retrofit.create(QiitaService.class);

        service.getUsers().enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {

                if (response.isSuccessful()) {

                    usersList = response.body();

                    mMainAdapter = new MainAdapter(usersList) {
                        @Override
                        protected void onClicked(int position) {
                            super.onClicked(position);
                            Toast.makeText(getContext(), "[" + position + "]", Toast.LENGTH_SHORT).show();
                        }
                    };

                    mRecyclerView.setAdapter(mMainAdapter);
                } else {
                    // TODO: error handling.
                    Log.d(TAG, "onResponse - else");
                }
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                // TODO: error handling.
                Log.d(TAG, "onFailure");
            }
        });

        return rootView;
    }
}
