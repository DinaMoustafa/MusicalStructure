package com.example.dina.musicalstructure;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
public class CurrentSong extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ImageButton musicHome = findViewById(R.id.librar_music_ic);
        musicHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(CurrentSong.this, MainActivity.class));
            }
        });
        ImageButton playingButton = findViewById(R.id.playing_sound);
        playingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(CurrentSong.this, R.string.play, Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton pausingButton = findViewById(R.id.pausing_sound);
        pausingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(CurrentSong.this, R.string.pause, Toast.LENGTH_SHORT).show();
            }
        });
        ImageButton stoppingButton = findViewById(R.id.stopping_sound);
        stoppingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(CurrentSong.this, R.string.stop, Toast.LENGTH_SHORT).show();
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
