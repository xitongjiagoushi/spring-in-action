package com.brctl.spring.inaction.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CD Player
 * @author duanxiaoxing
 * @created 2017/12/28
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc compactDisc;


    public void playDisc() {
        compactDisc.play();
    }

}
