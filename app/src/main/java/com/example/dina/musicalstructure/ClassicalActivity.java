package com.example.dina.musicalstructure;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
public class ClassicalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //create an ArrayList called songs  for my classical songs
        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music(getString(R.string.classic_singer1), getString(R.string.classic_song1), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer2), getString(R.string.classic_song2), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer3), getString(R.string.classic_song3), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer4), getString(R.string.classic_song4), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer5), getString(R.string.classic_song5), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer6), getString(R.string.classic_song6), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer7), getString(R.string.classic_song7), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer8), getString(R.string.classic_song8), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer9), getString(R.string.classic_song9), R.drawable.classical_music));
        songs.add(new Music(getString(R.string.classic_singer10), getString(R.string.classic_song10), R.drawable.classical_music));
        // create an instance of MusicAdapter
        MusicAdapter myAdapter = new MusicAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(ClassicalActivity.this, CurrentSong.class);
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



