package com.example.dina.musicalstructure;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;
public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Context context, ArrayList<Music> songs) {

        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Music currentSong = getItem(position);
        TextView artistName = listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getmArtistName());
        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getmSongName());
        ImageView albumImage = listItemView.findViewById(R.id.image);
        albumImage.setImageResource(currentSong.getmImageResourceId());
        return listItemView;
    }
}
