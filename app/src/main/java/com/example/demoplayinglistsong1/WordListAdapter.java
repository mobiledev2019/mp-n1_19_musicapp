package com.example.demoplayinglistsong1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>{

    class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(@NonNull View itemView, TextView wordItemView, WordListAdapter mAdapter) {
            super(itemView);
            this.wordItemView = wordItemView;
            this.mAdapter = mAdapter;
        }
    }

    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder wordViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
