package com.example.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sample.databinding.RecyclerListCellBinding;

/**
 * Created by other on 2017/10/13.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.BindingViewHolder> {

    private String[] mDataSet;

    public static class BindingViewHolder extends RecyclerView.ViewHolder {

        RecyclerListCellBinding binding;

        public BindingViewHolder(View itemView) {
            super(itemView);
            this.binding = RecyclerListCellBinding.bind(itemView);
        }
    }

    public MainAdapter(String[] dataSet) {
        this.mDataSet = dataSet;
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_cell, parent, false);

        return new BindingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        Users user = new Users();
        user.profile_image_url = "https://randomuser.me/api/portraits/women/" + (55 + position) + ".jpg";
        user.name = this.mDataSet[position];
        holder.binding.setUser(user);
    }

    @Override
    public int getItemCount() {
        return this.mDataSet.length;
    }
}
