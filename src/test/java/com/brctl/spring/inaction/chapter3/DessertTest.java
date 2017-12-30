package com.brctl.spring.inaction.chapter3;

import com.brctl.spring.inaction.chapter3.config.DessertConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.brctl.spring.inaction.chapter3.annotations.*;

import javax.annotation.Resource;

/**
 * Dessert Test
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

//    way_1:
    @Autowired
    @Cold
    @Creamy
    private Dessert dessert;

//    way_2:
//    @Resource(name = "iceCream")

//    way_3:
//    @Autowired
//    @Qualifier(value = "iceCream")
//    private Dessert dessert;

    @Test
    public void testQualifierInjection() {
        dessert.flavor();
        Assert.assertEquals("ice cream dessert flavor\n", systemOutRule.getLog());
    }

}
