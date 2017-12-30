package com.brctl.spring.inaction.chapter4.disc;

import com.brctl.spring.inaction.chapter2.CompactDisc;
import com.brctl.spring.inaction.chapter2.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Configuration
@EnableAspectJAutoProxy
public class DiscConfig {

    @Bean
    public CompactDisc compactDisc() {
        SgtPeppers sgtPeppers = new SgtPeppers();
        sgtPeppers.addTrack("merry christmas");
        sgtPeppers.addTrack("happy new year");
        sgtPeppers.addTrack("happy birthday");
        sgtPeppers.addTrack("always young");
        sgtPeppers.addTrack("yesterday once more");
        return sgtPeppers;
    }


    @Bean
    public TrackPlayCounter trackPlayCounter() {
        return new TrackPlayCounter();
    }

}
