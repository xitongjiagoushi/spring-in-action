package com.brctl.spring.inaction.chapter4.concern;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Concert
 * @author duanxiaoxing
 * @created 2017/12/30
 */
public class Concert {

    @Autowired
    private Performance performance;


    public void startConcert() {
        performance.perform();
    }

}
