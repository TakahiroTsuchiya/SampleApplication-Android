package com.example.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sample.api.qiita.model.Users;
import com.example.sample.databinding.RecyclerListCellBinding;

import java.util.List;

/**
 * Created by other on 2017/10/13.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.BindingViewHolder> {

    private List<Users> usersList;

    public static class BindingViewHolder extends RecyclerView.ViewHolder {

        RecyclerListCellBinding binding;

        public BindingViewHolder(View itemView) {
            super(itemView);
            this.binding = RecyclerListCellBinding.bind(itemView);
        }
    }

    public MainAdapter(List<Users> dataSet) {
        this.usersList = dataSet;
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_cell, parent, false);

        return new BindingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        holder.binding.setUser(this.usersList.get(position));
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;
        if (usersList != null) {
            itemCount = usersList.size();
        }
        return itemCount;
    }
}
