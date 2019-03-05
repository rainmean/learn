package com.hwua.springdemo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactory {
	
	private static StaticFactory staticFactory=null;
	
	//私有化构造方法
	private StaticFactory() {
	}
	
	//提供给外部获取实例的方法
	public static StaticFactory getInstance(){
		if(staticFactory==null){
			staticFactory = new StaticFactory();
		}
		return staticFactory;
	}
	
	public void show(){
		System.out.println("调用了StaticFactory的show()方法！！！");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		StaticFactory factory = (StaticFactory)context.getBean("staticFactory");
		factory.show();
	}
}
