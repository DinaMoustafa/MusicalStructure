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
public class ReggaeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music(getString(R.string.reggae_singer1), getString(R.string.reggae_song1), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer2), getString(R.string.reggae_song2), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer3), getString(R.string.reggae_song3), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer4), getString(R.string.reggae_song4), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer5), getString(R.string.reggae_song5), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer6), getString(R.string.reggae_song6), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer7), getString(R.string.reggae_song7), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer8), getString(R.string.reggae_song8), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer9), getString(R.string.reggae_song9), R.drawable.reggae_music));
        songs.add(new Music(getString(R.string.reggae_singer10), getString(R.string.reggae_song10), R.drawable.reggae_music));
        MusicAdapter myAdapter = new MusicAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(ReggaeActivity.this, CurrentSong.class);
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
