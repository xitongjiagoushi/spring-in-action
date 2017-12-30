package com.brctl.spring.inaction.chapter4.concern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author duanxiaoxing
 * @created 2017/12/30
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {


//    @Bean
//    public ImprovedAudience improvedAudience() {
//        return new ImprovedAudience();
//    }


    @Bean
    public AroundAudience aroundAudience() {
        return new AroundAudience();
    }

    @Bean
    public JayChouPerformance performance() {
        return new JayChouPerformance();
    }
}
