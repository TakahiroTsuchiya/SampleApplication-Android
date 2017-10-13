package com.example.sample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by other on 2017/10/13.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ViewHolder(TextView itemView) {
            super(itemView);
            mTextView = itemView;
        }
    }

    public MainAdapter(String[] dataSet) {
        this.mDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_cell_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(this.mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return this.mDataSet.length;
    }
}
