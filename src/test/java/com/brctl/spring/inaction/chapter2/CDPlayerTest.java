package com.brctl.spring.inaction.chapter2;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * CD Player Test
 * @author duanxiaoxing
 * @created 2017/12/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

//    deprecated StandardOutputStreamLog
//    @Rule
//    public final StandardOutputStreamLog systemOutRule = new StandardOutputStreamLog();

    @Inject  // alternative to @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc compactDisc;


    @Test
    public void testCompactDiscNotNull() {
        Assert.assertNotNull(compactDisc);
    }


    @Test
    public void testPlay() {
        mediaPlayer.playDisc();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", systemOutRule.getLog());
    }

}
