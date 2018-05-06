package com.example.dina.musicalstructure;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class HipHopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music(getString(R.string.hip_hop_singer1), getString(R.string.hip_hop_song1), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer2), getString(R.string.hip_hop_song2), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer3), getString(R.string.hip_hop_song3), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer4), getString(R.string.hip_hop_song4), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer5), getString(R.string.hip_hop_song5), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer6), getString(R.string.hip_hop_song6), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer7), getString(R.string.hip_hop_song7), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer8), getString(R.string.hip_hop_song8), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer9), getString(R.string.hip_hop_dong9), R.drawable.hip_hop_music));
        songs.add(new Music(getString(R.string.hip_hop_singer10), getString(R.string.hip_hop_song10), R.drawable.hip_hop_music));
        ListView listView = findViewById(R.id.song_list);
        MusicAdapter myAdapter = new MusicAdapter(this, songs);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(HipHopActivity.this, CurrentSong.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
