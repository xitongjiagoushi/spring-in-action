package com.brctl.spring.inaction.chapter3.config;

import com.brctl.spring.inaction.chapter3.ConfigLocationFlag;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Dessert Java Configuration
 * @author duanxiaoxing
 * @created 2017/12/29
 */
@Configuration
@ComponentScan(basePackageClasses = ConfigLocationFlag.class)
public class DessertConfig {
}
