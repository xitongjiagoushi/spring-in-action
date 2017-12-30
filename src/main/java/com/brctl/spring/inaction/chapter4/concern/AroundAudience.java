package com.brctl.spring.inaction.chapter4.concern;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Aspect
public class AroundAudience {


    @Around("execution(** com.brctl.spring.inaction.chapter4.concern.Performance.perform(..))")
    public void aroundPerformance(ProceedingJoinPoint pjp) {
        try {
            System.out.println("audience please take your seats");
            System.out.println("audience please silence your cell phones");
            pjp.proceed();
            System.out.println("wow! excellent performance!");
        } catch (Throwable e) {
            System.out.println("awful performance, i demand refund!");
        }
    }


}
