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

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.BindingViewHolder> {

    private List<Users> usersList;

    public static class BindingViewHolder extends RecyclerView.ViewHolder {

        RecyclerListCellBinding binding;

        public BindingViewHolder(View itemView) {
            super(itemView);
            this.binding = RecyclerListCellBinding.bind(itemView);
        }
    }

    public ListAdapter(List<Users> dataSet) {
        this.usersList = dataSet;
    }

    protected void onClicked(int position) {
    }

    @Override
    public BindingViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_cell, parent, false);

        final BindingViewHolder holder = new BindingViewHolder(view);

        holder.binding.recyclerViewBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int position = holder.getAdapterPosition();
                onClicked(position);
            }
        });
        return holder;
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
