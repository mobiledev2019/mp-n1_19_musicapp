package com.example.demoplayinglistsong1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private Context aContext;
    private ArrayList<Song> aListSong;

    public SongAdapter(Context context, ArrayList<Song> aListSong) {
        this.aContext = context;
        this.aListSong = aListSong;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(aContext).
                inflate(R.layout.list_song,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder viewHolder, int i) {
        Song currentSong = aListSong.get(i);
        viewHolder.bindTo(currentSong);
    }

    @Override
    public int getItemCount() {
        return aListSong.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView aTextTitleSong;
        private TextView aTextArtistSong;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.aTextTitleSong = itemView.findViewById(R.id.aTextTitleSong);
            this.aTextArtistSong = itemView.findViewById(R.id.aTextArtist);
        }

        void bindTo(Song currentSong){
            aTextTitleSong.setText(currentSong.getTitle());
            aTextArtistSong.setText(currentSong.getArtist());
        }
    }
}
