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
public class JazzActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music(getString(R.string.jazz_singer1), getString(R.string.jazz_song1), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer2), getString(R.string.jazz_song2), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer3), getString(R.string.jazz_song3), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer4), getString(R.string.jazz_song4), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer5), getString(R.string.jazz_song5), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer6), getString(R.string.jazz_song6), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer7), getString(R.string.jazz_song7), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer8), getString(R.string.jazz_song8), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer9), getString(R.string.jazz_song9), R.drawable.jazz_music));
        songs.add(new Music(getString(R.string.jazz_singer10), getString(R.string.jazz_song10), R.drawable.jazz_music));
        MusicAdapter myAdapter = new MusicAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(JazzActivity.this, CurrentSong.class);
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
