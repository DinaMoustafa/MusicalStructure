package com.example.dina.musicalstructure;
import android.widget.ImageView;
//Custom class Music
public class Music {
    //Here we have two states: ArtistName & SongName
    private String mArtistName;
    private String mSongName;
    private int mImageResourceId;


    // Music constructor for initializing the two states
    public Music(String artistName, String songName, int imageResourceId) {

        this.mArtistName = artistName;
        this.mSongName = songName;
        this.mImageResourceId = imageResourceId;
    }


    // getter method for mArtistName
    public String getmArtistName() {

        return mArtistName;
    }


    // getter method for mSongName
    public String getmSongName() {

        return mSongName;
    }


    public int getmImageResourceId() {

        return mImageResourceId;
    }
}
