package com.brctl.spring.inaction.chapter4;

import com.brctl.spring.inaction.chapter4.concern.ConcertConfig;
import com.brctl.spring.inaction.chapter4.concern.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Concert Test
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

    @Autowired
    private Performance performance;


    @Test
    public void startConcert() throws Exception {
        performance.perform();
    }

}
