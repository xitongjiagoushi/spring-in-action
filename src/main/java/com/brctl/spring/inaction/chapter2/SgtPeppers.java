package com.brctl.spring.inaction.chapter2;

import org.springframework.stereotype.Component;

/**
 * Sgt Peppers
 * @author duanxiaoxing
 * @created 2017/12/28
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
