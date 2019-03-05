package com.hwua.springdemo.aop.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/hwua/springdemo/aop/proxy/aop.xml");
		Sleepable sleeper = (Sleepable)ac.getBean("humanProxy");
		sleeper.sleep();
	}

}
