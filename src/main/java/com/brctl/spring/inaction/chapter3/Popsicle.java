package com.brctl.spring.inaction.chapter3;

import org.springframework.stereotype.Component;
import com.brctl.spring.inaction.chapter3.annotations.*;

/**
 * Popsicle Dessert
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

    @Override
    public void flavor() {
        System.out.println("popsicle dessert flavor");
    }

}
