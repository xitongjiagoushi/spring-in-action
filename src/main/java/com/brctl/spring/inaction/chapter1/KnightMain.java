package com.brctl.spring.inaction.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author duanxiaoxing
 * @created 2017/12/28
 */
public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
