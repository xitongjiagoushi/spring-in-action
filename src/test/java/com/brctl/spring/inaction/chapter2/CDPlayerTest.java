package com.brctl.spring.inaction.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CD Player Test
 * @author duanxiaoxing
 * @created 2017/12/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;


    @Test
    public void testCompactDiscNotNull() {
        Assert.assertNotNull(compactDisc);
    }

}
