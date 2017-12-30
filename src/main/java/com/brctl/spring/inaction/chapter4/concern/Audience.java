package com.brctl.spring.inaction.chapter4.concern;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Aspect
public class Audience {


    @Before("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("audience please take your seats");
    }


    @Before("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("audience please silence your cell phones");
    }


    @AfterReturning("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void applause() {
        System.out.println("wow! excellent performance!");
    }


    @AfterThrowing("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("awful performance, i demand refund!");
    }

}
