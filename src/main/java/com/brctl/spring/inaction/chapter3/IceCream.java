package com.brctl.spring.inaction.chapter3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.brctl.spring.inaction.chapter3.annotations.*;

/**
 * Ice Cream Dessert
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@Component
@Cold
@Creamy
public class IceCream implements Dessert {

    @Override
    public void flavor() {
        System.out.println("ice cream dessert flavor");
    }

}
