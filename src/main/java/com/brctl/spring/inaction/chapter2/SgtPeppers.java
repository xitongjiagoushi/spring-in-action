package com.brctl.spring.inaction.chapter2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Sgt Peppers
 * @author duanxiaoxing
 * @created 2017/12/28
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    private List<String> tracks = new ArrayList<>();

    public void addTrack(String songName) {
        tracks.add(songName);
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (int i = 0; i < tracks.size(); i++) {
            playTrack(i);
        }
    }


    @Override
    public void playTrack(int trackNumber) {
        System.out.println("now play track " + trackNumber + ": " + tracks.get(trackNumber));
    }


    @Override
    public int getTrackSize() {
        return tracks.size();
    }

}
