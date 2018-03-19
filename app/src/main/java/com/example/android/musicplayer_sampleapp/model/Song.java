package com.example.android.musicplayer_sampleapp.model;

/**
 * Created by Tanaskovic on 3/18/2018.
 */

public class Song {

    private String mName;
    private String mArtist;
    private int mAudioResourceId;

    public Song(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public Song(String mName, String mArtist, int mAudioResourceId) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public void setAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }
}
