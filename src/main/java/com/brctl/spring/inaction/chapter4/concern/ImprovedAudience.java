package com.brctl.spring.inaction.chapter4.concern;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Improved Audience Advice Ways (@PointCut)
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Aspect
public class ImprovedAudience {

    @SuppressWarnings("unused")
    @Pointcut("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void performance() {}


    @Before("performance()")
    public void takeSeats() {
        System.out.println("audience please take your seats");
    }


    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("audience please silence your cell phones");
    }


    @AfterReturning("performance()")
    public void applause() {
        System.out.println("wow! excellent performance!");
    }


    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("awful performance, i demand refund!");
    }


}
