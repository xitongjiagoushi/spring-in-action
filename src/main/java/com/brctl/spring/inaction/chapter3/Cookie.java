package com.brctl.spring.inaction.chapter3;

import org.springframework.stereotype.Component;

/**
 * Cookie Dessert
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@Component
public class Cookie implements Dessert {

    @Override
    public void flavor() {
        System.out.println("cookie dessert flavor");
    }

}
