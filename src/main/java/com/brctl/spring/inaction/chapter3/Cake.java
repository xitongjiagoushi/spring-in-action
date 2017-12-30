package com.brctl.spring.inaction.chapter3;

import com.brctl.spring.inaction.chapter3.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

/**
 * Cake Dessert
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@Component
//@Primary  // can be used here
public class Cake implements Dessert {

    @Override
    public void flavor() {
        System.out.println("cake dessert flavor");
    }

}
