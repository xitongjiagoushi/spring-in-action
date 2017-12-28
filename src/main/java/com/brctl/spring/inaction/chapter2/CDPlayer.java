package com.brctl.spring.inaction.chapter2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * CD Player
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class CDPlayer {

    @Autowired
    private CompactDisc compactDisc;


    public void playDisc() {
        compactDisc.play();
    }

}
