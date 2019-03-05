package com.hwua.springdemo.homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 战场
 */
public class War {

	public static void main(String[] args) {
		//读取war.xml配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hwua/springdemo/homework1/war.xml");
		Infantry infantry = (Infantry)context.getBean("infantry");//步兵
		Artillery artillery = (Artillery)context.getBean("artillery");//炮兵
		infantry.fire();
		artillery.fire();
	}
}
