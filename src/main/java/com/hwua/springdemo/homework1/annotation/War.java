package com.hwua.springdemo.homework1.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 战场
 */
@Configuration
@ComponentScan( basePackages = "com.hwua.springdemo.homework1.annotation")
public class War {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(War.class);
		Infantry infantry = context.getBean(Infantry.class);
		Artillery artillery = context.getBean(Artillery.class);
		infantry.fire();
		artillery.fire();
	}
}
