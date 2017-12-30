package com.brctl.spring.inaction.chapter4.concern;

/**
 * Audience Aspect config In XML instead of Annotations
 * @author duanxiaoxing
 * @created 2017/12/30
 */
public class XMLAudience {

    public void takeSeats() {
        System.out.println("audience please take your seats(in xml)");
    }


    public void silenceCellPhones() {
        System.out.println("audience please silence your cell phones(in xml)");
    }


    public void applause() {
        System.out.println("wow! excellent performance!(in xml)");
    }


    public void demandRefund() {
        System.out.println("awful performance, i demand refund!(in xml)");
    }

}
