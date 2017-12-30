package com.brctl.spring.inaction.chapter4;

import com.brctl.spring.inaction.chapter2.CompactDisc;
import com.brctl.spring.inaction.chapter4.disc.DiscConfig;
import com.brctl.spring.inaction.chapter4.disc.TrackPlayCounter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DiscConfig.class)
public class DiscTest {

    private Random random = new Random();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackPlayCounter trackPlayCounter;


    @Test
    public void testTrackCounter() {
        for (int i = 0; i < 10; i++) {
            compactDisc.playTrack(random.nextInt(compactDisc.getTrackSize()));
        }
        // print play times
        for (int i = 0; i < compactDisc.getTrackSize(); i++) {
            System.out.println("track: " + i + ", played: " + trackPlayCounter.getTrackCount(i));
        }
    }

}
